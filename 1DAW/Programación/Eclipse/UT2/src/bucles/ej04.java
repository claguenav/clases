/**
 * Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 10 (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).
Nota: Uso de clase Math

 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int numero = 0;
		double numSecreto = 0;
		int numEntero = 0;
		String mensajePred = "Introduce un numero desde el 1 al 10 hasta acertar el numero secreto, para terminar el programa introduce -1";
		String rendido = "Te has rendido!";
		String ganado = "Felicidades has adivinado el numero secreto, eres un maquina";
		String numEsMayor = "El numero es mayor";
		String numEsMenor = "El numero es menor";
		
		numSecreto = Math.random();
		numSecreto = numSecreto * 10;
		numEntero = (int) numSecreto; // numEntero es igual a numSecreto pero en INT
		numEntero += 1; // si lo hago al reves le cambio la variable a 1
		/*
		 * lineas 26-29 es para convertir el double a int y para que me de un numero entre 1 y 10
		 */		
		
		while (numero != numEntero && numero != -1) { // si numero secreto Y numero es igual a -1 se acaba el programa
			System.out.println(mensajePred);
			numero = sc.nextInt();
			
			// saber si el numero introducido es mayor o menor que el numero secreto
			if (numero > numEntero) {
				System.out.println(numEsMenor);
			} else if (numero < numEntero) {
				System.out.println(numEsMayor);
			}
			
			// cerrar el programa si se introduce -1 o el numerosecreto
			if (numero == -1) {
				 System.out.println(rendido);
				 
			} else if (numero == numEntero) {
				System.out.println(ganado);
				
			}   
		}
		sc.close(); // cerrar buffer
	}

}
