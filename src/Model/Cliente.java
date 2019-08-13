
package Model;
public class Cliente {
    private String rut;
    private String nombre;
    private String giro;
    private String email;
    private int fono;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String giro, String email, int fono, String direccion, String comuna) {
        this.rut = rut;
        this.nombre = nombre;
        this.giro = giro;
        this.email = email;
        this.fono = fono;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
}
