/**
 * Diseñar una aplicación que pida por consola un
 * número e indique si es par o impar.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame un número  porfa: ");
		int num1 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		
	
		boolean resultado = (num1 / 2 == 0 ) ? false : true;

		System.out.println(resultado);
		
		sc.close();
		

	}

}
