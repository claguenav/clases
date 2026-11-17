/**
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. 
 * 
 * Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura). 
 * Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado

 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double alturaArbol = 0;
		int contadorArbol = 0;
		String mensajeInicio = "---Introduce la altura en centimetros del arbol.---";
		String mensajeSalir = "---Para salir del programa introduce -1---";
		
		do {
			System.out.println(mensajeInicio);
			System.out.println(mensajeSalir);
			alturaArbol = teclado.nextDouble();
			
			contadorArbol += 1;
			
			System.out.println("Arbol numero: " + contadorArbol);
		} while (alturaArbol != 0);
		
		
		
		
		
		
		
		teclado.close();
		
	}

}
