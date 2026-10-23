/**
 * Objetivo: combinar Scanner, conversión parseX, casting y el uso de final para valores que no deben cambiar tras leerlos.

import java.util.Scanner;
 */
package datos.ejEnCasa.pt3;
import java.util.Scanner;

/**
 * 
 */
public class Ej01 {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);


	        // TODO: Pide tres entradas por consola:

	        // - un entero (edad)

	        // - un decimal (precio base)

	        // - un texto de longitud 1 para convertir a char (categoría)


	        // TODO: Lee como String y convierte tú mismo con parseos y validaciones mínimas.

	        // Sugerencia: usa Integer.parseInt, Double.parseDouble, y para char usa str.charAt(0) si length==1.


	        // TODO: Asigna los valores convertidos a constantes (final):

	        // final int EDAD = ...;

	        // final double PRECIO_BASE = ...;

	        // final char CATEGORIA = ...;


	        // TODO: Realiza un cálculo simple con casting:

	        // - Calcula un recargo del 7.5% sobre PRECIO_BASE -> double total

	        // - Convierte ese total a centésimos (long centimos = Math.round(total * 100))

	        // - Castea centimos a int (intCentimos) SOLO si está en rango int; si no, imprime aviso.


	        // TODO: Imprime un resumen con todos los valores. Cierra el scanner.

	        sc.close();

	}

}
