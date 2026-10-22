/**
 * 
 */
package datos.ejercicios;

import java.util.Scanner;

/**
 * 
 */
public class EntradaSalidaEjemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce un número entre 0 y 10:");
		 int numero = sc.nextInt();
		 sc.nextLine(); // Limpiar el buffer
		 System.out.println("Acabas de introducir el " + numero);
		 System.out.println("Introduce otro número entre 0 y 10:");
		 int numero2 = sc.nextInt();
		 System.out.printf("Acabas de introducir el %d", numero2);
		 sc.nextLine(); 
		 System.out.println(" Introduce tu nombre: ");
		 String nombre = sc.nextLine();
		 System.out.printf("Tu nombre es %s", nombre);
		 
		

		
	}

}
