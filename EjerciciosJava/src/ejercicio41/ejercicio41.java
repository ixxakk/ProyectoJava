/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio41;

import java.util.Random;

/**
 *Se dispone de una tabla de 5 paginas, 10 filas y 20 columnas, que se
refieren al centro, al curso y al numero de alumnos de un colegio
respectivamente. Imprimir la nota media por curso y la nota media maxima y
su centro de pertenencia
 * @author isaac
 * @version 1.0
 */
public class ejercicio41 {
   public static void main(String[] args) {
double[][][] arrmul= new double[5][10][20];
double notCur=0, notCent=0, media=0;
double mediCent=0;
Random rnd= new Random();
for (int i = 0; i < 5; i++) {
for (int j = 0; j < 10; j++) {
for (int k = 0; k < 20; k++) {
arrmul[i][j][k]=(int)(rnd.nextDouble()*10+5);
}
}
}
for (int i = 0; i < 5; i++) {
notCent=0;
System.out.println("\nCentro "+(i+1));
for (int j = 0; j < 10; j++) {
notCur=0;
System.out.println("Curso "+(j+1));
for (int k = 0; k < 20; k++) {
System.out.println("Materia "+(k+1));
System.out.println("Valor "+arrmul[i][j][k]);
notCur=notCur + arrmul[i][j][k];
}
media=notCur/20;
System.out.println("Media de Curso "+(j+1)+" es "+media);
notCent=notCent+media;
}
mediCent=notCent/10;
System.out.println("Media de centro "+(i+1)+" es "+mediCent);
}
}
 
}
