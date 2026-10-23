/**
 *  Crea un programa que pida la base y la altura de un triángulo y muestre su área.
    - 
    Área triángulo = (base *altura) /2
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dame la base de tu triangulo por favor: ");
		float base = sc.nextFloat();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Dame la altura de tu triangulo por favor: ");
		float altura = sc.nextFloat();
		sc.nextLine(); // Limpiar el buffer

		
		// calculo
		
		double area = (base*altura) /2;
		
		System.out.printf("El area de tu triangulo es: %.2fcm ", area );
		sc.close();
		

	}

}
