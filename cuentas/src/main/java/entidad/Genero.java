/**
 * 
 */
package entidad;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Genero {

	private int id;
	private String nombre;
	
	public Genero() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param nombre
	 */
	public Genero(int id, String nombre) {
		super();
		this.id = id;
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
		return "Genero [id=" + id + ", nombre=" + nombre + "]";
	}

}
