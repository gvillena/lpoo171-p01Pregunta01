/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01.pregunta01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P01Pregunta01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese un numero: ");        
        int numero = Integer.parseInt(sc.next());
        boolean esPrimo = true;         
        if (numero == 1) {
            esPrimo = false;             
        }
        else if (numero == 2) {
            esPrimo = false;
        }
        else {
            for (int i = 2; i < numero; i++) {                                
                if ((numero % i) == 0) {
                    esPrimo = false; 
                }
            }
        }    
        System.out.println("esPrimo = " + esPrimo);        
    }
    
}
