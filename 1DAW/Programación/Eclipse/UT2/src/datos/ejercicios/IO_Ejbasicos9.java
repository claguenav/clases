/**
 *  Realizar un programa que pida como entrada un número decimal
 *   y lo muestre redondeado al entero más próximo.
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dame un número por favor: ");
		double numero = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		
		System.out.println("Vamos a calcular el valor entero mas proximo de " + numero);
		
		// calculo
		
	
		
		// calculo con MATH
		
		System.out.println("El valor entero mas proximo usando math es: " + Math.round(numero));		
		

	}

}
