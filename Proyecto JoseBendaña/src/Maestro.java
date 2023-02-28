
import java.util.ArrayList;


public class Maestro extends Usuario{
    private ArrayList<Clase> clasesense = new ArrayList();
    private int id;
    private String profesion, rol;
    private double sueldo;

    public Maestro() {
    }

    public Maestro(int id, String profesion, String rol, double sueldo, String nombreusuario, String contra, String nombre) {
        super(nombreusuario, contra, nombre);
        this.id = id;
        this.profesion = profesion;
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public ArrayList<Clase> getClasesense() {
        return clasesense;
    }

    public void setClasesense(ArrayList<Clase> clasesense) {
        this.clasesense = clasesense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Maestro{" +super.todo()+ "clasesense=" + clasesense + ", id=" + id + ", profesion=" + profesion + ", rol=" + rol + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
    
}
