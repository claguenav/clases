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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("primer coeficiente (a):");
        int coef1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("segundo coeficiente (b):");
        int coef2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("tercer coeficiente (c):");
        int coef3 = sc.nextInt();
        sc.nextLine();
        
        // Validación: 'a' no puede ser 0
        if (coef1 == 0) {
            System.out.println("El primer coeficiente no puede ser 0 (no es una ecuación de segundo grado).");
            sc.close();
            return;
        }
        
        // 1º cálculo = b^2 - 4*a*c
        double determinante = Math.pow(coef2, 2) - 4 * coef1 * coef3;
        
        // El determinante debe ser mayor o igual a 0 para tener soluciones reales
        if (determinante >= 0) {
             double raiz = Math.sqrt(determinante);
             
             // Corrección del denominador: agrupado entre paréntesis y usando coef1 (a)
             resultado1 = (-coef2 + raiz) / (2.0 * coef1);
             resultado2 = (-coef2 - raiz) / (2.0 * coef1);
             
             if (determinante == 0) {
                 System.out.println("La ecuación tiene una única solución real: ");
                 System.out.println("Resultado = " + resultado1);
             } else {
                 System.out.println("La ecuación tiene dos soluciones reales: ");
                 System.out.println("Primer resultado = " + resultado1);
                 System.out.println("Segundo resultado = " + resultado2);
             }

        } else  {
            System.out.println("No existen soluciones reales para el determinante.");
        }
        
        sc.close();
		
	}

}
