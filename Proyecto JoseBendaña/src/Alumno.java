
import java.util.ArrayList;


public class Alumno extends Usuario{
    private ArrayList<Clase> clasesmatr = new ArrayList();
    private int numcuenta;
    private String carrera, rol;
    

    public Alumno() {
    }

    public Alumno(String nombreusuario, String contra, String nombre) {
        super(nombreusuario, contra, nombre);
    }

    public ArrayList<Clase> getClases() {
        return clasesmatr;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clasesmatr = clases;
    }

    @Override
    public String toString() {
        return super.todo()+"Alumno{" + "clases=" + clasesmatr + '}';
    }
    
    
}
