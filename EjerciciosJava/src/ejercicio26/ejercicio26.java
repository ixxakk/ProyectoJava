/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Introducir una frase por teclado. Imprimirla en el centro de la pantalla
 * @author isaac
 * @version 1.0
 */
public class ejercicio26 {
     public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Introduce frase");
String text = scan.nextLine();
JOptionPane.showMessageDialog(null, text);
}
}
