/**
 * Una vendedora de materiales de construcción desea calcular los beneficios 
 * anuales que obtiene de la venta de placas de pladur y perfilería.
 *  Por ese motivo, es necesario diseñar una aplicación que solicite las ventas 
 *  (en unidades) de cada semestre para cada fruta. 
 *  La aplicación mostrará el importe total sabiendo que la pieza de pladur 
 *  está fijado en 14,20 € y los perfiles cuestan 7,20€ cada uno.
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// DATOS FIJOS
		final float PLADUR = 14.20f;
		final float PERFILES = 7.20f;

		// DATOS SCANNER
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		
		// pladur
		System.out.println("Cuantas piezas de pladur has comprado el primer semestre: ");
		int piezasP1 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Cuantas piezas de pladur has comprado el segundo semestre: ");
		int piezasP2 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		// perfiles
		System.out.println("Cuantas piezas de perfil has comprado el primer semestre: ");
		int piezasPer1 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Cuantas piezas de perfil has comprado el segundo semestre: ");
		int piezasPer2 = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		
		// calculo // MEJORAR LA FORMULA Y MIRAR LO DEL DOUBLE
		
		int totalP = piezasP1 + piezasP2;
		double beneficioP = totalP * PLADUR; 
		int totalPer = piezasPer1 + piezasPer2;
		double beneficioPer = totalPer * PERFILES;  
		double total = totalP + totalPer;
		
		
		
		
		// IMPRIMIR
		
		
		System.out.println("El total de pladur vendido en todo el año: " + totalP + " piezas" );
		System.out.println("El total de perfiles vendidos en todo el año: " + totalPer + " piezas" );
		System.out.println("--------------------------------------------------");
		System.out.printf("El beneficio total del año es:  %.2f€", total); // asi no se pone feo el euro %.2f%n con esto se pone feo 
		sc.close();

		/*
		 * IMPORTANTE PONER printf !!! y %.2f%n para que salga en decimal
		 * para unirl con una variable es con una
		 * Para poner el simbolo de euro se pone tambien entre las comillas,
		 * todo lo q vaya de texto en las comillas!
		 * 
		 */


	}

}
