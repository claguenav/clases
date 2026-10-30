/**
 *     3- Realiza un programa en el que se pidan dos números por consola y 
 *     		se indique si uno es múltiplo de otro número.
 *     
        a. El 0 es múltiplo de todos los números
        b. Todo número es múltiplo de sí mismos.
 * 
 * 
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Abril
		
		System.out.println("Dame un número  porfa: ");
		int num1 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		System.out.println("Dame otro número  porfa: ");
		int num2 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		 
		boolean multiplo = (num1 % num2 == 0 || num1 == 0 || num2 == 0 ) ? true : false;
		
		System.out.println(multiplo);
		
		
		 
		sc.close(); // Cerral
	}

}
