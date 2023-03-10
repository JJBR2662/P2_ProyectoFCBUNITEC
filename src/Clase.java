
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

class Clase implements Serializable{

    private Maestro mister;
    private ArrayList<Alumno> alumnosreciben = new ArrayList();
    private ArrayList<Tarea> tareas = new ArrayList();
    private ArrayList<Examen> examenes = new ArrayList();
    private int id, uv, semestre, periodo;
    private Date anio;
    private String nombreclase, hora;

    public Clase() {
    }

    public Clase(int id, int uv, int semestre, int periodo, Date anio, String nombreclase, String hora) {
        this.id = id;
        this.uv = uv;
        this.semestre = semestre;
        this.periodo = periodo;
        this.anio = anio;
        this.nombreclase = nombreclase;
        this.hora = hora;
    }

    public Maestro getMister() {
        return mister;
    }

    public void setMister(Maestro mister) {
        this.mister = mister;
    }

    
//    public ArrayList<Maestro> getMaestrosdanclase() {
//        return maestrosdanclase;
//    }
//
//    public void setMaestrosdanclase(ArrayList<Maestro> maestrosdanclase) {
//        this.maestrosdanclase = maestrosdanclase;
//    }

    public ArrayList<Alumno> getAlumnosreciben() {
        return alumnosreciben;
    }

    public void setAlumnosreciben(ArrayList<Alumno> alumnosreciben) {
        this.alumnosreciben = alumnosreciben;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return id + ": " + nombreclase;
    }

}
