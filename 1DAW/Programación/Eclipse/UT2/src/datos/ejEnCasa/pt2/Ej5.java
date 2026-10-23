/**
 * Objetivo: usar constantes de límite y métodos de conversión de los wrappers.

Enunciado:

    Muestra por consola Byte.MIN_VALUE, Byte.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE, y comenta qué representan.

    Intenta convertir con Long.valueOf("9223372036854775807") (límite long) y con "9223372036854775808" (una unidad más). Maneja el fallo de forma segura (primero comprueba longitud y primer dígito, o intenta parsear y captura el error si decides usar try/catch; si prefieres evitar excepciones, valida antes).

    Convierte 12345 a String con String.valueOf y con Integer.toString; luego convierte de vuelta con Integer.valueOf.

    Muestra la diferencia entre new Integer(5) y Integer.valueOf(5) (explica por qué no se recomienda usar el constructor).

Pistas: constantes MIN_VALUE/MAX_VALUE, valueOf, toString, construcción vs valueOf.
 */
package datos.ejEnCasa.pt2;

/**
 * 
 */
public class Ej5 {

	/**
	 * @param args
	 */
	public class LimitesYConversionesWrapper {


	    public static void main(String[] args) {

	        // TODO: Imprime MIN_VALUE y MAX_VALUE de Byte, Short, Integer y Long.

	        // Ej: System.out.println("Byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);


	        // TODO: Intenta Long.valueOf("9223372036854775807") e imprímelo.


	        // TODO: Antes de parsear "9223372036854775808", valida (p. ej., longitud / primer dígito) o explica que causaría NumberFormatException.

	        // (No es obligatorio usar try/catch; puedes solo comentar la validación y evitar el parseo si no es seguro.)


	        // TODO: Convierte 12345 a String con String.valueOf y con Integer.toString; imprime ambos.

	        // TODO: Convierte ese String de vuelta a Integer con valueOf e imprímelo.


	        // TODO: Explica en comentarios por qué no se recomienda new Integer(5) frente a Integer.valueOf(5).

	}

}
