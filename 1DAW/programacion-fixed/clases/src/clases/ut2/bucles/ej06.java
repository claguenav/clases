/**
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura). Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado

 * 
 * 
 */
package clases.ut2.bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int alturaArbol = 0;
		int etiquetaArbol = 0;
		int	etiquetaMasAlto = -1;
		int mayorAltura = -1;
		
		String mensajePrincipal = "Introduce la altura del alrbol en centimetros";
		String mensajeTerminar = "Para terminar el programa introduce -1";
		
		while (alturaArbol != -1 ); {

			System.out.println(mensajePrincipal);
			System.out.println(mensajeTerminar);
			alturaArbol = teclado.nextInt();
			teclado.nextLine();
			
			if (alturaArbol > mayorAltura) {
				
				mayorAltura = alturaArbol;
				etiquetaMasAlto = etiquetaArbol;
				
			}
			
			etiquetaArbol += 1;
			
			if (mayorAltura != 1) {
				System.out.println("El arbol mas alto tiene la etiqueta " + etiquetaMasAlto);
			}else {
				System.out.println("No se introdujo na");
			}
			
		} 
		
		
		teclado.close();
	}

}
