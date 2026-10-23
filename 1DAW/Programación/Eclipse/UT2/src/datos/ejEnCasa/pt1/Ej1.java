/**
 * 
 */
package datos.ejEnCasa.pt1;

/**
 * 
 */
public class Ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO: Declara estas constantes con el tipo adecuado:

        // - final int MAX_REINTENTOS = 3

        // - final long LIMITE_DIARIO = 2_000_000L

        // - final float IMPUESTO = 0.21F

        // - final double DESCUENTO = 0.075
		
		final int MAX_REINTENTOS = 3;
		final long LIMITE_DIARIO = 2000000L;
		final float IMPUESTO = 0.21f;
		final double DESCUENTO = 0.075;
		
		
        // TODO: Realiza una conversión implícita; widening (segura) de int -> double usando MAX_REINTENTOS.

		double max_reintentos = MAX_REINTENTOS;
		
		System.out.println(max_reintentos); //OK 
		

        // TODO: Realiza una conversión explícita: narrowing (con cast) de double -> int usando DESCUENTO*1000.
		
		int descuento = (int) DESCUENTO * 1000;
		
		System.out.println(descuento ); // OK

        // Explica en un comentario qué ocurre con los decimales.

		/*
		 * Creo que porque el valor original era 0.0075 pues lo hha redondeado parriba y se los ha comio nomnom
		 */
		
		

	}

}
