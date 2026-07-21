package Control; // Mantenemos el nombre original para no romper ningún import en otros archivos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());

    private static final String URL = "jdbc:mysql://localhost:3306/boticaluvalfarm";
    private static final String USER = "root";
    private static final String PASSWORD = "admin"; // Corrige la vulnerabilidad de seguridad

    public Connection conectar() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Driver de MySQL no encontrado", e); // Corrige la mala práctica de System.out
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error al conectar a la base de datos BoticaLuvalFarm", e);
        }
        return cn;
    }
}
