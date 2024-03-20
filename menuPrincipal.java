
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

import proyecto.Coche.Tipo;

import java.util.ArrayList;

/**
 * Creacion clase 'menuPrincipal'
 */
public class menuPrincipal {

	/**
	 * Metodo principal de la clase 'menuPrincipal'
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList <Vehiculo> lista = new ArrayList <Vehiculo>();

		Coche c1 = new Coche("Pepe", "1234567D", "1234ABC", 30000, Tipo.TURISMO, "Kia", "Picanto");

		Moto m1 = new Moto("Pepa", "1234567P", "4321CBA", 16000, "Kawasaki", "Versys");

		c1.leerDatos();

		m1.leerDatos();

		c1.add(lista);

		m1.add(lista);

	}

}
