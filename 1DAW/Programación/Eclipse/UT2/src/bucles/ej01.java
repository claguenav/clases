/**
 * Diseña una aplicación que muestra la edad máxima y mínima de un grupo de alumnos. El usuario introducirá las edades y terminará escribiendo un -1. 
 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		int minedad = 120;
		int maxedad = 0;
		
		do {
			
			System.out.println("Por fa introduce una edad o -1 para terminar el programa");
			opcion = sc.nextInt();
			System.out.println("La edad introducida es: " + opcion);
			
			if (opcion < minedad) {
				
				minedad = opcion;
				
			}
			
		} while( opcion != -1);
		
		
		sc.close();
	}

}
