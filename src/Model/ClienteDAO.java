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
            PreparedStatement st = conne.prepareStatement("INSERT INTO cliente (rut, nombre, giro, email, fono, direccion, comuna) VALUES (?,?,?,?,?,?,?)");
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
            return false;
        }
    }

    public Cliente mostrarCliente(String rut) {
        Conector con = new Conector();
        Cliente cliente = new Cliente();
        conne = con.connect();
        try {
            PreparedStatement st = conne.prepareStatement("SELECT * FROM cliente WHERE rut = ?");
            st.setString(1, rut);
            ResultSet result = st.executeQuery();
            while (result.next()) {
                cliente.setRut(result.getString("rut"));
                cliente.setNombre(result.getString("nombre"));
                cliente.setGiro(result.getString("giro"));
                cliente.setEmail(result.getString("email"));
                cliente.setFono(result.getInt("fono"));
                cliente.setDireccion(result.getString("direccion"));
                cliente.setComuna(result.getString("comuna"));
                System.out.println("Dato encontrado");
            }
            conne.close();
            return cliente;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public ArrayList<Cliente> mostrarTodosClientes() {
        Conector con = new Conector();
        ArrayList<Cliente> lista = new ArrayList<>();
        conne = con.connect();
        try {
            PreparedStatement st = conne.prepareStatement("SELECT * FROM cliente");
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
            return null;
        }
    }

    public boolean editarCliente(Cliente cliente) {
        Conector con = new Conector();
        conne = con.connect();
        String sql = "UPDATE cliente SET nombre = ?, giro = ?, "
                + "email = ?, fono = ?, direccion = ?, comuna = ? "
                + "WHERE rut = ?";
        try {
            PreparedStatement st = conne.prepareStatement(sql);
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getGiro());
            st.setString(3, cliente.getEmail());
            st.setInt(4, cliente.getFono());
            st.setString(5, cliente.getDireccion());
            st.setString(6, cliente.getComuna());

            st.setString(7, cliente.getRut());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado exitósamente");
            conne.close();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(String rut) {
        Conector con = new Conector();
        conne = con.connect();
        String sql = "DELETE FROM cliente WHERE rut = ?";
        try {
            PreparedStatement st = conne.prepareStatement(sql);
            st.setString(1, rut);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente");
            conne.close();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
}
