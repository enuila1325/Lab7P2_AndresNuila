package lab7p2_andres_nuila;

import javax.swing.JProgressBar;

public class AdminBarra extends Thread {

    private JProgressBar progBar;
    private boolean flag;
    private Object o;
    private String pos;

    public AdminBarra() {
    }

    public AdminBarra(JProgressBar progBar, String pos, Object o) {
        this.progBar = progBar;
        this.pos = pos;
        this.o = o;
        this.flag = true;
    }

    public AdminBarra(JProgressBar progBar, String pos) {
        this.progBar = progBar;
        this.pos = pos;
    }
    
    

    public void run() {
        while (flag) {
            if (o == null) {
                progBar.setString(pos);
                flag= false;
            } else if (o instanceof Carpeta) {
                progBar.setString(pos + "/" + ((Carpeta) o).getLink());
                flag= false;
            } else if (o instanceof Archivo) {
                progBar.setString(pos + "/" + ((Archivo) o).getLink());
                flag= false;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
