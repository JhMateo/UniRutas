package main.java.com.unirutas.controllers;

import main.java.com.unirutas.database.DatabaseManager;
import main.java.com.unirutas.models.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioController {
    public void marcarAlerta(Alerta alerta, Usuario usuario) {
        // TODO: Implementar la lógica para añadirlo en la DB
        if (usuario != null) {
            usuario.marcarAlertaLeida(alerta);
            System.out.println("main.java.com.unirutas.models.Alerta marcada como leída por el usuario: " + usuario.getNombre());
        } else {
            System.out.println("Error: main.java.com.unirutas.models.Usuario no encontrado.");
        }
    }

    public void suscribirServicio(Estudiante estudiante, Servicio servicio) {
        // TODO: Implementar la lógica para añadirlo en la DB
        if (estudiante != null && servicio != null) {
            estudiante.suscribirAServicio(servicio);
            System.out.println(estudiante.getNombre() + " se ha suscrito al servicio " + servicio);
        } else {
            System.out.println("Error: main.java.com.unirutas.models.Estudiante o servicio no encontrados.");
        }
    }

    public void crearUsuario(Usuario usuario, DatabaseManager dbManager) {
        try {
            dbManager.startTransaction();

            if (usuario instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) usuario;
                if (existeEstudiante(estudiante, dbManager)) {
                    System.out.println("El estudiante ya existe en la base de datos.");
                    return; // No se realiza la inserción si ya existe
                }

                String insertSQL = "INSERT INTO Student (code, name, username, password) VALUES (?, ?, ?, ?)";
                int rowsAffected = dbManager.executeUpdate(insertSQL, estudiante.getCodigo(), estudiante.getNombre(), estudiante.getNombreUsuario(), estudiante.getContrasena());

                if (rowsAffected > 0) {
                    dbManager.commitTransaction();
                    System.out.println("main.java.com.unirutas.models.Estudiante creado exitosamente.");
                } else {
                    dbManager.rollbackTransaction();
                    System.out.println("La creación del estudiante falló.");
                }
            } else if (usuario instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) usuario;
                if (existeAdministrativo(administrativo, dbManager)) {
                    System.out.println("El administrativo ya existe en la base de datos.");
                    return; // No se realiza la inserción si ya existe
                }

                String insertSQL = "INSERT INTO Administrative (code, name, username, password) VALUES (?, ?, ?, ?)";
                int rowsAffected = dbManager.executeUpdate(insertSQL, administrativo.getCodigo(), administrativo.getNombre(), administrativo.getNombreUsuario(), administrativo.getContrasena());

                if (rowsAffected > 0) {
                    dbManager.commitTransaction();
                    System.out.println("main.java.com.unirutas.models.Administrativo creado exitosamente.");
                } else {
                    dbManager.rollbackTransaction();
                    System.out.println("La creación del administrativo falló.");
                }
            } else {
                // Manejar otros tipos de usuarios aquí si es necesario
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                dbManager.rollbackTransaction();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void eliminarUsuario(Usuario usuario, DatabaseManager dbManager) {
        try {
            dbManager.startTransaction();

            String tableName = (usuario instanceof Estudiante) ? "Student" : "Administrative";

            String deleteSQL = "DELETE FROM " + tableName + " WHERE code = ?";
            int rowsAffected = dbManager.executeUpdate(deleteSQL, usuario.getCodigo());

            if (rowsAffected > 0) {
                dbManager.commitTransaction();
                System.out.println(usuario.getClass().getSimpleName() + " eliminado exitosamente.");
            } else {
                dbManager.rollbackTransaction();
                System.out.println("La eliminación de " + usuario.getClass().getSimpleName() + " falló. El usuario no existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                dbManager.rollbackTransaction();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void actualizarUsuario(Usuario usuario, DatabaseManager dbManager) {
        try {
            dbManager.startTransaction();

            String tableName = (usuario instanceof Estudiante) ? "Student" : "Administrative";

            String updateSQL = "UPDATE " + tableName + " SET name = ?, username = ?, password = ? WHERE code = ?";
            int rowsAffected = dbManager.executeUpdate(updateSQL, usuario.getNombre(), usuario.getNombreUsuario(), usuario.getContrasena(), usuario.getCodigo());

            if (rowsAffected > 0) {
                dbManager.commitTransaction();
                System.out.println(usuario.getClass().getSimpleName() + " actualizado exitosamente.");
            } else {
                dbManager.rollbackTransaction();
                System.out.println("La actualización de " + usuario.getClass().getSimpleName() + " falló. El usuario no existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                dbManager.rollbackTransaction();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean existeEstudiante(Estudiante estudiante, DatabaseManager dbManager) throws SQLException {
        String selectSQL = "SELECT * FROM Student WHERE username = ?";
        ResultSet resultSet = dbManager.executeQuery(selectSQL, estudiante.getNombreUsuario());
        return resultSet.next();
    }

    private boolean existeAdministrativo(Administrativo administrativo, DatabaseManager dbManager) throws SQLException {
        String selectSQL = "SELECT * FROM Administrative WHERE username = ?";
        ResultSet resultSet = dbManager.executeQuery(selectSQL, administrativo.getNombreUsuario());
        return resultSet.next();
    }

}


