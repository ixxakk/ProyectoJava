/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *Imprimir y contar los numeros que son multiplos de 2 o de 3 que hay entre
1 y 100.
 * @author isaac
 * @version 1.0
 */
public class ejercicio13 {
    public static void main(String[] args) {
int a=0,b=0;
System.out.println("Los siguientes numeros son multiplos de 2");
for (int i = 1; i <= 100; i++) {
if(i%2==0){
System.out.println(i);
a=a+1;
}
}
System.out.println("La cantidad de numeros pares son: "+a);
System.out.println("Los siguientes numeros son multiplos de 3");
for (int i = 1; i <= 100; i++) {
if(i%3==0){
System.out.println(i);
b=b+1;
}
}
System.out.println("La cantidad de numeros impares son: "+b);
}
}
