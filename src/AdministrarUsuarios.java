
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AdministrarUsuarios{

    private File archivo = null;
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    private static final long serialVersionUID = 2544634L;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "AdministrarUsuarios{" + "archivo=" + archivo + ", usuarios=" + usuarios + '}';
    }

    public void SetUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    public void CargarArchivo() {
        try {
            usuarios = new ArrayList();
            Usuario user;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((user = (Usuario) objeto.readObject()) != null) {
                        usuarios.add(user);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();

            }

        } catch (Exception e) {
        }
    }

    public void EscribirArchivo(){
        FileOutputStream salida = null;
        ObjectOutputStream objeto = null;
        try {
            salida = new FileOutputStream(archivo);
            objeto = new ObjectOutputStream(salida);
            for (Usuario u : usuarios) {
                objeto.writeObject(u);
            }
            objeto.flush();
        } catch (Exception e) {
        } finally {
            try {
                objeto.close();
                salida.close();
            } catch (Exception e) {
            }

        }
    }
}
