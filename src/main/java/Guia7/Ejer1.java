/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author kevin
 */
public class Ejer1 {
    private String nombre;
    private String apellidos;
    private String direccion_personal;
    private String contenido;
    
    public Ejer1(String nombre, String apellidos, String direccion_personal, String contenido)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion_personal = direccion_personal;
        this.contenido = contenido;
    }

    Ejer1(String nombre, String apellidos, String direccion_personal, String contenido, String pass_hash) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    } 
    public void setApellidos(String apellidos){
    this.apellidos = apellidos;
    }
    
    public String getDireccion_personal(){
        return direccion_personal;
    } 
    public void setDireccion_personal(String direccion_personal){
    this.direccion_personal = direccion_personal;
    }
    
    public String getContenido(){
        return contenido;
    } 
    public void setContenido(String contenido){
    this.contenido = contenido;
    }
}
