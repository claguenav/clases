/**
 * Escribir un programa que pida la hora, solicitando primero la hora, después los minutos y, por último, los segundos. El programa debe mostrar qué hora será un segundo más tarde.
 * 
 * CODIGO DE MARIA
 */
package control.condicionales.ejercicios;
import java.util.Scanner;
/**
 * 
 */
public class ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la hora:");
		int hora = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dime los minutos:");
		int minutos = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dime los segundos:");
		int segundos = sc.nextInt();
		sc.nextLine();
		
		System.out.println("La hora inicial es: " + hora + ":" + minutos + ":" + segundos);
		
	
		if (segundos <59 ) {
			segundos +=1;
			
		} else {
			
			segundos = 0;
			if(minutos <59) {
				minutos+=1;
				
			} else {
				minutos=0;
			}
		
		}
		
		if (hora <23) {
			hora +=1;
		} 
		else {
			hora = 0;
			
		} 
		
		// 
		
		System.out.println(hora + ":" + minutos + ":" + segundos);
		 
	
		
	
		
		
		sc.close();
	}

}
