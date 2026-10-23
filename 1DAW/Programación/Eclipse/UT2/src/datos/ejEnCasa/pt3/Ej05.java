/**
 * 
 */
package datos.ejEnCasa.pt3;
import java.util.Scanner;

/**
 *   En esta clase se consultan las preferencias sobre tipo de juego de los/as usuarios/as
 */
public class Ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Pide "¿Aceptas términos? (true/false): " y lee con next(). Convierte con Boolean.valueOf a Boolean (wrapper).
        System.out.print("¿Aceptas términos? (true/false): ");
        String aceptaTxt = sc.next();
        sc.nextLine();
        Boolean acepta = Boolean.valueOf(aceptaTxt);
        boolean acept = Boolean.parseBoolean(aceptaTxt);
        
        // TODO: Pide "Género preferido de juego (A=Acción, R=Rol, D=Deportes): " y lee String.
        System.out.print("¿Qué género deseas? (A=Acción, R=Rol, D=Deportes): ");
        // Toma el primer carácter si la longitud>0. Usa Character.toUpperCase para normalizar.
        String gen = sc.nextLine();
        char genero = 's';
        if(gen.length() == 1) {
            genero = gen.charAt(0);
        }

        // TODO: Declara constantes:
        final char ACCION = 'A', ROL = 'R', DEPORTES = 'D';

        // TODO: Usa if/else-if/else para imprimir el género elegido o "opción no válida".
        if (genero == ACCION || genero == ROL || genero == DEPORTES) {
            System.out.print("Género preferido (A/R/D): " + genero);
        }
        // TODO: Imprime el valor booleano aceptado mostrando diferencia entre Boolean (objeto) y boolean (primitivo) con unboxing.
        System.out.println("¿Se han aceptado los términos de la aplicación? (Boolean)" + acepta);
        System.out.println("¿Se han aceptado los términos de la aplicación? (boolean)" + acept);

        // TODO: Añade comentario Javadoc sobre la clase y el main.



        sc.close();
	}

}
