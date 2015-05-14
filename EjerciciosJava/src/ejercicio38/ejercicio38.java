/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio38;

import java.util.Scanner;

/**
 *Cargar en una matriz las notas de los alumnos de un colegio en funcion del
numero de cursos (filas) y del n£mero de alumnos por curso (columnas)
 * @author isaac
 * @version 1.0
 */
public class ejercicio38 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a=0,b=0;
int array[][]= new int[a][b];
System.out.println("Cuantos cursos desea ingresar?");
b=sc.nextInt();
System.out.println("Cuantos Alumnos tiene?");
a=sc.nextInt();
for(int i=0;i<b;i++){
for(int j=0;j<a;j++){
System.out.println("Que calificacion le pondras al alumno "+j+":");
array[i][j]=sc.nextInt();
}
}
//Mostrando la matriz llena
for(int i = 0; i < b; i++){
System.out.print("\t");
for(int j = 0; j < a; j++){
System.out.print(array[i][j]+" ");
}
}
}
}
