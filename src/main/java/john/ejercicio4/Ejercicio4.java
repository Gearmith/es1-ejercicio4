/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio4;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el numero por favor: ");
	double x = entrada.nextDouble();
	System.out.println("El cuadrado es: " + Math.pow(x, 2));
	System.out.println("El cubo es: " + Math.pow(x, 3));
    }
}
