package entidad;

import java.sql.Date;

public class Movimientos {
	
	private int id;
	private Persona dniPersona;
	private TipoDeMovimiento idTipoMov;
	private String detalle;
	private Date date;
	
	public Movimientos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param dniPersona
	 * @param idTipoMov
	 * @param detalle
	 * @param date
	 */
	public Movimientos(int id, Persona dniPersona, TipoDeMovimiento idTipoMov, String detalle, Date date) {
		super();
		this.id = id;
		this.dniPersona = dniPersona;
		this.idTipoMov = idTipoMov;
		this.detalle = detalle;
		this.date = date;
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
	 * @return the idTipoMov
	 */
	public TipoDeMovimiento getIdTipoMov() {
		return idTipoMov;
	}

	/**
	 * @param idTipoMov the idTipoMov to set
	 */
	public void setIdTipoMov(TipoDeMovimiento idTipoMov) {
		this.idTipoMov = idTipoMov;
	}

	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Movimientos [id=" + id + ", dniPersona=" + dniPersona + ", idTipoMov=" + idTipoMov + ", detalle="
				+ detalle + ", date=" + date + "]";
	}

	
}
