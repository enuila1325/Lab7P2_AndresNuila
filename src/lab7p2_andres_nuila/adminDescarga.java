package lab7p2_andres_nuila;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class adminDescarga extends Thread {

    private JProgressBar d;
    private int peso;
    private boolean flag;

    public adminDescarga() {
    }

    public adminDescarga(JProgressBar d, int peso) {
        this.d = d;
        this.peso = peso;
        flag = true;
    }

    public void run() {
        while (flag) {
            int max = d.getMaximum();
            int stop = d.getValue();
            this.d.setValue(this.d.getValue() + 1);
            if (stop >= max) {

                flag = false;
                d.setValue(0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        
    }

}
