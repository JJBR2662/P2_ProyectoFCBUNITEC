
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class AdministrarClases{
    private File archivo;
    private ArrayList<Clase> clases = new ArrayList();
    
    private static final long serialVersionUID = 266226622662L;

    public AdministrarClases(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "AdministrarClases{" + "archivo=" + archivo + ", clases=" + clases + '}';
    }
    
    public void SetClase(Clase c){
        clases.add(c);
    }
    
    public void CargarArchivo(){
        try {
            clases = new ArrayList();
            Clase clase;
            if (archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((clase = (Clase) objeto.readObject())!=null){
                        clases.add(clase);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void EscribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Clase c : clases) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
