/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encriptararchivosaes;

/**
 *
 * @author ALVARO
 */
public abstract class GestorArchivos {
    
    public abstract void guardarArchivo(String directorio_nombre_tipo, String contenido) throws Exception;
    
    public abstract String cargarArchivo(String directorio_nombre_tipo) throws Exception;
    
}
