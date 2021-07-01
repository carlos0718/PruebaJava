package entidad;

import java.sql.Date;

public class PersonaBanco {
	
	private int id;
	private String nombre;
	private String password;
	private Date fecCreacion;
	private Persona dni;
	
	public PersonaBanco() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param password
	 * @param fecCreacion
	 * @param dni
	 */
	public PersonaBanco(int id, String nombre, String password, Date fecCreacion, Persona dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.fecCreacion = fecCreacion;
		this.dni = dni;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fecCreacion
	 */
	public Date getFecCreacion() {
		return fecCreacion;
	}

	/**
	 * @param fecCreacion the fecCreacion to set
	 */
	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	/**
	 * @return the dni
	 */
	public Persona getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(Persona dni) {
		this.dni = dni;
	}
	

	@Override
	public String toString() {
		return "PersonaBancoDaoImpl [id=" + id + ", nombre=" + nombre + ", password=" + password + ", fecCreacion="
				+ fecCreacion + ", dni=" + dni + "]";
	}
}
