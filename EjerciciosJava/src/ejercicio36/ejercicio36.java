/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36;

import java.util.Random;

/**
 *Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1
y 100, e imprimirla
 * @author isaac
 * @version 1.0
 */
public class ejercicio36 {
    public static void main(String[] args) {
Random rnd = new Random();
int intervalo=101;
int array[][]= new int[5][4];
for(int i=0;i<5;i++){
System.out.print("\t");
for(int j=0;j<4;j++){
array[i][j]=(int) rnd.nextDouble()*intervalo;
System.out.print(array[i][j]+" ");
}
}
}
}
