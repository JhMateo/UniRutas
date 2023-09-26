import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
        try {
            DatabaseManager dbManager = new DatabaseManager();
            dbManager.connect();

            UsuarioController usuarioController = new UsuarioController();

            // Crear un estudiante
            Estudiante estudiante = new Estudiante("Pablo Bobadillo", "160004331", "psbobadilla", "123");
            usuarioController.crearUsuario(estudiante, dbManager);

            // Crear un administrativo
            Administrativo administrativo = new Administrativo("Kevin Martinez", "160004314", "ksmartinez", "321");
            usuarioController.crearUsuario(administrativo, dbManager);

            // Actualizar un estudiante (por ejemplo, cambiar su contraseña)
            estudiante.cambiarContrasena("555");
            usuarioController.actualizarUsuario(estudiante, dbManager);

            // Actualizar un administrativo (por ejemplo, cambiar su nombre de usuario)
            administrativo.cambiarContrasena("999");
            usuarioController.actualizarUsuario(administrativo, dbManager);

            // Eliminar un estudiante
            usuarioController.eliminarUsuario(estudiante, dbManager);

            // Eliminar un administrativo
            usuarioController.eliminarUsuario(administrativo, dbManager);

            dbManager.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
