/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.registro3.guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class MainFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int num;
        
        try{
            System.out.println("Ingrese un valor entero: ");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es " + cuadrado);
            }
            catch(InputMismatchException ex){
            System.out.println("Debe ingresar por obligación un número entero ");
            teclado.next();
            }
        finally{
            System.out.println("Se cierran los recursos ");
        }
    }
    
}
