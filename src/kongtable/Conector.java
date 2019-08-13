package kongtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {

    String url = "C:\\Users\\Public\\bdKongtable.db";
    Connection connect;

    public Connection connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado");
                //crearTabla();
                return connect;
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
        return connect;
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS cliente(\n"
                + "	rut varchar(15) PRIMARY KEY,\n"
                + "	nombre varchar(40) NOT NULL,\n"
                + "	giro varchar(40) NOT NULL,\n"
                + "	email varchar(20) NOT NULL,\n"
                + "	fono integer NOT NULL,\n"
                + "	direccion varchar(40) NOT NULL,\n"
                + "	comuna varchar(40) NOT NULL);";

        try (
                Statement stmt = connect.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla creada :D");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
