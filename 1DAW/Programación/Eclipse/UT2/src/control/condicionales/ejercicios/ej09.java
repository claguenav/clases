/**
 *Pedir los coeficientes de una ecuación de segundo grado y 
 *mostrar sus soluciones reales. Si no existen, habrá que indicarlo. 
 *
 *Hay que tener en cuenta que las soluciones de una ecuación de 
 *segundo grado ax2 + bx + c = 0, son:
 *
 * *foto de la ecuacion*
 *
 */
package control.condicionales.ejercicios;
import java.util.Scanner;
import java.lang.Math;

/**
 * CORREGIR
 */
public class ej09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double resultado1 = 0.0;
		double resultado2 = 0.0;
		
		String mensajeresultado;
		
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("primer coeficiente:");
		int coef1 = sc.nextInt();
		sc.nextLine();
		System.out.println("segundo coeficiente:");
		int coef2 = sc.nextInt();
		sc.nextLine();
		System.out.println("tercer coeficiente:");
		int coef3 = sc.nextInt();
		sc.nextLine();
		//
		
		// 1º calculo = b^2 - 4*a*c
		double determinante = (Math.pow(coef2, 2) - 4*coef1*coef3);
		double raiz = 0;
		double equis = 0;
		// el determinante solo se tiene en cuenta si es positivo
		if (determinante > 0 && coef1 > 0) {
			 raiz = Math.sqrt(determinante);
			 resultado1 = (-coef2 + raiz)/2*coef2;
			 resultado2 = (-coef2 - raiz)/2*coef2;
			 System.out.println("La ecuación tiene dos soluciones reales: ");
			 System.out.println("Primer resultado = " + resultado1);
			 System.out.println("Segundo resultado = " + resultado2);

		} else  {
			
			mensajeresultado = "No existen soluciones reales para el determinante";
			System.out.println(mensajeresultado);
		}
		//
		sc.close();
		
	}

}
