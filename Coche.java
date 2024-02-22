
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

	public Coche(String nombre, String dni, String matricula, int kms, Tipo tipo, String modelo, String marca) {
		super(nombre, dni, matricula, kms, tipo);
		
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
