/**
    	Dado el siguiente polinomio de segundo grado:
			y = ax2 + bx + c
			Crea un programa que pida los coeficientes a, b y c, 
			así como el valor de x, y calcula el valor correspondiente de y. 
*/
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dime el valor de a: ");
		double a = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Dime el valor de b: ");
		double b = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Dime el valor de c: ");
		double c = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Dime el valor de x: ");
		double x = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		
		
		double y = (a * x * 2) + (b * x ) + c;
		
		
		// CALCULO USANDO MATH
		
		System.out.println("El valor de Y es: " + y );
		
		sc.close();
		

	}

}
