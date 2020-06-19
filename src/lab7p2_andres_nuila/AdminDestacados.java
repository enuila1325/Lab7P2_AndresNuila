package lab7p2_andres_nuila;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminDestacados {

    private ArrayList<Archivo> listaArchivos = new ArrayList();
    private ArrayList<Carpeta> listaCarpetas = new ArrayList();
    private File archivo = null;

    public AdminDestacados() {
    }

    public AdminDestacados(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaProyectos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public ArrayList<Carpeta> getListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpeta> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Archivo t : listaArchivos) {
                bw.writeObject(t);
            }
            for (Carpeta f : listaCarpetas) {
                bw.writeObject(f);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } finally {

        }
    }

    public void cargarArchivo() {
        try {
            listaArchivos = new ArrayList();
            listaCarpetas = new ArrayList();
            Object temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while (((temp = objeto.readObject()) != null)) {
                        if (temp instanceof Archivo) {
                            listaArchivos.add((Archivo) temp);
                        } else if (temp instanceof Carpeta) {
                            listaCarpetas.add((Carpeta) temp);
                        }
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    // Logger.getLogger(adminPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
