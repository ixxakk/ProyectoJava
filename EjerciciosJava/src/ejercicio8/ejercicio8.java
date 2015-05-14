/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.IOException;

/**
 * Hacer un pseudocodigo que solo nos permita introducir S o N.
 * @author isaac
 * @version 1.0
 */
public class ejercicio8 {
   public static void main(String[]args) throws IOException {
char ch = ' ';
while(ch != 'S' && ch != 'N'){
System.out.println("Ingrese una S o una N para continuar : ");
ch = (char) System.in.read();
}
System.out.println("Bienvenido !!! ");
}
}
