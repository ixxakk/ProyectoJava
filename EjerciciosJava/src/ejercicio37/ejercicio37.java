/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio37;

import java.util.Random;

/**
 *Generar una matriz de 4 filas y 5 columnas con n£meros aleatorios entre 1
y 100, y hacer su matriz transpuesta
 * @author isaac
 * @version 1.0
 */
public class ejercicio37 {
    public static void main(String[] args) {
Random rnd = new Random();
int array[][]= new int[5][4];
for(int i=0;i<5;i++){
System.out.print("\t");
for(int j=0;j<4;j++){
System.out.print(array[i][j]+rnd.nextDouble()*100);
}
}
System.out.println("La matriz transpuesta es: ");
for(int j = 0; j < 4; j++){
System.out.print("\t");
for(int i = 0; i < 5; i++){
System.out.print(array[j][i]);
}
}
}
}
