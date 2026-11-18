/**
 * 
 */
package bucles;
import java.util.Scanner;

/**
 * 
 */
public class ej07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("resultado");
		
		for (int i = 1; i <= numero; i++) {
            System.out.println(i * 7);
		
		}

	}

}
