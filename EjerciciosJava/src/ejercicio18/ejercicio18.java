/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *Hacer un pseudocodigo que cuente las veces que aparece una determinada
letra en una frase que introduciremos por teclado.
 * @author isaac
 * @version 1.0
 */
public class ejercicio18 {
    public static void main(String[] args) {
Scanner escaner = new Scanner(System.in);
String Cadena="";
char Compara = ' ';
System.out.println("Introduce la cadena: ");
Cadena = escaner.nextLine();
System.out.println("Introduce la letra a buscar: ");
Compara = escaner.nextLine().charAt(0);
int veces=0;
char []caracteres = Cadena.toCharArray();
for(int i=0;i<=caracteres.length-1;i++){
if(Compara ==caracteres[i]){
veces++;
}
}
System.out.println("Se encontro la letra ("+Compara+"): "+veces+" veces");
}
}
