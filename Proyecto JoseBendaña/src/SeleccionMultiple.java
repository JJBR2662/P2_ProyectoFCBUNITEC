
import java.util.ArrayList;


public class SeleccionMultiple extends Pregunta{
    private ArrayList<String> respdisp = new ArrayList();
    private ArrayList<String> respcorrectas = new ArrayList();
    private ArrayList<String> respdadas = new ArrayList();

    public SeleccionMultiple() {
    }

    public SeleccionMultiple(String pregunta) {
        super(pregunta);
    }

    public ArrayList<String> getRespdisp() {
        return respdisp;
    }

    public void setRespdisp(ArrayList<String> respdisp) {
        this.respdisp = respdisp;
    }

    public ArrayList<String> getRespcorrectas() {
        return respcorrectas;
    }

    public void setRespcorrectas(ArrayList<String> respcorrectas) {
        this.respcorrectas = respcorrectas;
    }

    public ArrayList<String> getRespdadas() {
        return respdadas;
    }

    public void setRespdadas(ArrayList<String> respdadas) {
        this.respdadas = respdadas;
    }

    @Override
    public String toString() {
        return "SeleccionMultiple{" + "respdisp=" + respdisp + ", respcorrectas=" + respcorrectas + ", respdadas=" + respdadas + '}';
    }
    
    
}
