package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import kongtable.Conector;

public class ClienteDAO {

    Connection conne;

    public boolean crearCliente(Cliente cliente) {
        Conector con = new Conector();
        conne = con.connect();
        try {
            PreparedStatement st = conne.prepareStatement("insert into cliente (rut, nombre, giro, email, fono, direccion, comuna) values (?,?,?,?,?,?,?)");
            st.setString(1, cliente.getRut());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getGiro());
            st.setString(4, cliente.getEmail());
            st.setInt(5, cliente.getFono());
            st.setString(6, cliente.getDireccion());
            st.setString(7, cliente.getComuna());
            st.execute();
            JOptionPane.showMessageDialog(null, "Agregado exitósamente");
            conne.close();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
    
    public ArrayList<Cliente> mostrarTodosClientes(){
        Conector con = new Conector();
        ArrayList<Cliente> lista = new ArrayList<>();
        conne = con.connect();
        try {
            PreparedStatement st = conne.prepareStatement("select * from cliente");
            ResultSet result = st.executeQuery();
            while (result.next()) {
                Cliente climostrar = new Cliente();
                climostrar.setRut(result.getString("rut"));
                climostrar.setNombre(result.getString("nombre"));
                climostrar.setGiro(result.getString("giro"));
                climostrar.setEmail(result.getString("email"));
                climostrar.setFono(result.getInt("fono"));
                climostrar.setDireccion(result.getString("direccion"));
                climostrar.setComuna(result.getString("comuna"));

                System.out.println("Datos guardados");
                lista.add(climostrar);
            }
            conne.close();
            return lista;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return lista;
    }
}
