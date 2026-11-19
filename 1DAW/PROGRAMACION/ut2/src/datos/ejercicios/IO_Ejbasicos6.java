/**
 *  Escribir un programa que pida un numero por consola y muestre su valor absoluto.  
       
     a. Se puede hacer el cálculo utilizando 
        un operador ternario 
        	si n<0? -1*n : n
 */
package datos.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*
 */
public class IO_Ejbasicos6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dame un número por favor: ");
		int numero = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer
		
		System.out.println("Vamos a calcular el valor absoluto de " + numero);
		
		// calculo
		
		int absolutoSin = (numero < 0) ? -1 * numero : numero;
		
		// calculo con MATH
		
		System.out.println("El valor absoluto usando math es: " + Math.abs(numero));		
		System.out.println("El valor absoluto de " + numero + " es " + absolutoSin );
		sc.close();



	}

}
