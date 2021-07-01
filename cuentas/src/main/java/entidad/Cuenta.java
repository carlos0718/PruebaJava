package entidad;

import java.sql.Date;

public class Cuenta {

	private int id;
	private TipoDeCuenta idCuenta;
	private long cbu;
	private Date fecCreacion;
	private float saldo;
	private Persona dniPersona;
	private Persona cuilPersona;
	
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param idCuenta
	 * @param cbu
	 * @param fecCreacion
	 * @param saldo
	 * @param dniPersona
	 * @param cuilPersona
	 */
	public Cuenta(int id, TipoDeCuenta idCuenta, long cbu, Date fecCreacion, float saldo, Persona dniPersona, Persona cuilPersona) {
		super();
		this.id = id;
		this.idCuenta = idCuenta;
		this.cbu = cbu;
		this.fecCreacion = fecCreacion;
		this.saldo = saldo;
		this.dniPersona = dniPersona;
		this.cuilPersona = cuilPersona;
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
	 * @return the idCuenta
	 */
	public TipoDeCuenta getIdCuenta() {
		return idCuenta;
	}

	/**
	 * @param idCuenta the idCuenta to set
	 */
	public void setIdCuenta(TipoDeCuenta idCuenta) {
		this.idCuenta = idCuenta;
	}

	/**
	 * @return the cbu
	 */
	public long getCbu() {
		return cbu;
	}

	/**
	 * @param cbu the cbu to set
	 */
	public void setCbu(long cbu) {
		this.cbu = cbu;
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
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the dniPersona
	 */
	public Persona getDniPersona() {
		return dniPersona;
	}

	/**
	 * @param dniPersona the dniPersona to set
	 */
	public void setDniPersona(Persona dniPersona) {
		this.dniPersona = dniPersona;
	}
	

	/**
	 * @return the cuilPersona
	 */
	public Persona getCuilPersona() {
		return cuilPersona;
	}

	/**
	 * @param cuilPersona the cuilPersona to set
	 */
	public void setCuilPersona(Persona cuilPersona) {
		this.cuilPersona = cuilPersona;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", idCuenta=" + idCuenta + ", cbu=" + cbu + ", fecCreacion=" + fecCreacion
				+ ", saldo=" + saldo + ", dniPersona=" + dniPersona + ", cuilPersona=" + cuilPersona + "]";
	}

	
}
