
public class VerdaderoFalso extends Pregunta{
    private boolean respcorrecta;
    private boolean respactual;

    public VerdaderoFalso() {
    }

    public VerdaderoFalso(boolean respcorrecta, boolean respactual, String pregunta) {
        super(pregunta);
        this.respcorrecta = respcorrecta;
        this.respactual = respactual;
    }

    public boolean isRespcorrecta() {
        return respcorrecta;
    }

    public void setRespcorrecta(boolean respcorrecta) {
        this.respcorrecta = respcorrecta;
    }

    public boolean isRespactual() {
        return respactual;
    }

    public void setRespactual(boolean respactual) {
        this.respactual = respactual;
    }

    @Override
    public String toString() {
        return "VerdaderoFalso{" + "respcorrecta=" + respcorrecta + ", respactual=" + respactual + '}';
    }
    
    
}
