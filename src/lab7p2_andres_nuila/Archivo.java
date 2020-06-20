package lab7p2_andres_nuila;

import java.io.Serializable;

public class Archivo implements Serializable {

    private String nombre, link, extension;
    private int tamaño;
    private static final long SerialVersionUID = 777L;

    public Archivo() {
    }

    public Archivo(String nombre, String link, String extension, int tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return nombre + extension + " Tamaño " + tamaño + "MB";
    }

}
