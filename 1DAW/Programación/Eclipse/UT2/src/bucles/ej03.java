/**
 * Implementar una aplicación par calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.

 */
package bucles;
import java.util.Scanner;


/**
 * 
 */
public class ej03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad = -1;
		int suma = 0;
		int contador = 0;
		int mayorEdad = 0;
		do {			
			System.out.println("Introduce la edad de los alumnos, -1 para acabar la ejecucion del programa");
			edad = teclado.nextInt();
			
			contador += 1; // para saber cuantas edades son introducidas

			if (edad != -1) {
				
				suma += edad; 
				/*
				 *como antes de empezar el do he puessto que suma = 0, 
				 *hago que la edad anterior se acumule en la variable de suma y 
				 *asi puedo ir sumando numerosas edades hasta que el usuario termine 
				 *el programa 
				 */
			// cuandos mayores de edad hay	
			}
			if (edad >= 18 ) {
				
				 mayorEdad += 1;
			} 
			
			System.out.println("Vuelta numero:" + contador);
			System.out.println("suma de las edades: " + suma);
				
		} while ( edad != -1);
		// calculo de la media
		double media = suma / contador;
		
		System.out.println("Media de las edades: " + media);
		System.out.println("Numero de alumnos: " + contador );
		System.out.println("Numero de mayores de edad: " + mayorEdad);
		
		teclado.close();
		

	}

}
