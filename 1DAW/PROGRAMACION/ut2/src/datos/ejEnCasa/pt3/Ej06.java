/**
 * 
 */
package datos.ejEnCasa.pt3;
import java.util.Scanner;

/**
 * 
 */
public class Ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // TODO: Pide tres textos:

        // - "Introduce un entero: " (leer con nextLine)

        // - "Introduce un decimal: "

        // - "Introduce un carácter (1 letra): "


        // TODO: Convierte los dos primeros con Integer.parseInt y Double.parseDouble.

        // Para el carácter, toma charAt(0) sólo si la longitud es 1 (si no, muestra aviso).


        // TODO: Declara constantes inmutables con los valores convertidos (final int, final double, final char).


        // TODO: Realiza conversiones:

        // - Widening: int -> double (automático)

        // - Narrowing: double -> int (cast explícito). Comenta la pérdida de decimales.

        // - Usa wrappers: Integer.valueOf(int), Double.valueOf(double), Character.valueOf(char)


        // TODO: Convierte a String con String.valueOf() y con toString() de los wrappers. Imprime diferencias (si las hay).


        // TODO: Muestra un resumen final con todos los tipos y valores.


        sc.close();
	}

}
