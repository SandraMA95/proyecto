
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Vehiculo'
 */
public class Vehiculo {
	
	private String nombreProp;
	
	private String matricula;
	
	private int kms;
	
	/**
	 * Constructor vacio de la clase Vehiculo
	 */
	public Vehiculo() {
	}

	/**
	 * Constructor con todos los parametros de la clase 'Vehiculo'
	 * @param nombreProp
	 * @param matricula
	 * @param kms
	 */
	public Vehiculo(String nombreProp, String matricula, int kms) {
		
		this.nombreProp = nombreProp;
		this.matricula = matricula;
		this.kms = kms;
	}

	/**
	 * Metodo para conocer valor del parametro 'nombreProp'
	 * @return nombreProp
	 */
	public String getNombreProp() {
		return nombreProp;
	}

	/**
	 * Metodo para establecer valor del parametro 'nombreProp'
	 * @param nombreProp
	 */
	public void setNombreProp(String nombreProp) {
		this.nombreProp = nombreProp;
	}

	/**
	 * Metodo para conocer valor del parametro 'matricula'
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Metodo para establecer valor del parametro 'matricula'
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Metodo para conocer valor del parametro 'kms'
	 * @return kms
	 */
	public int getKms() {
		return kms;
	}

	/**
	 * Metodo para establecer valor del parametro 'kms'
	 * @param kms
	 */
	public void setKms(int kms) {
		this.kms = kms;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombreProp=" + nombreProp + ", matricula=" + matricula + ", kms=" + kms + "]";
	}
	
	

}
