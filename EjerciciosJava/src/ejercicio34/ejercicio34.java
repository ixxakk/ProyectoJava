/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34;

import java.util.Scanner;

/**
 *Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas,
  las almacene en un vector y calcule e imprima su media
 * @author isaac
 * @version 1.0
 */
public class ejercicio34 {
   public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
String[] asignaturas = {"Matematica", "Biologia", "Quimica", "Lenguaje", "Fisica", "Ingles", "Historia", "E. Fisica", "E. musical",
"Computacion"};
double suma = 0;
double notas[] = new double[10];
for (int i = 0; i < asignaturas.length; i++) {
System.out.println("Ingrese una nota para " + asignaturas[i] + " : ");
notas[i] = Double.parseDouble(read());
suma += notas[i];
}
System.out.println("Media es: " + suma/10);
}
private static String read() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
} 
}
