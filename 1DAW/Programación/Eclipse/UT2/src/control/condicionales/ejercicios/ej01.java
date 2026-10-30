/**
 * Solicita por teclado un número de tipo int al usuario y
 * escribe un programa que muestre true o false, 
 * dependiendo de si el número es positivo.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dame un número entero porfa: ");
		int numero = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		
		boolean opternario = (numero > 0) ? true : false;
		/*
		 * si opternario es igual a A > B ? entonces true si no false.
		 * 
		 *  es literalmente como una pregunta 
		 * 
		 *  es opternario igual a numero mayor que cero?
		 *  - Sí = true
		 *  - No = false
		 */
		
		
		
		System.out.println(opternario);
		
		
		
		
		
		sc.close(); // cerrar Scanner
		
	}

}
