package entidad;


public class Prestamos {
	
	private int id;
	private float importeSolicitado;
	private float interes;
	private int plazos;
	private float pagoPorMes;
	private int cuotas;
	
	public Prestamos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param importeSolicitado
	 * @param interes
	 * @param plazos
	 * @param pagoPorMes
	 * @param cuotas
	 */
	public Prestamos(int id, float importeSolicitado, float interes, int plazos, float pagoPorMes, int cuotas) {
		super();
		this.id = id;
		this.importeSolicitado = importeSolicitado;
		this.interes = interes;
		this.plazos = plazos;
		this.pagoPorMes = pagoPorMes;
		this.cuotas = cuotas;
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
	 * @return the importeSolicitado
	 */
	public float getImporteSolicitado() {
		return importeSolicitado;
	}

	/**
	 * @param importeSolicitado the importeSolicitado to set
	 */
	public void setImporteSolicitado(float importeSolicitado) {
		this.importeSolicitado = importeSolicitado;
	}

	/**
	 * @return the interes
	 */
	public float getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(float interes) {
		this.interes = interes;
	}

	/**
	 * @return the plazos
	 */
	public int getPlazos() {
		return plazos;
	}

	/**
	 * @param plazos the plazos to set
	 */
	public void setPlazos(int plazos) {
		this.plazos = plazos;
	}

	/**
	 * @return the pagoPorMes
	 */
	public float getPagoPorMes() {
		return pagoPorMes;
	}

	/**
	 * @param pagoPorMes the pagoPorMes to set
	 */
	public void setPagoPorMes(float pagoPorMes) {
		this.pagoPorMes = pagoPorMes;
	}

	/**
	 * @return the cuotas
	 */
	public int getCuotas() {
		return cuotas;
	}

	/**
	 * @param cuotas the cuotas to set
	 */
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	@Override
	public String toString() {
		return "Prestamos [id=" + id + ", importeSolicitado=" + importeSolicitado + ", interes=" + interes + ", plazos="
				+ plazos + ", pagoPorMes=" + pagoPorMes + ", cuotas=" + cuotas + "]";
	}
}
