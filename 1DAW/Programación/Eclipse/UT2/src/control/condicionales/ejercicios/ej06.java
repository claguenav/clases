/**
 * 
 * Solicitar dos números distintos y mostrar cuál es el mayor
   a. Ampliar el ejercicio considerando si el 
     caso de que los dos números sean iguales.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un numero porfis: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Dame otro numero pero que sea distinto porfis: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if (num1 > num2) {
			
			System.out.println("Tu numero " + num1 + " es mayor que " + num2 + " felicidades :D");
			
		} else if (num1 == num2) {
			
			System.out.println("Oye te he dicho que los numeros sean distintos!!");
		} else
			
			System.out.println("Tu numero " + num2 + " es mayor que " + num1 + " felicidades :D");
		
		
		sc.close();
	}
  
}
