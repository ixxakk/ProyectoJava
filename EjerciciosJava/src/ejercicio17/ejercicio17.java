/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *Imprimir, contar y sumar los multiplos de 2 que hay entre una serie de
numeros, tal que el segundo sea mayor o igual que el primero
 * @author isaac
 * @version 1.0
 */
public class ejercicio17 {
    public static void main(String[] args) {
Scanner escaner = new Scanner(System.in);
int i=0,j=0;
int Contador=0;
int Suma=0;
int Salir=0;
while(j >= i){
System.out.println("Introduce el primer numero: ");
i = escaner.nextInt();
System.out.println("Íntroduce el segundo numero: ");
j = escaner.nextInt();
if(i %2==0){
System.out.println("El numero: "+i+" es multiplo de 2");
Contador++;
Suma=Suma+i;
}
if(j %2==0){
System.out.println("El numero: "+j+" es multiplo de 2");
Contador++;
Suma=Suma+j;
}
System.out.println(" ");
}
System.out.println("Fueron ("+Contador+") Numeros multiplos del (2)");
System.out.println("La suma Total de estos numeros fue: "+Suma);
}
}
