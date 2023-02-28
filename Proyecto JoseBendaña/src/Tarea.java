
import java.util.ArrayList;
import java.util.Date;

class Tarea {
    private ArrayList<Nota> notasdealumnos = new ArrayList();
    private String tipodefile;
    private Date fechadeentrega;

    public Tarea() {
    }

    public Tarea(String tipodefile, Date fechadeentrega) {
        this.tipodefile = tipodefile;
        this.fechadeentrega = fechadeentrega;
    }

    public ArrayList<Nota> getNotasdealumnos() {
        return notasdealumnos;
    }

    public void setNotasdealumnos(ArrayList<Nota> notasdealumnos) {
        this.notasdealumnos = notasdealumnos;
    }

    public String getTipodefile() {
        return tipodefile;
    }

    public void setTipodefile(String tipodefile) {
        this.tipodefile = tipodefile;
    }

    public Date getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(Date fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    @Override
    public String toString() {
        return "Tarea{" + "notasdealumnos=" + notasdealumnos + ", tipodefile=" + tipodefile + ", fechadeentrega=" + fechadeentrega + '}';
    }
    
    
}
