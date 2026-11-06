/**
 * Desarrollad una aplicación Java que permita al usuario seleccionar entre el sistema de calificaciones español (0–10) y el estadounidense (0–100), introduciendo una nota para obtener su calificación correspondiente, para ello mostrar un menú para elegir entre España (1) y Estados Unidos (2). 

   Solicitar una calificación numérica según el sistema seleccionado. Se debe redondear la calificación a dos decimales. Se deben incluir comentarios que expliquen las condiciones, el flujo de ejecución y las decisiones de programación.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * Al principio habia pensado en hacer un Switch dentro de las decisiones de cada pais, al no poder he hecho un if y un else if dentro de cada if de cada pais para ir comparando las notas y dar la nota final
 * 
 */
public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el sistema de notas deseado: (1-2)");
		System.out.println("------------------------------------------");
		System.out.println("1 - Sistema de calificacion Español");
		System.out.println("2 - Sistema de calificacion Estadounidense");
		System.out.println("------------------------------------------");

		int sistema = sc.nextInt();
		
		sc.nextLine();
		
		// MENU
		
		if (sistema == 1) {
			System.out.println("==========================================");
			System.out.println("Has elegido el sistema Español");
			System.out.println("==========================================");

			
		} else if (sistema == 2) {
			
			System.out.println("Has elegido el sistema Estadounidense");
			System.out.println("------------------------------------------");


			
		} else
			System.out.println("Opción inválida");
		
		
		// SELECCION DE NOTA
		System.out.println("------------------------------------------");
		System.out.println("Introduce la nota de tu exámen: ");
		System.out.println("------------------------------------------");

		double nota = sc.nextDouble();
		
		if (sistema == 1 && nota <= 10) { // SISTEMA ESPAÑOL
			
			nota = Math.round(nota * 100.0) / 100.0; // redondear a 2 decimales
			
			if (nota >= 9 && nota <= 10) {
				
				System.out.println("Tu resultado es sobresaliente " + nota);
				
			} else if (nota >= 7 && nota <= 8) {
				
				System.out.println("Tu resultado es notable " + nota);

			} else if (nota >= 6 ) {
				
				System.out.println("Tu resultado es Bien " + nota);

				
			} else if (nota >= 5) {
				
				System.out.println("Tu resultado es Suficiente " + nota);

			}  else if (nota >= 0 && nota <= 4) {
				
				System.out.println("Tu resultado es Insuficiente " + nota);

			} else {
				System.out.println("Nota no valida");
			}
			
		} else if (sistema == 2 && nota <= 100) { // SISTEMA ESTADOUNIDENSE
			
			nota = Math.round(nota * 100.0) / 100.0; // redondear a 2 decimales
		
			if (nota >= 93 && nota <= 100 ) {
				
				System.out.println("Tu resultado es A " + nota);

			} else if (nota >= 90 && nota <= 92.99 ) {
				
				System.out.println("Tu resultado es A- " + nota);

			} else if (nota >= 87 && nota <= 89.99 ) {
				
				System.out.println("Tu resultado es B+ " + nota);

			} else if (nota >= 83 && nota <= 86.99 ) {
				
				System.out.println("Tu resultado es B " + nota);

			} else if (nota >= 80 && nota <= 82.99 ) {
				
				System.out.println("Tu resultado es B- " + nota);

			} else if (nota >= 77 && nota <= 79.99 ) {
				
				System.out.println("Tu resultado es C+ " + nota);

			} else if (nota >= 73 && nota <= 76.99 ) {
				
				System.out.println("Tu resultado es C " + nota);

			} else if (nota >= 70 && nota <= 72.99 ) {
				
				System.out.println("Tu resultado es C- " + nota);

			} else if (nota >= 67 && nota <= 69.99 ) {
				
				System.out.println("Tu resultado es D+ " + nota);

			} else if (nota >= 60 && nota <= 66.99 ) {
				
				System.out.println("Tu resultado es D " + nota);

			} else if (nota >= 0 && nota <= 59.99 ) {
				
				System.out.println("Tu resultado es F " + nota);

			} else {
				
				System.out.println("Nota no valida");
			}
		
		} else
			
			System.out.println("Nota no valida");
	
		sc.close();

	}

}
