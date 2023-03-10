
import java.util.ArrayList;
import java.util.Date;


class Examen {
    private ArrayList<Pregunta> Preguntas = new ArrayList();
    private ArrayList<Nota> notasdeexamen = new ArrayList();
    private Date fecha, tiempo, hora;

    public Examen() {
    }

    public Examen(Date fecha, Date hora, Date tiempo) {
        this.fecha = fecha;
        this.hora = hora;
        this.tiempo = tiempo;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> Preguntas) {
        this.Preguntas = Preguntas;
    }

    public ArrayList<Nota> getNotasdeexamen() {
        return notasdeexamen;
    }

    public void setNotasdeexamen(ArrayList<Nota> notasdeexamen) {
        this.notasdeexamen = notasdeexamen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Examen{" + "Preguntas=" + Preguntas + ", notasdeexamen=" + notasdeexamen + ", fecha=" + fecha + ", hora=" + hora + ", tiempo=" + tiempo + '}';
    }
    
    
}
