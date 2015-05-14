/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *Hacer un programa que imprima la suma de los 100 primeros numeros.
 * @author isaac
 * @version 1.0
 */
public class ejercicio4 {
    public static void main(String[]args)
{
int suma = 0, n = 0;
Scanner sc = new Scanner(System.in);
for(int i=1; i<=100; i++)
{
    System.out.println("introduzca un numero"); 
    n = sc.nextInt();
    suma=suma+n;
}
System.out.println("La suma es:" + suma);
}
}  

