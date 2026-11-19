/**
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. 
 * 
 * El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. 
 * 
 * Mientras la solución introducida se a correcta, el juego continuará. 
 * 
 * En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.

 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numAleatorio1 =  0;
		int numAleatorio2 = 0;
		int resultado = 0;
		int resultadoUsuario = 0;
		
		do {
			
			// generacion de los 2 numeros aleatorios y la suma de estos
			numAleatorio1 = (int) ((Math.random()*100)) + 1;
			numAleatorio2 = (int) ((Math.random()*100)) + 1;
			resultado = numAleatorio1 + numAleatorio2;
			// menu
			System.out.println("==================================");
			System.out.println("// Mejorar cálculo mental de suma //");
			System.out.println("----------------------------------");
			System.out.println("Introduce el resultado de la suma:");
			System.out.println("----------------------------------");

			System.out.println(numAleatorio1 + " + " + numAleatorio2);
			System.out.println(">");
			resultadoUsuario = sc.nextInt();
			
		} while (resultado == resultadoUsuario);
		
			System.out.println("Incorrecto, fin del programa");
		
			/*
			 * Si aciertas (resultado == resultadoUsuario), la condición es false y saldrás del bucle (terminará el juego).

				Si fallas (resultado != resultadoUsuario), la condición es true y se repetirá el bucle (seguirás jugando).
			 */
		
		sc.close();
	}

}
