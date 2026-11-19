/**
 *  a. Pedir al usuario su edad y mostrar la que tendrá el próximo año.
 * 
 *  b. Pedir a la usuaria el año actual y el de su nacimiento. Debe calcular su
 * edad, suponiendo que en el año en curso la usuaria ya ha cumplido años
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 * 
 */
public class IO_Ejbasicos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int numero = sc.nextInt();
		numero += 1;
		System.out.println("El año que viene tendrás: " + numero + " años!!");
		sc.nextLine(); // Limpiar el buffer

		System.out.println("Introduce el año actual: ");
		int año = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Introduce tu año de nacimiento: ");
		int nacimiento = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		// calculo

		año = año - nacimiento;

		System.out.println("Actualmente tienes: " + año + " años!!");
		sc.close();

	}

}
