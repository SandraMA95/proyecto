
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Vehiculo'
 */
public class Vehiculo {
	
	private String nombre;
	
	private String dni;
	
	private String matricula;
	
	private int kms;
	
	private Tipo tipo;
	
	enum Tipo {
		
		TURISMO, CAMION, AUTOBUS, FURGONETA
	}

	/**
	 * Constructor con todos los parametros de la clase 'Vehiculo'
	 * @param nombre
	 * @param dni
	 * @param matricula
	 * @param kms
	 * @param tipo
	 */
	public Vehiculo(String nombre, String dni, String matricula, int kms, Tipo tipo) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.matricula = matricula;
		this.kms = kms;
		this.tipo = tipo;
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
	 * @return
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

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", dni=" + dni + ", matricula=" + matricula + ", kms=" + kms + ", tipo="
				+ tipo + "]";
	}
	
	

}
