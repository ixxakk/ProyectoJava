/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *Introducir dos numeros por teclado. Imprimir los numeros naturales que
hay entre ambos numeros empezando por el mas pequeño, contar cuantos hay y
cuantos de ellos son pares. Calcular la suma de los impares
 * @author isaac
 * @version 1.0
 */
public class ejercicio15 {
    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
int a,b,x=0,z=0,w=0;
System.out.println("Ingrese el primer numero");
a=in.nextInt();
System.out.println("Ingrese el segundo numero");
b=in.nextInt();
if(a<b){
for (int i=a; i<=b; i++) {
System.out.println(i);
x=x+1;
if(i%2==0){
w=w+1;
}
if(i%2==1){
z=z+i;
}
}
}else if(a>b){
for (int i=b; i<=a; i++) {
System.out.println(i);
x=x+1;
if(i%2==0){
w=w+1;
}
if(i%2==1){
z=z+i;
}
}
}
System.out.println("La cantidad de numeros que hay entre los numeros ingresados son: "+x);
System.out.println("La cantidad de numeros pares que hay entre los numeros ingresados son: "+w);
System.out.println("La suma de numeros impares que hay entre los numeros ingresados son: "+z);
}
}
