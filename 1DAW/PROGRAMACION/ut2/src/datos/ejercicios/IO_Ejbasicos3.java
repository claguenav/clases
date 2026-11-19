/**
 * Crear una aplicación que calcule la media aritmética de las notas obtenidas
 * en dos retos, valor entero. Hay que tener en cuenta que la media puede
 * contener decimales.
 * 
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 *
 */
public class IO_Ejbasicos3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// CORREGIDO, APUNTES EN NOTION

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu primera nota: ");
		int nota1 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.println("Dime tu segunda nota: ");
		int nota2 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		// calculo

		double media = (nota1 + nota2) / 2.0;
		
		System.out.printf("La media es: %.2f%n", media);
		
		sc.close();

	}

}
