
import java.util.ArrayList;


public class Nota {
    private ArrayList<Integer> calificaciones = new ArrayList();
    private ArrayList<Alumno>  listadealumnos= new ArrayList();

    public Nota() {
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList<Alumno> getListadealumnos() {
        return listadealumnos;
    }

    public void setListadealumnos(ArrayList<Alumno> listadealumnos) {
        this.listadealumnos = listadealumnos;
    }

    @Override
    public String toString() {
        return "Nota{" + "calificaciones=" + calificaciones + ", listadealumnos=" + listadealumnos + '}';
    }
    
    
}
