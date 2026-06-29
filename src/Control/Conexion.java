package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    // Esta variable guardará el estado de la conexión
    Connection con;

    public Connection conectar() {
        // 1. Datos de la conexión (Usamos el puerto 3307 de XAMPP)
        String db = "botica_luvalfarm";
        String url = "jdbc:mysql://localhost:3307/" + db;
        String user = "root";
        String pass = ""; // Por defecto XAMPP no tiene contraseña

        try {
            // 2. Cargar el Driver que acabas de agregar a las librerías
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 3. Establecer la conexión
            con = DriverManager.getConnection(url, user, pass);
            
            // Mensaje opcional para saber que funcionó (puedes borrarlo luego)
            System.out.println("Conexión Exitosa a " + db);
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el Driver JAR");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return con;
    }
}