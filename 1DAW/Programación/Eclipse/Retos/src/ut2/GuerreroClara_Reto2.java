/**
 * 
 */
package UT2;
import java.util.Scanner;

/**
 * 
 */
public class GuerreroClara_Reto2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// menu
		System.out.println("--- Pista de padel ---");
		System.out.println("Selecciona entrada o alquiler (1-2):");
		System.out.println("1. Entrada");
		System.out.println("2. Alquiler");
		System.out.println("------------------");

		int opcion = sc.nextInt();
		sc.nextLine(); // LIMPIAR BUFFER
		
		// MENU 
		 
		if (opcion == 1) { // ENTRADA PISTA
			
			System.out.println("=======================");
			System.out.println("Has seleccionado comprar entrada");
			System.out.println("=======================");
			System.out.println("Indique su edad:");
			System.out.println("=======================");
			int edad = sc.nextInt();
			sc.nextLine(); // LIMPIAR BUFFER
			double tarifaPist = 12; // precio de la entrada
			
			
			if (edad >0 && edad <=120 ) { // entre 0 y 120 años
				
				System.out.println("Tiene " + edad + " años" );
				
				
				if (edad < 12) { 
					// menor de 12 años descuento 50%
					System.out.println("Descuento del 50%");
					// calculo descuento
					double descuento = tarifaPist * 0.5; 
					tarifaPist = tarifaPist - descuento;
					tarifaPist = Math.round(tarifaPist *100)/100; // Redondear a 2 decimales

		
					System.out.println("Coste de entrada: " + tarifaPist + " €"); 

					
				} else if ( edad > 12 && edad <=25 ) {
					// entre 12 y 25 años descuento 25%
					System.out.println("Descuento 25%");
					// calculo descuento
					double descuento = tarifaPist * 0.25;
					tarifaPist = tarifaPist - descuento;
					tarifaPist = Math.round(tarifaPist *100)/100; // Redondear a 2 decimales

					System.out.println("Coste de entrada: " + tarifaPist + " €"); 

				} else if (edad >= 65 ) {
					// 65 años o más descuento 30%
					
					System.out.println("Descuento 30%");
					// calculo descuento
					double descuento = tarifaPist * 0.3;
					tarifaPist = tarifaPist - descuento;
					tarifaPist = Math.round(tarifaPist *100)/100; // Redondear a 2 decimales

					System.out.println("Coste de entrada: " + tarifaPist + " €"); 

					
				} else {
					// resto de usuarios tarifa completa
					System.out.println("Coste de entrada:" + tarifaPist + " €"); 
					// Honestamente no he repasado cómo se hace con printf, pero considero que imprimirlo asi sería más correcto

				}
				
			} else // EDAD MAL
			System.out.println("Seccione una edad valida, vuelva a intentar");
			
			
			

			
		} else if (opcion == 2) { // ALQUILAR PISTA
			System.out.println("=======================");
			System.out.println("Has seleccionado alquilar la pista");
			System.out.println("=======================");
			System.out.println("Indica el tiempo que desea alquilar");
			System.out.println("=======================");

			int horas = sc.nextInt();
			sc.nextLine(); // LIMPIAR BUFFER
			int tarifaAlq = 8; // tarifa alquiler 
			
			if ( horas >0 && horas <= 60 ) {
				// hasta una hora
				
				System.out.println("El alquiler sera de 8€");
				
			} else if (horas >= 61 && horas <=120) {
				//mas de una hora y hasta 2 horas
				
				System.out.println("El alquiler sera de 15€");				
			} else if ( horas >= 121 && horas <=180) {
				// mas de 2 horas y hasta 3 horas
				
				System.out.println("El alquiler sera de 21€");
			} else if ( horas >= 181) {
				// mas de 3h = 6€ por hora
				int total = (horas/60)* 6;
				
				System.out.println("El alquiler sera de: " + total + " €");
		
			} else
			
				System.out.println("Opcion invalida, vuelva a intentar");
		
			}
		
		/*
		 * La opcion 2, de alquilar una pista creo que se podria haber hecho también con switch, pero al no poder poner numeros decimales creo que sería mas dificil implementarlo
		 * si el usuario pone que alquila la pista 1h y media o similares
		 * 
		 */
		
		
		sc.close();
		
		
		

	}

}
