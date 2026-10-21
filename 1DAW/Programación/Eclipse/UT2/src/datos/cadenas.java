/**
 * 
 */
package datos;

/**
 * 
 */
public class cadenas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 	String vacia = "";
		 	String espaciBlanco = " ";
		 	String nombre = "Clara";
		 // String 2nombre = "Clara 2"; Los identificadores no pueden comenzar con NUMERO
		 	String nombre2 = "Guerrero";
		 	String apellido = "Navarro";
		// 	String apellido-2 = "Navarro" No pueden usarse operadores aritmeticos
		 	String apellido_2 = "Perez";
		 	String nombreCompleto = nombre + " " + nombre2 + " " + apellido; // Clara Guerrero Navarro
		 	String nombreCompleto2 = nombre + espaciBlanco + nombre2 + espaciBlanco + apellido; // Clara Guerrero Navarro
		 	System.out.println(nombreCompleto);
		 	System.out.println(nombreCompleto2);
	}

}
