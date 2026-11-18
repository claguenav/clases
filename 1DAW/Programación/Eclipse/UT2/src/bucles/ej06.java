/**
 * 
 */
package bucles;

import java.util.Scanner;

/**
 * 
 */
public class ej06 {

	/**
	 * @param args
	 */
	// NO FUFA
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int alturaArbol = 0;
		int etiquetaArbol = 0;
		int	etiquetaMasAlto = -1;
		int mayorAltura = -1;
		
		String mensajePrincipal = "Introduce la altura del alrbol en centimetros";
		String mensajeTerminar = "Para terminar el programa introduce -1";
		
		
		while (alturaArbol == 0 ); {

			System.out.println(mensajePrincipal);
			System.out.println(mensajeTerminar);
			alturaArbol = teclado.nextInt();
			teclado.nextLine();
			
			if (alturaArbol > mayorAltura) {
				
				mayorAltura = alturaArbol;
				etiquetaMasAlto = etiquetaArbol;
				
			}
			
			etiquetaArbol += 1;
			
			if (mayorAltura != 1) {
				System.out.println("El arbol mas alto tiene la etiqueta " + etiquetaMasAlto);
			}else {
				System.out.println("No se introdujo na");
			}
			
		} 
		
		
		teclado.close();
	}

}
