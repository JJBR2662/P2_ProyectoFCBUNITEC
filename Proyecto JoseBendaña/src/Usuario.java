
public class Usuario {
    protected String nombreusuario;
    protected String contra;
    protected String nombre;

    public Usuario() {
    }

    public Usuario(String nombreusuario, String contra, String nombre) {
        this.nombreusuario = nombreusuario;
        this.contra = contra;
        this.nombre = nombre;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombreusuario ;
    }
    
    public String todo() {
        return "Usuario{" + "nombreusuario=" + nombreusuario + ", contra=" + contra + ", nombre=" + nombre + '}';
    }
}
