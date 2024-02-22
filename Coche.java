
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;
/**
 * Creacion de la clase 'Coche'
 */
public class Coche extends Vehiculo {

	private String marca;

	private String modelo;

	private Tipo tipo;

	enum Tipo {

		TURISMO, CAMION, AUTOBUS, FURGONETA
	}

	/**
	 * Constructor con todos los parametros de la clase 'Coche'
	 * @param nombre
	 * @param dni
	 * @param matricula
	 * @param kms
	 * @param tipo
	 * @param modelo
	 * @param marca
	 */
	public Coche(String nombre, String dni, String matricula, int kms, Tipo tipo, String modelo, String marca) {
		super(nombre, dni, matricula, kms);

		this.marca = marca;

		this.modelo = modelo;
	}

	/**
	 * Metodo para conocer valor del parametro 'modelo'
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Metodo para establecer valor del parametro 'modelo'
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Metodo para conocer valor del parametro 'marca'
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Metodo para establecer valor del parametro 'marca'
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo para conocer valor del parametro 'tipo'
	 * @return tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Metodo para establecer valor del parametro 'tipo'
	 * @param tipo
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Metodo para leer datos de la clase 'Coche'
	 */
	public void leerDatos() {
		
		System.out.println(super.toString() + toString());
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + "]";
	}

	

}
