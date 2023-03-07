
import java.util.ArrayList;


public class Alumno extends Usuario{
    private ArrayList<Clase> clasesmatr = new ArrayList();
    private int numcuenta;
    private String carrera, rol;
    

    public Alumno() {
    }

    public Alumno(int numcuenta, String carrera, String rol, String nombreusuario, String contra, String nombre) {
        super(nombreusuario, contra, nombre);
        this.numcuenta = numcuenta;
        this.carrera = carrera;
        this.rol = rol;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Clase> getClases() {
        return clasesmatr;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clasesmatr = clases;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
