/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29;

import java.util.Random;
import java.util.Scanner;

/**
 *Simular cien tiradas de dos dados y contar las veces que entre los dos
suman 10
 * @author isaac
 * @version 1.0
 */
public class ejercicio29 {
   public static void main(String[] args) {
Random random = new Random();
Scanner scan = new Scanner(System.in);
System.out.println("Ingrese 'Y' si desea simular los dados");
String option= scan.nextLine();
while(option.equals("Y")||option.equals("y") )
{
for(int i=1;i<101;i++)
{
int x=random.nextInt(12);
int y=random.nextInt(12);
if(x+y==10)
{
System.out.println("Los dos dados sumaron 10 en la tirada numero "+i);
System.out.println("Primer dado salio "+x+" y el segundo salio "+y);
}
}
System.out.println("Desea otro lanzamiento Y/N");
option= scan.nextLine();
}
} 
}
