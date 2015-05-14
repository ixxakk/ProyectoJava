/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *Hacer un programa que calcule independientemente la suma de los pares y
los impares de los numeros entre 1 y 1000, utilizando un switch.
 * @author isaac
 * @version 1.0
 */
public class ejercicio21 {
     public static void main(String[] args) {
int temporal, par=0, impar=0;
for (int i = 0; i <= 1000; i++) {
temporal=i % 2;
switch (temporal) {
case 0:
par+=i;
break;
default:
impar+=i;
}
}
System.out.println("Suma de pares "+par);
System.out.println("Suma de impares "+impar);
}
}
