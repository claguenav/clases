/**
 * Declara tres variables Integer: a = 10, b = null, c = 20.

    Calcula la suma a + c usando unboxing implícito y muéstrala.

    Intenta calcular a + b y observa qué ocurre. Después, modifícalo para evitar el error (por ejemplo, sustituyendo null por 0 de forma segura antes de sumar).

    Implementa un método static int safeUnbox(Integer x, int defaultValue) que devuelva x si no es null, o defaultValue si lo es. Úsalo para sumar sin fallar.

Pistas: autoboxing/unboxing, null, método de utilidad propio.
 */
package datos.ejEnCasa.pt2;

/**
 * 
 */
public class Ej1 {

	/**
	 * @param args
	 */
	
	
	  public static int safeUnbox(Integer x, int defaultValue) {

	        // TODO: Si x es null, devuelve defaultValue; si no, devuelve x (unboxing).

	        return 0; // reemplazar

	    }


	    public static void main(String[] args) {

	        // TODO: Declara Integer a = 10, b = null, c = 20.


	        // TODO: Calcula e imprime la suma a + c (unboxing implícito).


	        // TODO: Intenta calcular a + b y observa el fallo (comenta la línea que falla).


	        // TODO: Usa safeUnbox para sumar a + safeUnbox(b, 0) sin error e imprime el resultado.


	        // TODO: Explica en comentarios por qué ocurre el NPE al hacer a + b.
	}

}
