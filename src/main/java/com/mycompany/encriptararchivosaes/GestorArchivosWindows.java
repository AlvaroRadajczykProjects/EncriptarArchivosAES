/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encriptararchivosaes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 *
 * @author ALVARO
 */
public class GestorArchivosWindows extends GestorArchivos {

    @Override
    public void guardarArchivo(String directorio_nombre_tipo, String contenido) throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter(directorio_nombre_tipo));
        out.write(contenido);
        out.close();
    }

    @Override
    public String cargarArchivo(String directorio_nombre_tipo) throws Exception {
        return Files.readString(Path.of(directorio_nombre_tipo));
    }
    
}
