package lab7p2_andres_nuila;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminCarpetas {

    private ArrayList<Carpeta> listaCarpetas = new ArrayList();
    private File archivo = null;

    public AdminCarpetas() {
    }

    public AdminCarpetas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
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
            for (Carpeta t : listaCarpetas) {
                bw.writeObject(t);
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
            listaCarpetas = new ArrayList();
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        listaCarpetas.add(temp);
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
