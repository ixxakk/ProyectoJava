/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que imprima todos los numeros naturales que hay
  desde la unidad hasta un numero que introducimos por teclado.
 * @author isaac
 * @version 1.0
 */
public class ejercicio6 {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("numeros del 1 al 100");
        System.out.println("introduzca el numero hasta el que quiere imprimir");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
