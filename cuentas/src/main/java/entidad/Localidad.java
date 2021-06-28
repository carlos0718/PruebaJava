package entidad;

public class Localidad {
	
	private int id;
	private Provincia iDProvincia;
	private String nombre;
	
	public Localidad() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param iDProvincia
	 * @param nombre
	 */
	public Localidad(int id, Provincia iDProvincia, String nombre) {
		super();
		this.id = id;
		this.iDProvincia = iDProvincia;
		this.nombre = nombre;
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
	 * @return the iDProvincia
	 */
	public Provincia getiDProvincia() {
		return iDProvincia;
	}


	/**
	 * @param iDProvincia the iDProvincia to set
	 */
	public void setiDProvincia(Provincia iDProvincia) {
		this.iDProvincia = iDProvincia;
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
	
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", iDProvincia=" + iDProvincia + ", nombre=" + nombre + "]";
	}



}
