/**
 * 
 */
package datos.ejEnCasa.pt2;

/**
 * 
 */
public class Ej4 {

	/**
	 * @param args
	 */
	
	    public static void main(String[] args) {

	        // Datos de entrada (simulados)
	        String sEntero = "42";
	        String sDecimal = "19.75";
	        String sBoolean = "true";

	        // TODO: Convierte "42" a int (Integer.parseInt) y a Integer (Integer.valueOf).
	        int ent = Integer.parseInt(sEntero);
	        Integer entero = Integer.valueOf(sEntero);
	        // TODO: Imprime ambos valores y su tipo (usa getClass().getSimpleName() para el wrapper).
	        // Profundizaremos en esta parte en la unidad siguiente
	        System.out.println(ent);
	        System.out.println("Tenemos un objeto de tipo: " + entero.getClass().getSimpleName() + " su valor es: " + entero.intValue());

	        // TODO: Convierte "19.75" a double (parseDouble) y a Double (valueOf) e imprímelos.
	        double dob = Double.parseDouble(sDecimal);
	        Double dob2 = Double.valueOf(sDecimal);

	        // TODO: Convierte "true" a boolean y a Boolean e imprímelos.
	        boolean bool = Boolean.parseBoolean(sBoolean);
	        Boolean bool2 = Boolean.valueOf(sBoolean);


	}

}
