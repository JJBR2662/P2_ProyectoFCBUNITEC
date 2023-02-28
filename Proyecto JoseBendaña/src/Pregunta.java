
class Pregunta {
    protected String pregunta;
    // metodo poli para revisar;

    public Pregunta() {
    }

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return pregunta ;
    }
    
    
}
