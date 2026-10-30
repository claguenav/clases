/**
 * Pedir tres números y mostrarlos ordenados de mayor a menor. 
 * (Utilizar el operador ternario)
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero 1: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		
		int mayor = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 ? num2 : num3);
		int menor = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 ? num2 : num3);
		int medio = (num1 + num2 +num3 ) - (mayor + menor);
		
		System.out.println("Orden: " + mayor + ", " + medio + ", " + menor);

		
		System.out.println();
		
		sc.close();
		
	}

}
