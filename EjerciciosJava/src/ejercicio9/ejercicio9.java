/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Introducir un numero por teclado que nos diga si es positivo o negativo.
 * @author isaac
 * @version 1.0
 */
public class ejercicio9 {
   public static void main(String[]args) throws IOException {
       System.out.println("Ingrese un numero para continuar : ");
       BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
       int numero = Integer.parseInt(S.readLine());
       System.out.println(numero);
     if(numero > 0){
       System.out.println("el numero es positivo !");
     }
     else if(numero < 0) {
       System.out.println("el numero es negativo !");
     }
   }
}
