
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Moto'
 */
public class Moto extends Vehiculo {
	
	private String marca;
	
	private String modelo;

	/**
	 * Constructor con todos los parametros de la clase 'Moto'
	 * @param nombre
	 * @param dni
	 * @param matricula
	 * @param kms
	 * @param tipo
	 * @param marca
	 * @param modelo
	 */
	public Moto(String nombre, String dni, String matricula, int kms, Tipo tipo, String marca, String modelo) {
		super(nombre, dni, matricula, kms, tipo);
		
		this.marca = marca;
		
		this.modelo = modelo;
	}

	/**
	 * Metodo para conocer valor del parametro 'marca'
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Metodo para establecer valor del parametro 'marca'
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo para conocer valor del parametro 'modelo'
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Metodo para establecer valor del parametro 'modelo'
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	

}
