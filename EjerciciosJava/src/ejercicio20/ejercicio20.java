/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *Calcular el factorial de un numero, mediante subprogramas
 * @author isaac
 * @version 1.0
 */
public class ejercicio20 {
    public static void main(String[] args) {
int var1;
ejercicio20 prob = new ejercicio20();
Scanner escaner = new Scanner(System.in);
System.out.println("Introducir numero que quiera el factorial");
var1= escaner.nextInt();
System.out.println("El factorial es: "+prob.factorial(var1));
}
/**
* Metodo que calcula el factorial
*/
private double factorial(int a){
double var1=a;
for (int i = a; i > 2; i--) {
var1 = var1*(i-1);
}
return var1;
}
}
