/**
 * Pedir dos números enteros y decir si son iguales o no.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un número  porfa: ");
		int num1 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		System.out.println("Dame un número  porfa: ");
		int num2 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		
		boolean resultado = (num1 == num2) ? true : false;
		
		System.out.println(resultado);
		
		sc.close();
	}

}
