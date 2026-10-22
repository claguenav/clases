/**
 * 
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 * a. Diseñar un programa que pida un número a la usuaria —por teclado— y a
 * continuación lo muestre. 
 * 
 * b. El programa debe pedir también el nombre de la
 * persona y mostrarlo por pantalla
 */
public class IO_Ejbasicos1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int numero = sc.nextInt();
		System.out.println("Tu numero es: " + numero);
		sc.nextLine(); // Limpiar el buffer

		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		System.out.println("Tu nombre es: " + nombre);
		sc.nextLine(); // Limpiar el buffer

	}

}
