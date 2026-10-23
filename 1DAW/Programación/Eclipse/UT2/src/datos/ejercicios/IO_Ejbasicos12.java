/**
 *  Solicita al usuario un número real y calcula su raíz cuadrada. 
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dime tu numero real por favor: ");
		double numero = sc.nextDouble();
		
		// CALCULO USANDO MATH
		
		System.out.printf("La raiz cuadrada es:  %.2f%n ", Math.sqrt(numero));
		
		sc.close();
		

	}

}
