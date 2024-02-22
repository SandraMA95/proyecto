
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion clase 'menuPrincipal'
 */
public class menuPrincipal {

	/**
	 * Metodo principal de la clase 'menuPrincipal'
	 * @param args
	 */
	public static void main(String[] args) {
		
		Coche c1 = new Coche("Pepe","1234ABC", 30000 , "Kia", "Picanto");
		
		Moto m1 = new Moto();
		
		System.out.println(c1.toString());

	}

}
