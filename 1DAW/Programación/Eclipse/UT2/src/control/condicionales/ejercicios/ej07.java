/**
 * Pedir dos números y mostrarlos ordenados de forma decreciente
 */
package control.condicionales.ejercicios;

import java.util.Scanner;

/**
 * 
 */
public class ej07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero porfis: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Dame otro numero pero que sea distinto porfis: ");
		int num2 = sc.nextInt();
		sc.nextLine();

		if (num1 >= num2) {

			System.out.println("Orden decreciente: " + num1 + ", " + num2);

		} else  {

			System.out.println("Orden decreciente: " + num2 + ", " + num1);
		}
		
		
		

	}

}
