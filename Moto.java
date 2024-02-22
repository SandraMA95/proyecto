
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Moto' que hereda de la clase 'Vehiculo'
 */
public class Moto extends Vehiculo {

	private String modelo;

	private String marca;

	/**
	 * Constructor vacio de la clase 'Moto'
	 */
	public Moto() {

	}

	/**
	 * Constructor con todos los parametros de la clase 'Moto'
	 * 
	 * @param nombreProp
	 * @param matricula
	 * @param kms
	 * @param modelo
	 * @param marca
	 */
	public Moto(String nombreProp, String matricula, int kms, String modelo, String marca) {
		super(nombreProp, matricula, kms);

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

	

	@Override
	public String toString() {
		
		String aux; 
		
		aux = "[modelo_Moto=" + modelo + ", marca_Moto=" + marca + "]";
		
		return super.toString() + aux;
	}

}
