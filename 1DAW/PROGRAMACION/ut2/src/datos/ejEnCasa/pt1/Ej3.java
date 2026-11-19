/**
 * 
 */
package datos.ejEnCasa.pt1;

/**
 * TREPASAR BIEN ESTO QUE ME LIO MUXO
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
      //  boolean txtboolean = Boolean.parseBoolean(txtboolean);
        boolean bol = Boolean.parseBoolean(txtBoolean);
        // - txtChar (debe tener longitud 1) -> char
       
        // TODO: Si txtChar no tiene longitud 1, no lo conviertas (imprime aviso).

        char ch = (txtChar.length() == 1) ? txtChar.charAt(0): null; //NO ENTIENDO NI PAPA DE ESTO 

        // TODO: Convierte de vuelta a String usando String.valueOf y concaténalos en una sola línea.

        // Ej: "int=42 | double=19.99 | boolean=true | char=A"

        String booleano = String.valueOf(bol);
        String entero = String.valueOf(txtentero);
        String decimal = String.valueOf(txtdecimal);
        String charo = String.valueOf(ch);
        

        // TODO: Imprime el resultado.
        
        System.out.println("int = "+entero + " double = " + decimal + " boolean = " + booleano + " char = " + charo );
 

	}

}
