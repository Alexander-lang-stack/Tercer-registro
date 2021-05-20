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
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa que pida pida dos números enteros y imprima en pantalla la suma, resta, producto y división de estos
        
        Scanner teclado = new Scanner (System.in);
        int a, b;
        int suma, resta, multiplicacion, division;
        boolean seguir;
        do{
            try{
                seguir = false;
                System.out.println("Ingrese el primero número entero: ");
                a = teclado.nextInt();
                System.out.println("Ingrese el segundo número entero: ");
                b = teclado.nextInt();
                
                suma = a + b;
                resta = a - b;
                multiplicacion = a * b;
                division = a / b;
                
                System.out.println("Los resultados son");
                System.out.println("La suma de ambos números es: " + suma);
                System.out.println("La resta entre el primer número entre el segundo número es: " + resta);
                System.out.println("La multiplicación entre ambos números es: " + multiplicacion);
                System.out.println("La división de el primer número entre el segundo número es: " + division);
                
            }
            catch(InputMismatchException ex){ 
                System.out.println("Debe ingresar por obligación un número entero ");
                teclado.next();
                seguir = true;
            }finally{System.out.println("Se cierran los recursos");}
        
        }while(seguir);
    }
    
}
