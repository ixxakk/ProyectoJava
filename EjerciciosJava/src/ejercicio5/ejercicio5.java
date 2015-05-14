/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que
  imprima cuantos impares hay.
 * @author isaac
 * @version 1.0
 */
public class ejercicio5 {
    public static void main(String[] args) {
      int numero=1;
      int limite=100;
      int suma=0;
    while(numero <= 100){
      if(numero%2!=0){
      suma=suma+1;    
      System.out.println(numero);
      } 
      numero++;
    }
    System.out.println("los numeros impares son:");
    System.out.println(suma);
    }
}