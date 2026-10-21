/**
 * 
 */
package datos.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class lapulgatest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // El programa se ejecuta procesando casos de prueba hasta que no haya más datos (EOF)
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt(); // Número de pasos que tiene la barra
            int f = scanner.nextInt(); // Factor por el que se multiplica
            int t = scanner.nextInt(); // Tiempo que la tecla ha estado pulsada
            
            // La barra tiene valores de 0 a n, lo que significa que el ciclo es de n + 1 estados.
            // Calculamos en qué estado se encuentra la barra en el instante t.
            int potenciaBase = t % (n + 1);
            
            // Calculamos la potencia de salto aplicando el multiplicador
            int potenciaSalto = potenciaBase * f;
            
            // Imprimimos el resultado
            System.out.println(potenciaSalto);
        }
        
        scanner.close();
	}

}
