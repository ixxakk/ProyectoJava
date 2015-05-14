/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Introducir un numero por teclado que nos diga si es par o impar.
 * @author isaac
 * @version 1.0
 */
public class ejercicio10 {
   public static void main(String[]args) throws IOException {
     System.out.println("Ingrese el numero a calcular : ");
     BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
     int numero = Integer.parseInt(S.readLine());
   if(numero % 2 == 0){
     System.out.println("El numero es par");
   }
   else {
     System.out.println("El numero es impar");
   }
   } 
}
