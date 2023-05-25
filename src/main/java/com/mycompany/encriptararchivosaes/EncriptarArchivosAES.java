/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encriptararchivosaes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALVARO
 */
public class EncriptarArchivosAES {
    //
    public static void main(String[] args) {
        final String password = "holaloco";
        String textToEncrypt = "Hola soy mariiiii\nQué tal?\nSSIIIUUU!!";
        
        //System.out.println("Original text: \"" + textToEncrypt + "\"");
        //GestorArchivosEncriptacionDecriptacion.guardarArchivoEncriptado("prueba.txt", textToEncrypt, password);
        try {
            //new GestorArchivosWindows().guardarArchivo("prueba.txt", textToEncrypt);
            
            GestorArchivosEncriptacionDecriptacion.guardarArchivoEncriptado("prueba.txt", textToEncrypt, password);
            
            String contenido = GestorArchivosEncriptacionDecriptacion.cargarArchivoEncriptado("prueba.txt", password);
            
            System.out.println(contenido);
            /*
            String encryptedText = new GestorArchivosWindows().cargarArchivo("prueba.txt");
            System.out.println("Encrypted text: \"" + encryptedText + "\"");
            
            String decryptedText = GestorArchivosEncriptacionDecriptacion.cargarArchivoEncriptado("prueba.txt", password);
            System.out.println("Decrypted text: \"" + decryptedText + "\"");
            
            if(textToEncrypt.equals(decryptedText)) {
            System.out.println("Success: decrypted text matches");
            } else {
            System.out.println("Failed: decrypted text does not match");
            }*/
        } catch (Exception ex) {
            Logger.getLogger(EncriptarArchivosAES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
