package lab7p2_andres_nuila;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    static Random r = new Random();

    public Main() {
        initComponents();
        DefaultComboBoxModel cm = (DefaultComboBoxModel) cb_extension.getModel();
        cm.addElement(".jpg");
        cm.addElement(".pdf");
        cm.addElement(".txt");
        cm.addElement(".mp4");
        cb_extension.setModel(cm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarCarpeta = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        tf_nombrecarp = new javax.swing.JTextField();
        jb_crear2 = new javax.swing.JButton();
        AgregarArchivo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_extension = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        js_tamaño = new javax.swing.JSpinner();
        jb_crear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrincipal = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmMiunidad = new javax.swing.JMenuItem();
        jm_papelera = new javax.swing.JMenuItem();
        jm_destacados = new javax.swing.JMenuItem();
        jmAgregar = new javax.swing.JMenu();
        AgrCarpeta = new javax.swing.JMenuItem();
        AgrArchivo = new javax.swing.JMenuItem();

        jLabel4.setText("Nombre");

        jb_crear2.setText("jButton1");
        jb_crear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crear2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AgregarCarpetaLayout = new javax.swing.GroupLayout(AgregarCarpeta.getContentPane());
        AgregarCarpeta.getContentPane().setLayout(AgregarCarpetaLayout);
        AgregarCarpetaLayout.setHorizontalGroup(
            AgregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarCarpetaLayout.createSequentialGroup()
                .addGroup(AgregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarCarpetaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(107, 107, 107)
                        .addComponent(tf_nombrecarp, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarCarpetaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jb_crear2)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        AgregarCarpetaLayout.setVerticalGroup(
            AgregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarCarpetaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(AgregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombrecarp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jb_crear2)
                .addGap(51, 51, 51))
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Extension");

        cb_extension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setText("Tamaño");

        js_tamaño.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AgregarArchivoLayout = new javax.swing.GroupLayout(AgregarArchivo.getContentPane());
        AgregarArchivo.getContentPane().setLayout(AgregarArchivoLayout);
        AgregarArchivoLayout.setHorizontalGroup(
            AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarArchivoLayout.createSequentialGroup()
                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarArchivoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AgregarArchivoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(js_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarArchivoLayout.createSequentialGroup()
                                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(89, 89, 89)
                                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre)
                                    .addComponent(cb_extension, 0, 178, Short.MAX_VALUE)))))
                    .addGroup(AgregarArchivoLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jb_crear)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        AgregarArchivoLayout.setVerticalGroup(
            AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarArchivoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_extension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(js_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_crear)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaPrincipal);

        jMenu1.setText("MENUS");

        jmMiunidad.setText("Mi Unidad");
        jMenu1.add(jmMiunidad);

        jm_papelera.setText("Papelera");
        jMenu1.add(jm_papelera);

        jm_destacados.setText("Destacados");
        jMenu1.add(jm_destacados);

        jmAgregar.setText("Agregar");

        AgrCarpeta.setText("Carpeta");
        AgrCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrCarpetaActionPerformed(evt);
            }
        });
        jmAgregar.add(AgrCarpeta);

        AgrArchivo.setText("Archivo");
        AgrArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrArchivoActionPerformed(evt);
            }
        });
        jmAgregar.add(AgrArchivo);

        jMenu1.add(jmAgregar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgrArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrArchivoActionPerformed
        AgregarArchivo.pack();
        AgregarArchivo.setModal(true);
        AgregarArchivo.setLocationRelativeTo(null);
        AgregarArchivo.setVisible(true);
    }//GEN-LAST:event_AgrArchivoActionPerformed

    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        try {
            String name = tf_nombre.getText();
            int peso = Integer.parseInt(js_tamaño.getValue().toString());
            String ext = cb_extension.getSelectedItem().toString();
            String link = "";
            int numAletorio;
            for (int i = 0; i < 10; i++) {
                numAletorio = 48 + r.nextInt(122);
                if (numAletorio >= 65 && numAletorio <= 89) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else if (numAletorio >= 97 && numAletorio <= 122) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else if (numAletorio >= 48 && numAletorio <= 57) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else {
                    i--;
                }
            }
            Archivo a = new Archivo(name, link, ext, peso);
            archivos.add(a);
            AdminArchivos aa = new AdminArchivos("./Archivos.dna");
            aa.getListaArchivos().add(a);
            aa.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Creado exitosamente");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_crearMouseClicked

    private void jb_crear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crear2MouseClicked
        try {
            String nombre = tf_nombrecarp.getText();
            String link = "";
            int numAletorio;
            for (int i = 0; i < 10; i++) {
                numAletorio = 48 + r.nextInt(122);
                if (numAletorio >= 65 && numAletorio <= 89) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else if (numAletorio >= 97 && numAletorio <= 122) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else if (numAletorio >= 48 && numAletorio <= 57) {
                    Character cra = (char) numAletorio;
                    link += cra;
                } else {
                    i--;
                }
            }
            Carpeta c = new Carpeta(nombre, link);
            carpetas.add(c);
            AdminCarpetas ac = new AdminCarpetas("./Carpetas.dna");
            ac.getListaCarpetas().add(c);
            ac.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_crear2MouseClicked

    private void AgrCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrCarpetaActionPerformed
        AgregarCarpeta.pack();
        AgregarCarpeta.setModal(true);
        AgregarCarpeta.setLocationRelativeTo(null);
        AgregarCarpeta.setVisible(true);
    }//GEN-LAST:event_AgrCarpetaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgrArchivo;
    private javax.swing.JMenuItem AgrCarpeta;
    private javax.swing.JDialog AgregarArchivo;
    private javax.swing.JDialog AgregarCarpeta;
    private javax.swing.JComboBox<String> cb_extension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_crear2;
    private javax.swing.JMenu jmAgregar;
    private javax.swing.JMenuItem jmMiunidad;
    private javax.swing.JMenuItem jm_destacados;
    private javax.swing.JMenuItem jm_papelera;
    private javax.swing.JSpinner js_tamaño;
    private javax.swing.JList<String> listaPrincipal;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrecarp;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();
    private ArrayList MiUnidad = new ArrayList();
    private ArrayList Destacados = new ArrayList();
}
