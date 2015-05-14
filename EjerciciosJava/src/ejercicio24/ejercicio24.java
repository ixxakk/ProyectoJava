/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;

/**
 *Comprobar si un numero mayor o igual que la unidad es primo.
 * @author isaac
 * @version 1.0
 */
public class ejercicio24 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Ingrese un numero a revisar si es primo");
int x=scan.nextInt();
int flag=0;
for(int i=2;i<x;i++){
if(x%i==0){
flag=1;
}
}
if(flag==1)
System.out.println("El numero no es primo");
else
System.out.println("El numero si es primo");
}
}
