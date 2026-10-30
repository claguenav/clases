/**
 * Escribir una aplicación que indique cuántas cifras tiene un número entero 
 * introducido por teclado. El máximo valor será 3999.
 * 
 * 
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * CORREGIR
 */
public class ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cifras = 0;
		int solucion = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica un numero del 1 al 3999");
		int numero = sc.nextInt();
		
		
		
		if (numero < 4000) {
			solucion = 4;
		} else if (numero <1000) {
			solucion = 3;
		} else if (numero < 100) {
			solucion = 2;
		} else if (numero < 10) {
			solucion = 1; 	
		} else {
			System.out.println("Tu numero no sirve");
		}
		
			
	
		
		System.out.printf("El numero tiene %d cifras" , solucion);
				
		sc.close();
	}

}
