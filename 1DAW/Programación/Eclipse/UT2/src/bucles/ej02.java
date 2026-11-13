/**
 * Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.
 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = 0;
		    
		do {
			
			System.out.println("Introduce un numero para saber si es par, si es positivo y su cuadrado");
			
			numero = sc.nextDouble();
			sc.nextLine();
			
			// par
			
			if (numero %2 == 0) {
				
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			
			// positivo
			
			if (numero > 0) {
	            System.out.println("El número es positivo.");
	        } else if (numero < 0) {
	            System.out.println("El número es negativo.");
	        } else {
	            System.out.println("El número es cero (neutro).");
	        }

			// cuadrado 
			
			double numeroPow = Math.pow(numero, 2);
			
			System.out.println("El cuadrado es: " + numeroPow);
			
			
		} while ( numero != 0);
		
		sc.close();
	}

}
