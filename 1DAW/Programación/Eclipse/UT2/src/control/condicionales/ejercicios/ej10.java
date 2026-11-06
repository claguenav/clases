/**
 * Escribir una aplicación que indique cuántas cifras tiene un número entero 
 * introducido por teclado. El máximo valor será 3999.
 * 
 * 
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int solucion = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica un numero del 1 al 3999:");
        int numero = sc.nextInt();
        
        // Evaluamos de menor a mayor rango
        if (numero >= 1 && numero < 10) {
            solucion = 1;
        } else if (numero < 100) {  // Ya sabemos que es >= 10 porque falló la anterior
            solucion = 2;
        } else if (numero < 1000) { // Ya sabemos que es >= 100
            solucion = 3;
        } else if (numero < 4000) { // Ya sabemos que es >= 1000
            solucion = 4;
        } else {
            System.out.println("Tu número no sirve (debe estar entre 1 y 3999).");
            sc.close();
            return; // Salimos del programa para no imprimir un resultado vacío
        }
        
        System.out.printf("El número tiene %d cifras\n", solucion);
                
        sc.close();
	}

}
