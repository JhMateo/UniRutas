import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioController {
    public void marcarAlerta(Alerta alerta, Usuario usuario) {
        // Revisar
        if (usuario != null) {
            usuario.marcarAlertaLeida(alerta);
            System.out.println("Alerta marcada como leída por el usuario: " + usuario.getNombre());
        } else {
            System.out.println("Error: Usuario no encontrado.");
        }
    }

    public void suscribirServicio(Estudiante estudiante, Servicio servicio) {
        // TODO: Implementa la lógica para que un estudiante se suscriba a un servicio
        if (estudiante != null && servicio != null) {
            estudiante.suscribirAServicio(servicio);
            System.out.println(estudiante.getNombre() + " se ha suscrito al servicio " + servicio);
        } else {
            System.out.println("Error: Estudiante o servicio no encontrados.");
        }
    }

    public void crearUsuario(Usuario usuario, DatabaseManager dbManager) {
        try {
            dbManager.startTransaction();

            String tableName = (usuario instanceof Estudiante) ? "Student" : "Administrative";

            // Verificar si el usuario ya existe
            String checkExistenceSQL = "SELECT COUNT(*) FROM " + tableName + " WHERE code = ?";
            ResultSet userExist = dbManager.executeQuery(checkExistenceSQL, usuario.getCodigo());

            if (userExist.next()) {
                System.out.println(usuario.getClass().getSimpleName() + " con código " + usuario.getCodigo() + " ya existe en la base de datos.");
            } else {
                // Si no existe, proceder con la inserción
                String insertSQL = "INSERT INTO " + tableName + " (code, name, username, password) VALUES (?, ?, ?, ?)";
                int rowsAffected = dbManager.executeUpdate(insertSQL, usuario.getCodigo(), usuario.getNombre(), usuario.getNombreUsuario(), usuario.getContrasena());

                if (rowsAffected > 0) {
                    dbManager.commitTransaction();
                    System.out.println(usuario.getClass().getSimpleName() + " creado exitosamente.");
                } else {
                    dbManager.rollbackTransaction();
                    System.out.println("La creación de " + usuario.getClass().getSimpleName() + " falló.");
                }
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


}


