/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio47;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *En el fichero secuencial VENTAS.DAT, est n almacenadas las ventas de los
productos durante el d¡a, cuyos campos son: NART y VENTAS Se desea hacer
un programa que liste por impresora todas las ventas realizadas durante el
d¡a.
 * @author isaac
 * @version 1.0
 */
public class ejercicio47 {
    public static void main(String[] args) {
File archivo = null;
FileReader fr = null;
BufferedReader br = null;
try {
archivo = new File("ventas.dat");
fr = new FileReader(archivo);
br = new BufferedReader(fr);
// Lectura del fichero
System.out.println("NART Ventas");
String linea;
while ((linea = br.readLine()) != null) {
System.out.println(linea);
}
} catch (Exception e) {
e.printStackTrace();
} finally {
try {
if (null != fr) {
fr.close();
}
} catch (Exception e2) {
e2.printStackTrace();
}
}
}
}
