package entidad;

public class PersonaCliente {
	
	private int id;
	private String nombre;
	private String password;
	private Persona dni;
	
	public PersonaCliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param password
	 * @param dni
	 */
	public PersonaCliente(int id, String nombre, String password, Persona dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "PersonaCliente [id=" + id + ", nombre=" + nombre + ", password=" + password + ", dni=" + dni + "]";
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

}
