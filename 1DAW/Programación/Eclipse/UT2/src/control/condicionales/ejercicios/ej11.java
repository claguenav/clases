/**
 *    Pedir una nota entera de O a 10 y mostrarla de la siguiente forma:
    • Insuficiente (de 0 a 4)
    • Suficiente (5)
    • Bien (6) 
    • Notable (7 y 8)
    • Sobresaliente (9 y 10)
 */
package control.condicionales.ejercicios;
import java.util.Scanner;

/**
 * 
 */
public class ej11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la nota de tu examen: ");
		int nota = sc.nextInt();
		
		// switch
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente!");
			break;

		case 5:
			System.out.println("Suficiente");
			break;
		case 6: 
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Esa nota no sirve");
		}
		
		
		
		sc.close();
	}

}
