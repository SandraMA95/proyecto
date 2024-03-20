
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Vehiculo'
 */
public abstract class Vehiculo {
	

	private String nombre;
	
	private String dni;
	
	private String matricula;
	
	private double kms;
	
	/**
	 * Constructor con todos los parametros de la clase 'Vehiculo'
	 * @param nombre
	 * @param dni
	 * @param matricula
	 * @param kms
	 */
	public Vehiculo(String nombre, String dni, String matricula, double kms) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.matricula = matricula;
		this.kms = kms;
		
	}

	/**
	 * Metodo para conocer valor del parametro 'nombre'
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para establecer valor del parametro 'nombre'
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para conocer valor del parametro 'dni'
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo para establecer valor del parametro 'dni'
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;

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

	abstract public void leerDatos();

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", dni=" + dni + ", matricula=" + matricula + ", kms=" + kms + "]";

	}
	
	

}
