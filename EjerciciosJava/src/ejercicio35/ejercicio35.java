/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *Usando el segundo ejemplo, hacer un programa que busque una nota en el vector
 * @author isaac
 * @version 1.0
 */
public class ejercicio35 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i,a,b=0,p=0;
double[] numeros = new double[10];
double suma = 0;
System.out.println("Ingresa los datos del arreglo: ");
for (i = 0; i < 10; i++) {
System.out.print("Numero[" + i + "]= ");
numeros[i]=sc.nextInt();
}
System.out.println("Que numero deseas buscar");
a= sc.nextInt();
for (i = 0; i < 10; i++) {
if(numeros[i]==a){
b=1;
p=i;
}
}
if(b==1){
System.out.println("El dato si esta en el arreglo y se encuentra en la posicion"+p);
}
}
}
