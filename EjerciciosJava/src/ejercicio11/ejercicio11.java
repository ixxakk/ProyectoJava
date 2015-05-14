/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que
  introducimos por teclado.
 * @author isaac
 * @version 1.0
 */
public class ejercicio11 {
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  
        int cont=0,suma=0;  
       System.out.println("ingresa cantidad hasta la que se contara");                
       int c = sc.nextInt();  
        for (int i = 1; i < c; i++) {       
          if(i%3==0){  
            System.out.println(i);    
            suma=suma+1;  
          }   
        }
        System.out.println("Suma de multiplos de 3 es:"+suma);                 
    }  
}
