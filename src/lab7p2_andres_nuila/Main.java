package lab7p2_andres_nuila;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

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
        SUBIR = new javax.swing.JButton();
        agregarCarpeta = new javax.swing.JButton();
        pm_Miunidad = new javax.swing.JPopupMenu();
        movDestacado = new javax.swing.JMenuItem();
        movPapelera = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JPopupMenu();
        restaurar = new javax.swing.JMenuItem();
        borrar = new javax.swing.JMenuItem();
        popDestacados = new javax.swing.JPopupMenu();
        movMiUNidad = new javax.swing.JMenuItem();
        movpapelera = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrincipal = new javax.swing.JList<>();
        barra = new javax.swing.JProgressBar();
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

        SUBIR.setText("SUBIR");
        SUBIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUBIRMouseClicked(evt);
            }
        });

        agregarCarpeta.setText("Agregar a carpeta existente");
        agregarCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarCarpetaMouseClicked(evt);
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
                        .addComponent(SUBIR))
                    .addGroup(AgregarArchivoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(agregarCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(SUBIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarCarpeta)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        movDestacado.setText("Mover a destacados");
        movDestacado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movDestacadoActionPerformed(evt);
            }
        });
        pm_Miunidad.add(movDestacado);

        movPapelera.setText("Mover a papelera");
        movPapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movPapeleraActionPerformed(evt);
            }
        });
        pm_Miunidad.add(movPapelera);

        restaurar.setText("restaurar");
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });
        eliminar.add(restaurar);

        borrar.setText("Eliminar definitivamente");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        eliminar.add(borrar);

        movMiUNidad.setText("Mover a mi unidad");
        movMiUNidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movMiUNidadActionPerformed(evt);
            }
        });
        popDestacados.add(movMiUNidad);

        movpapelera.setText("Mover a papelera");
        movpapelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movpapeleraActionPerformed(evt);
            }
        });
        popDestacados.add(movpapelera);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaPrincipal.setModel(new DefaultListModel());
        listaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPrincipal);

        barra.setStringPainted(true);

        jMenu1.setText("MENUS");

        jmMiunidad.setText("Mi Unidad");
        jmMiunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMiunidadActionPerformed(evt);
            }
        });
        jMenu1.add(jmMiunidad);

        jm_papelera.setText("Papelera");
        jm_papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_papeleraActionPerformed(evt);
            }
        });
        jMenu1.add(jm_papelera);

        jm_destacados.setText("Destacados");
        jm_destacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_destacadosActionPerformed(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgrArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrArchivoActionPerformed
        AgregarArchivo.pack();
        AgregarArchivo.setModal(true);
        AgregarArchivo.setLocationRelativeTo(null);
        AgregarArchivo.setVisible(true);
    }//GEN-LAST:event_AgrArchivoActionPerformed

    private void SUBIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUBIRMouseClicked
        try {
            String name = tf_nombre.getText();
            int peso = Integer.parseInt(js_tamaño.getValue().toString());
            String ext = cb_extension.getSelectedItem().toString();
            String link = "dive.google.com/";
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
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            am.getListaArchivos().add(a);
            am.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Creado exitosamente");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SUBIRMouseClicked

    private void jb_crear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crear2MouseClicked
        try {
            String nombre = tf_nombrecarp.getText();
            String link = "dive.google.com/";
            int numAletorio;
            for (int i = 0; i < 5; i++) {
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
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            am.getListaCarpetas().add(c);
            am.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Se ha creado exitosamente");
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

    private void jmMiunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMiunidadActionPerformed
        aux = 0;
        pos = "MI UNIDAD";
        listaPrincipal.setModel(new DefaultListModel<>());
        AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
        am.cargarArchivo();
        DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
        for (Carpeta c : am.getListaCarpetas()) {
            l.addElement(c);
        }
        for (Archivo a : am.getListaArchivos()) {
            l.addElement(a);
        }
        listaPrincipal.setModel(l);
    }//GEN-LAST:event_jmMiunidadActionPerformed

    private void listaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPrincipalMouseClicked
        int x = listaPrincipal.getSelectedIndex();
        DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
        o = l.get(x);
        AdminBarra ab = new AdminBarra(barra, pos, o);
        Thread proceso = new Thread(ab);
        proceso.start();
        if (evt.isMetaDown()) {
            switch (aux) {
                case 0:
                    pm_Miunidad.show(evt.getComponent(), evt.getX(), evt.getY());
                    break;
                case 1:
                    eliminar.show(evt.getComponent(), evt.getX(), evt.getY());
                    break;
                case 2:
                    popDestacados.show(evt.getComponent(), evt.getX(), evt.getY());
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_listaPrincipalMouseClicked

    private void jm_papeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_papeleraActionPerformed
        aux = 1;
        pos = "PAPELERA";
        listaPrincipal.setModel(new DefaultListModel<>());
        AdminPapelera ap = new AdminPapelera("./Papelera.dna");
        ap.cargarArchivo();
        DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
        for (Carpeta c : ap.getListaCarpetas()) {
            l.addElement(c);
        }
        for (Archivo a : ap.getListaArchivos()) {
            l.addElement(a);
        }
        listaPrincipal.setModel(l);
    }//GEN-LAST:event_jm_papeleraActionPerformed

    private void jm_destacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_destacadosActionPerformed
        aux = 2;
        pos = "DESTACADOS";
        listaPrincipal.setModel(new DefaultListModel<>());
        AdminDestacados ad = new AdminDestacados("./Destacados.dna");
        ad.cargarArchivo();
        DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
        for (Carpeta c : ad.getListaCarpetas()) {
            l.addElement(c);
        }
        for (Archivo a : ad.getListaArchivos()) {
            l.addElement(a);
        }
        listaPrincipal.setModel(l);
    }//GEN-LAST:event_jm_destacadosActionPerformed

    private void movDestacadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movDestacadoActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminDestacados ad = new AdminDestacados("./Destacados.dna");
            ad.cargarArchivo();
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            if (temp instanceof Carpeta) {
                ad.getListaCarpetas().add((Carpeta) temp);
                for (int i = 0; i < am.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(am.getListaCarpetas().get(i).getNombre())) {
                        am.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                ad.getListaArchivos().add((Archivo) temp);
                for (int i = 0; i < am.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(am.getListaArchivos().get(i).getNombre())) {
                        am.getListaArchivos().remove(i);
                    }
                }
            }
            am.escribirArchivo();
            ad.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_movDestacadoActionPerformed

    private void movPapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movPapeleraActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminPapelera ap = new AdminPapelera("./Papelera.dna");
            ap.cargarArchivo();
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            if (temp instanceof Carpeta) {
                ap.getListaCarpetas().add((Carpeta) temp);
                for (int i = 0; i < am.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(am.getListaCarpetas().get(i).getNombre())) {
                        am.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                ap.getListaArchivos().add((Archivo) temp);
                for (int i = 0; i < am.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(am.getListaArchivos().get(i).getNombre())) {
                        am.getListaArchivos().remove(i);
                    }
                }
            }
            am.escribirArchivo();
            ap.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_movPapeleraActionPerformed

    private void movMiUNidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movMiUNidadActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminDestacados ad = new AdminDestacados("./Destacados.dna");
            ad.cargarArchivo();
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            if (temp instanceof Carpeta) {
                am.getListaCarpetas().add((Carpeta) temp);
                for (int i = 0; i < ad.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(ad.getListaCarpetas().get(i).getNombre())) {
                        ad.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                am.getListaArchivos().add((Archivo) temp);
                for (int i = 0; i < ad.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(ad.getListaArchivos().get(i).getNombre())) {
                        ad.getListaArchivos().remove(i);
                    }
                }
            }
            am.escribirArchivo();
            ad.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_movMiUNidadActionPerformed

    private void movpapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movpapeleraActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminPapelera ap = new AdminPapelera("./Papelera.dna");
            ap.cargarArchivo();
            AdminDestacados ad = new AdminDestacados("./Destacados.dna");
            ad.cargarArchivo();
            if (temp instanceof Carpeta) {
                ap.getListaCarpetas().add((Carpeta) temp);
                for (int i = 0; i < ad.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(ad.getListaCarpetas().get(i).getNombre())) {
                        ad.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                ap.getListaArchivos().add((Archivo) temp);
                for (int i = 0; i < ad.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(ad.getListaArchivos().get(i).getNombre())) {
                        ad.getListaArchivos().remove(i);
                    }
                }
            }
            ad.escribirArchivo();
            ap.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_movpapeleraActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminPapelera ap = new AdminPapelera("./Papelera.dna");
            ap.cargarArchivo();
            if (temp instanceof Carpeta) {
                for (int i = 0; i < ap.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(ap.getListaCarpetas().get(i).getNombre())) {
                        ap.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                for (int i = 0; i < ap.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(ap.getListaArchivos().get(i).getNombre())) {
                        ap.getListaArchivos().remove(i);
                    }
                }
            }
            ap.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        try {
            int x = listaPrincipal.getSelectedIndex();
            DefaultListModel l = (DefaultListModel) listaPrincipal.getModel();
            Object temp = l.get(x);
            AdminPapelera ap = new AdminPapelera("./Papelera.dna");
            ap.cargarArchivo();
            AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
            am.cargarArchivo();
            if (temp instanceof Carpeta) {
                am.getListaCarpetas().add((Carpeta) temp);
                for (int i = 0; i < ap.getListaCarpetas().size(); i++) {
                    if (((Carpeta) temp).getNombre().equals(am.getListaCarpetas().get(i).getNombre())) {
                        ap.getListaCarpetas().remove(i);
                    }
                }
            } else if (temp instanceof Archivo) {
                am.getListaArchivos().add((Archivo) temp);
                for (int i = 0; i < ap.getListaArchivos().size(); i++) {
                    if (((Archivo) temp).getNombre().equals(ap.getListaArchivos().get(i).getNombre())) {
                        ap.getListaArchivos().remove(i);
                    }
                }
            }
            am.escribirArchivo();
            ap.escribirArchivo();
            l.remove(x);
            listaPrincipal.setModel(l);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_restaurarActionPerformed

    private void agregarCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarCarpetaMouseClicked
        try {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("¿En que direccion esta la carpeta destino?\n-1. Mi Unidad -2.Destacados"));
            switch (opc) {
                case 1:
                    AdminMiUnidad am = new AdminMiUnidad("./MiUnidad.dna");
                    am.cargarArchivo();
                    String aux = "";
                    for (int i = 0; i < am.getListaCarpetas().size(); i++) {
                        aux += i + "->" + am.getListaCarpetas().get(i).getNombre();
                        aux += "\n";
                    }
                    JOptionPane.showMessageDialog(null, aux);
                    int carp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice de la carpeta"));
                    String link = "dive.google.com/" + am.getListaCarpetas().get(carp).getNombre() + "/";
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
                    Archivo a = new Archivo(tf_nombre.getText(), link, cb_extension.getSelectedItem().toString(), Integer.parseInt(js_tamaño.getValue().toString()));
                    am.getListaCarpetas().get(carp).getArchivos().add(a);
                    am.escribirArchivo();
                    JOptionPane.showMessageDialog(null, "Agregado correctamente");
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarCarpetaMouseClicked

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
    private javax.swing.JButton SUBIR;
    private javax.swing.JButton agregarCarpeta;
    private javax.swing.JProgressBar barra;
    private javax.swing.JMenuItem borrar;
    private javax.swing.JComboBox<String> cb_extension;
    private javax.swing.JPopupMenu eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_crear2;
    private javax.swing.JMenu jmAgregar;
    private javax.swing.JMenuItem jmMiunidad;
    private javax.swing.JMenuItem jm_destacados;
    private javax.swing.JMenuItem jm_papelera;
    private javax.swing.JSpinner js_tamaño;
    private javax.swing.JList<String> listaPrincipal;
    private javax.swing.JMenuItem movDestacado;
    private javax.swing.JMenuItem movMiUNidad;
    private javax.swing.JMenuItem movPapelera;
    private javax.swing.JMenuItem movpapelera;
    private javax.swing.JPopupMenu pm_Miunidad;
    private javax.swing.JPopupMenu popDestacados;
    private javax.swing.JMenuItem restaurar;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrecarp;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();
    private ArrayList MiUnidad = new ArrayList();
    private ArrayList Destacados = new ArrayList();
    private int aux;
    private String pos;
    private Object o;
}
