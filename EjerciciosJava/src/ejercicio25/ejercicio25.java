/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;

/**
 *Introducir un numero menor de 5000 y pasarlo a numero romano
 * @author isaac
 * @version 1.0
 */
public class ejercicio25 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x, i;
int MDecimal[] = {5000, 4000, 1000, 900, 500, 400,100, 90, 50, 40,10, 9, 5, 4, 1};
String MRomano[] = {"V", "MV", "M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};
System.out.println("Introduzca un numero: ");
x = scan.nextInt();
if (x<=5000)
{
i = 0;
System.out.println("Numero Romano: ");
while (x > 0)
{
if (x >= MDecimal[i])
{
System.out.print(MRomano[i]);
x = x - MDecimal[i];
}
else
i++;
}
}
}
}
