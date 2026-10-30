/**
 * Crear una aplicación que solicite un número entre el 1 y el 7 e imprima por pantalla el correspondiente día de la semana.
   a. Lo mismo para el mes.
 */
package control.condicionales.ejercicios;
import java.util.Scanner;
/**
 * 
 */
public class ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número del 1 al 7: ");
		int dia = sc.nextInt();
		System.out.println("Ahora dame un número del 1 al 12: ");
		int mes = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Día: Lunes");
			break;
		case 2:
			System.out.println("Día: Martes");
			break;
		case 3:
			System.out.println("Día: Miercoles");
			break;
		case 4:
			System.out.println("Día: Jueves");
			break;
		case 5:
			System.out.println("Día: Viernes");
			break;
		case 6:
			System.out.println("Día: Sábado");
			break;
		case 7:
			System.out.println("Día: Domingo");
			break;
		default:
			System.out.println("Me he rallao, no es un numero entre 1 y 7");
		}
		
		
		switch (mes) {
		case 1:
			System.out.println("Mes: Enero");
			break;
		case 2:
			System.out.println("Mes: Febrero");
			break;
		case 3:
			System.out.println("Mes: Marzo");
			break;
		case 4:
			System.out.println("Mes: Abril");
			break;
		case 5:
			System.out.println("Mes: Mayo");
			break;
		case 6:
			System.out.println("Mes: Junio");
			break;
		case 7:
			System.out.println("Mes: Julio");
			break;
		case 8:
			System.out.println("Mes: Agosto");
			break;
		case 9:
			System.out.println("Mes: Septiembre");
			break;
		case 10:
			System.out.println("Mes: Octubre");
			break;
		case 11:
			System.out.println("Mes: Noviembre");
			break;
		case 12:
			System.out.println("Mes: Diciembre");
			break;
		default:
			System.out.println("Me he reallao, no es un numero entre 1 y 12");
		}
		
		sc.close();
	}

}
