/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encriptararchivosaes;

/**
 *
 * @author ALVARO
 */
public class GestorArchivosEncriptacionDecriptacion {
    
    public static void guardarArchivoEncriptado(String directorio_nombre_tipo, String contenido, String contra) throws Exception {
        String contenido_encriptado = GestorEncriptacionDecriptacion.encriptar(contenido, contra);
        new GestorArchivosWindows().guardarArchivo(directorio_nombre_tipo, contenido_encriptado);
    }
    
    public static String cargarArchivoEncriptado(String directorio_nombre_tipo, String contra) throws Exception {
        String contenido_encriptado = new GestorArchivosWindows().cargarArchivo(directorio_nombre_tipo);
        String contenido_desencriptado = GestorEncriptacionDecriptacion.desencriptar(contenido_encriptado, contra);
        return contenido_desencriptado;
    }

}
