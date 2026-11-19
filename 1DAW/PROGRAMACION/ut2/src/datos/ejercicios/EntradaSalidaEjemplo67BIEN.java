/**
 * 
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 * 
 */
public class EntradaSalidaEjemplo67BIEN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce un número entre 0 y 10:");
		 int numero = sc.nextInt();
		 sc.nextLine(); // Limpiar el buffer
		 
		 
		 if (numero == 67) {
			 
			 System.out.println("SIX SEVEEEEEEEEEEN");
			 
		 } else if ( numero > 10 ) {
			 
			 
			 System.out.println("Eres tonto: " + numero + " es mayor que 10");
		 } 
		
		 System.out.println("Acabas de introducir el " + numero);			 

	        sc.close();

		
	}

}
