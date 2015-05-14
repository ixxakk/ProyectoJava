/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio31;

import java.util.Scanner;

/**
 *Introducir dos nymeros por teclado y mediante un menu, calcule su suma, su
resta, su multiplicacion o su division
 * @author isaac
 * @version 1.0
 */
public class ejercicio31 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Ingrese un numero");
int x= scan.nextInt();
System.out.println("Ingrese otro numero");
int y= scan.nextInt();
System.out.println("1 para suma");
System.out.println("2 para resta");
System.out.println("3 para multiplicacion");
System.out.println("4 para division");
int z= scan.nextInt();
switch(z)
{
case 1: System.out.println(x+"+"+y+"="+(x+y));
break;
case 2: System.out.println(x+"-"+y+"="+(x-y));
break;
case 3: System.out.println(x+"x"+y+"="+(x*y));
break;
case 4:
if(y==0){
System.out.println("No se puede dividir por cero!");
}else{
System.out.println(x+"/"+y+"="+(x/y));
}
break;
}
}
}
