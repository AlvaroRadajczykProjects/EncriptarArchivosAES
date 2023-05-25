/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encriptararchivosaes;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

/**
 *
 * @author ALVARO
 */
public class GestorEncriptacionDecriptacion {
    
    //https://mvnrepository.com/artifact/org.springframework.security/spring-security-core/6.1.0
    //https://mvnrepository.com/artifact/com.google.guava/guava/31.1-jre
    
    public static String encriptar(String contenido, String contra){
        String sha256hex = DigestUtils.sha256Hex(contra);
        int parte_a_tomar = Math.abs((int) (Long.parseLong(sha256hex.substring(0,6), 16))) % 4;
        String salt = sha256hex.substring(parte_a_tomar*16, (parte_a_tomar+1)*16);
        
        TextEncryptor encryptor = Encryptors.text(contra, salt);  
        return encryptor.encrypt(contenido);
    }
    
    public static String desencriptar(String contenido, String contra){
        String sha256hex = DigestUtils.sha256Hex(contra);
        int parte_a_tomar = Math.abs((int) (Long.parseLong(sha256hex.substring(0,6), 16))) % 4;
        String salt = sha256hex.substring(parte_a_tomar*16, (parte_a_tomar+1)*16);
        
        TextEncryptor decryptor = Encryptors.text(contra, salt);
        return decryptor.decrypt(contenido);
    }
    
}
