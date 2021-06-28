/**
 * 
 */
package entidad;

import java.sql.Date;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Persona {

	private int dni;
	private int cuil;
	private String nombre;
	private String apellido;
	private Genero idGenero;
	private Nacionalidad idNac;
	private Localidad idLocalidad;
	private Date fechaNac;
	private String direccion;
	private String email;	
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dni
	 * @param cuil
	 * @param nombre
	 * @param apellido
	 * @param idGenero
	 * @param idNac
	 * @param idLocalidad
	 * @param fechaNac
	 * @param direccion
	 * @param email
	 */
	public Persona(int dni, int cuil, String nombre, String apellido, Genero idGenero, Nacionalidad idNac,
			Localidad idLocalidad, Date fechaNac, String direccion, String email) {
		super();
		this.dni = dni;
		this.cuil = cuil;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idGenero = idGenero;
		this.idNac = idNac;
		this.idLocalidad = idLocalidad;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.email = email;
	}
	
	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the cuil
	 */
	public int getCuil() {
		return cuil;
	}

	/**
	 * @param cuil the cuil to set
	 */
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the idGenero
	 */
	public Genero getIdGenero() {
		return idGenero;
	}

	/**
	 * @param idGenero the idGenero to set
	 */
	public void setIdGenero(Genero idGenero) {
		this.idGenero = idGenero;
	}

	/**
	 * @return the idNac
	 */
	public Nacionalidad getIdNac() {
		return idNac;
	}

	/**
	 * @param idNac the idNac to set
	 */
	public void setIdNac(Nacionalidad idNac) {
		this.idNac = idNac;
	}

	/**
	 * @return the idLocalidad
	 */
	public Localidad getIdLocalidad() {
		return idLocalidad;
	}

	/**
	 * @param idLocalidad the idLocalidad to set
	 */
	public void setIdLocalidad(Localidad idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	/**
	 * @return the fechaNac
	 */
	public Date getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", cuil=" + cuil + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", idGenero=" + idGenero + ", idNac=" + idNac + ", idLocalidad=" + idLocalidad + ", fechaNac="
				+ fechaNac + ", direccion=" + direccion + ", email=" + email + "]";
	}
	
}
