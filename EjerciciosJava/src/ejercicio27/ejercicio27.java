/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.Scanner;

/**
 *Realizar la tabla de multiplicar de un numero entre 0 y 10
 * @author isaac
 * @version 1.0
 */
public class ejercicio27 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x,y,z;
System.out.println("Ingrese el numero a multiplicar");
x= scan.nextInt();
while(x<0||x>10)
{System.out.println("Ese numero no esta en esta tabla porfavor ingrese otro numero");
x= scan.nextInt();
}
for(int i=0;i<11;i++)
{
y=i*x;
System.out.println(x+"x"+i+"="+y);
}
}
}
