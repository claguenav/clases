/**
 * Diseñar una aplicación que calcule la longitud y el área de una
 * circunferencia. Para ello, el usuario debe introducir el radio (que puede
 * contener decimales). 
 * 
 * Longitud = 2π * radio; 
 * 
 * Área = π* radio2
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// repasar
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio para calcular el área de la circunferencia");
		double radio = sc.nextDouble();
		double longitud = 2* Math.PI * radio;
		System.out.printf("La longitud es: %.2f%n", longitud);
		System.out.println("La longitud redondeada al entero mas proximo " + Math.ceil(longitud));
		System.out.println("La longitud: " + Math.round(longitud));
		

	}

}
