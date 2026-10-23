/**
 * En el concurso de lanzamiento de hueso de oliva,gana aquella persona 
 * que logra lanzarlo más lejos. 
 * El lanzamiento se mide en metros (con tantos decimales como se desee), 
 * pero para el ranquin sólo se tiene en cuenta la longitud en centímetros 
 * (sin decimales). 
 * 
 * Por ejemplo, para un lanzamiento de 4,3587 m (que son 4358,7 cm) 
 * sólo se contabilizarán 8 cm. 
 * 
 * Realiza un programa que solicite la longitud (en metros) de un 
 * lanzamiento y muestre la parte entera correspondiente en centímetros. 
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dime la longitud de lanzamiento en metros: ");
		double metros = sc.nextDouble();
		
		metros = metros * 100;
		
		System.out.printf("Se contabilizaran : %.0f%n", Math.floor(metros));
		
		sc.close();
		

	}

}
