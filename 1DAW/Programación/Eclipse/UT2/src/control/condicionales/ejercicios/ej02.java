/**
 * Escribe una aplicación que pida a la usuaria dos números enteros 
 * y muestre: true, si ambos números son distintos entre sí o alguno 
 * de ellos es cero; y false en caso contrario.
 * 
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ESTO SE PONE SOLO 1 VEZ
		System.out.println("Dame un número entero porfa: ");
		int num1 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		System.out.println("Dame otro número entero porfa: ");
		int num2 = sc.nextInt();
		sc.nextLine(); // limpiar buffer
		
		
		/*
		 * CON IFELSE Y SOLO USANDO AND (&&)
		 *  
		if	(num1 != num2) {
			System.out.println(true);
		} else if (num1 == 0 && num2 == 0){ // trad: num1 es igual a 0 y num2 es igual a 0
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		*/
		
		/*
		 *   EN UN IF USANDO OR  (||)
		 * 
		if	(num1 != num2 || num1 == 0 || num2 ==0) {
			System.out.println(true);
		} else
			System.out.println(false);
		}
		*/
		
		//  USANDO SOLO OPERADOR TERNARIO
		
		boolean ternario = (num1 != num2 || num1 == 0 || num2 == 0) ? true : false;
		
		System.out.println(ternario);
		
		sc.close(); // cerrar Scanner
		
	}
}



