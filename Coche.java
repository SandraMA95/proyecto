
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Coche'
 */
public class Coche extends Vehiculo {
	
	private String modelo;
	
	private String marca;
	
	
	/**
	 * Constructor vacio de la clase 'Coche'
	 */
	public Coche() {
		
	}
	

	/**
	 * Constructor con todos los parametros de la clase 'Coche'
	 * @param nombreProp
	 * @param matricula
	 * @param kms
	 * @param marca
	 * @param modelo
	 */
	public Coche(String nombreProp, String matricula, int kms,String marca, String modelo) {
		super(nombreProp, matricula, kms);

		this.marca = marca;
		
		this.modelo = modelo;
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

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	

}
