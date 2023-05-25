/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.encriptararchivosaes.interfaz;

import com.mycompany.encriptararchivosaes.GestorArchivosEncriptacionDecriptacion;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author ALVARO
 */
public class VentanaCrear extends javax.swing.JFrame {

    private boolean contra_vis = false;
    
    public void cambiarVisibilidadCuadroContra(boolean mostrar){
        if(mostrar){
            jPasswordField1.setEchoChar((char)0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
    }
    
    /**
     * Creates new form VentanaAbrir
     */
    public VentanaCrear(String directorio_nombre_extension_archivo, String contra, String contenido) {
        initComponents();
        
        jTextField1.setText(directorio_nombre_extension_archivo);
        cambiarVisibilidadCuadroContra(false);
        jPasswordField1.setText(contra);
        jTextArea1.setText(contenido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Archivo a guardar");

        jLabel2.setText("Contraseña");

        jToggleButton1.setText("Mostrar/Ocultar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Examinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(325, 325, 325))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jToggleButton1))))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dir;
        
        if( new File(jTextField1.getText()).isDirectory() ){
            dir = jTextField1.getText();
        } else {
            if( new File(jTextField1.getText()).exists() ){
                dir = new File(jTextField1.getText()).getAbsolutePath();
            } else {
                dir = new File(jTextField1.getText()).getParent();
            }
        }
        
        JFileChooser fc = new JFileChooser(new File(dir));

        if( new File(jTextField1.getText()).exists() && !new File(jTextField1.getText()).isDirectory() ){
            fc.setSelectedFile( new File(jTextField1.getText()));
        }
        
        // Show open dialog; this method does not return until the dialog is closed
        fc.showOpenDialog(this);
        
        if(fc.getSelectedFile() != null){
            jTextField1.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.contra_vis = !this.contra_vis;
        cambiarVisibilidadCuadroContra(this.contra_vis);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(String.valueOf(jPasswordField1.getPassword()) == null || String.valueOf(jPasswordField1.getPassword()).length() < 8){
            GestorDialogos.mostrarInformacion(this, "Contraseña invalida", "Revisa tu contraseña, que mínimo tenga 8 caracteres, evita caracteres muy extraños", "advertencia");
        } else {
            if(jTextArea1.getText().length() < 1){
                GestorDialogos.mostrarInformacion(this, "Contenido vacío", "Asegúrate de que tu contenido al menos tenga un caracter", "advertencia");
            } else {
                if(new File(jTextField1.getText()).exists()){
                    if(GestorDialogos.obtenerConfirmacion(this, "Archivo ya existe", "Ya existe este archivo, ¿desea sobreescribirlo? (La encriptación cambiará, pero la contraseña para abrirlo será la actualmente escrita)")){
                        try {
                            GestorArchivosEncriptacionDecriptacion.guardarArchivoEncriptado(jTextField1.getText(), jTextArea1.getText(), String.valueOf(jPasswordField1.getPassword()));
                            GestorDialogos.mostrarInformacion(this, "Exito", "Se ha creado correctamente el archivo encriptado", "informacion");
                            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                        } catch (Exception e){
                            GestorDialogos.mostrarInformacion(this, "Error al encriptar", "Error al encriptar: "+e.getMessage(), "error");
                        }
                    }
                } else {
                    try {
                        GestorArchivosEncriptacionDecriptacion.guardarArchivoEncriptado(jTextField1.getText(), jTextArea1.getText(), String.valueOf(jPasswordField1.getPassword()));
                        GestorDialogos.mostrarInformacion(this, "Exito", "Se ha creado correctamente el archivo encriptado", "informacion");
                        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    } catch (Exception e){
                        GestorDialogos.mostrarInformacion(this, "Error al encriptar", "Error al encriptar: "+e.getMessage(), "error");
                    }
                }
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
