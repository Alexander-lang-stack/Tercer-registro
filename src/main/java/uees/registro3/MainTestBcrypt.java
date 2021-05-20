/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author kevin
 */
public class MainTestBcrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
    String apellidos;
    float edad;
    String departamento;
    String email;
    String id_usuario;
    String password;
    
    // Se crea objeto para leer desde teclado
    Scanner teclado = new Scanner(System.in);
    
    // Se pide por consola los valores y se le asignan a cada variable
    System.out.println("Ingrese el nombre del usuario :");
    nombre = teclado.nextLine();
    System.out.println("Ingrese el apellido del usuario :");
    apellidos = teclado.nextLine();
    System.out.println("Ingrese la edad :");
    edad = Float.parseFloat(teclado.nextLine());
    System.out.println("Igrese el departamento :");
    departamento = teclado.nextLine();
    System.out.println("Ingrese el email :");
    email = teclado.nextLine();
    System.out.println("Ingrese el id :");
    id_usuario = teclado.nextLine();
    System.out.println("Ingrese el password :");
    password = teclado.nextLine();
    
    //Declaracion de variable para guardar el encriptado
    String pass_hash;
    
    //Llamada a metodo para encriptar con funcionalidad de Bcrypt - mindrot - dependcia gregada
    pass_hash = encriptar(password);
    
    //Se crea objeto de tipo Login y se llama a constructor para asginar los valores obtenidos del teclado y la variable 
    //donde guardamos la contraseña encriptada
    Login registro;
    registro = new Login(nombre, apellidos, edad, departamento, email, id_usuario, pass_hash);
    
    //Se imprime por consola los datos obtenidos del teclado y se verifica si la cadena o campo de password esta encriptado
    System.out.println("Los datos del registro son:");
    System.out.println("Nombre:" + registro.getNombre());
    System.out.println("Apellido:" + registro.getApellidos());
    System.out.println("Edad:" + registro.getEdad());
    System.out.println("Departamento:" + registro.getDepartamento());
    System.out.println("Email:" + registro.getEmail());
    System.out.println("Id:" + registro.getId_usuario());
    System.out.println("Password:" + registro.getPassword());
    
    
    //Verificación del password
    String password_check;
    System.out.println("Ingrese el password a verificar: ");
    password_check = teclado.nextLine();
    if(BCrypt.checkpw(password_check, registro.getPassword()))
    {
        System.out.println("El password es correcto");
    }
    else
    {
        System.out.println("El password es incorrecto");
    }
    }
    
    //Metodo de tipo static para encriptar, se hace llamado a metodo Bcrypt recibe dos parametros password y numero de saltos
    public static String encriptar (String pass){
    return BCrypt.hashpw(pass, BCrypt.gensalt()) ;
    }
    
}
