/**
 * 
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 * Crear una aplicación que calcule la media aritmética de las notas obtenidas
 * en dos retos, valor entero. Hay que tener en cuenta que la media puede
 * contener decimales.
 * 
 */
public class IO_Ejbasicos3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// REPASAR

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu primera nota: ");
		int nota1 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.println("Dime tu segunda nota: ");
		int nota2 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		int total = 0; // ESTO NO HACE FALTA

		// calculo

		total = nota1 + nota2;
		total /= 2;

		System.out.printf("La media es: %.2%n", total);

	}

}
