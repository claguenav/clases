/**
 * 
 */
package datos.ejEnCasa.pt1;

/**
 * 
 */
public class Ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Supón que llegan estos textos desde usuario/archivo:

        String txtEntero = "42";

        String txtDecimal = "19.99";

        String txtBoolean = "true";

        String txtChar = "A";


        // TODO: Convierte:

        // - txtEntero -> int
        int txtentero = Integer.parseInt(txtEntero); // Explicar
        // - txtDecimal -> double
        double txtdecimal = Double.parseDouble(txtDecimal);
        // - txtBoolean -> boolean
        boolean txtboolean = Boolean.parseBoolean(txtboolean);
        // - txtChar (debe tener longitud 1) -> char
       
        // TODO: Si txtChar no tiene longitud 1, no lo conviertas (imprime aviso).

        

        // TODO: Convierte de vuelta a String usando String.valueOf y concaténalos en una sola línea.

        // Ej: "int=42 | double=19.99 | boolean=true | char=A"


        // TODO: Imprime el resultado.
        
        System.out.println(txtentero);
        System.out.println(txtdecimal);


	}

}
