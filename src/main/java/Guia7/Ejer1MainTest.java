/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author kevin
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellidos;
        String direccion_personal;
        String contenido;
        
          // Se crea objeto para leer desde teclado
        Scanner teclado = new Scanner(System.in);
        
         // Se pide por consola los valores y se le asignan a cada variable
        System.out.println("Ingrese el nombre del usuario :");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del usuario :");
        apellidos = teclado.nextLine();
        System.out.println("Ingrese la dirección personal del usuario :");
        direccion_personal = teclado.nextLine();
        System.out.println("Ingrese el contenido :");
        contenido = teclado.nextLine();
        
        //Declaracion de variable para guardar el encriptado
        String pass_hash;
        
        //Llamada a metodo para encriptar con funcionalidad de Bcrypt - mindrot - dependcia gregada
        pass_hash = encriptar(contenido);
        
         //Se crea objeto de tipo Ejer1 y se llama a constructor para asginar los valores obtenidos del teclado y la variable 
        //donde guardamos la contraseña encriptada
        Ejer1 carta;
        carta = new Ejer1(nombre, apellidos, direccion_personal, pass_hash);
        
        System.out.println("Los datos del Ejer1 son:");
        System.out.println("Nombre:" + carta.getNombre());
        System.out.println("Apellido:" + carta.getApellidos());   
        System.out.println("Dirección personal:" + carta.getDireccion_personal());
        System.out.println("Contenido:" + carta.getContenido());
        
        
        
        }
        //Metodo de tipo static para encriptar, se hace llamado a metodo Bcrypt recibe dos parametros password y numero de saltos
        public static String encriptar (String pass){
        return BCrypt.hashpw(pass, BCrypt.gensalt());}
}