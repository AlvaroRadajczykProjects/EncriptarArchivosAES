/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encriptararchivosaes.interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO
 */
public class GestorDialogos {
    
    public static void mostrarInformacion(JFrame frame, String titulo, String mensaje, String tipo){
        if(tipo.equals("error")){
            JOptionPane.showMessageDialog(frame, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("advertencia")){
            JOptionPane.showMessageDialog(frame, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
        } else if (tipo.equals("informacion")){
            JOptionPane.showMessageDialog(frame, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static boolean obtenerConfirmacion(JFrame frame, String titulo, String mensaje){
        int answer = JOptionPane.showConfirmDialog(frame, mensaje);
        if (answer == JOptionPane.YES_OPTION) {
          return true;
        } else if (answer == JOptionPane.NO_OPTION) {
          return false;
        }
        return false;
    }
    
}
