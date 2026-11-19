/**
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. 
 * 
 * Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura). 
 * 
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
		// Abrimos conexión con el teclado
				Scanner teclado = new Scanner(System.in);
				
				int posicArbol = 0;
				int posicArbolMaxAltura = 0;
				double alturaMaxima = 0;
				
				// Abrimos conexión con el teclado
				System.out.println("Por favor, introduce la altura del árbol");
				double altura = teclado.nextDouble();
				// Se pedirán números a menos que se introduzca el valor -1
				while(altura != -1) {
					posicArbol++;
					System.out.printf("La altura del árbol cuya etiqueta es %d es %.5f %n", posicArbol, altura);
					// Evaluamos si la altura introducida es la máxima
					if(altura> alturaMaxima) {
						posicArbolMaxAltura = posicArbol;
						alturaMaxima = altura;
					}
					System.out.println("Por favor, introduce la altura del siguiente árbol o -1 para terminar.");
					altura = teclado.nextDouble();
				}
				System.out.printf("El árbol cuya etiqueta es %d es el de máxima altura: %.5f %n", posicArbol, alturaMaxima);
				
				teclado.close();
		
	}

}
