package com.example.parking.dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wilmar.galeano
 */
@Entity
@Table(name = "parking")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Parking.findAll", query = "SELECT p FROM Parking p"),
		@NamedQuery(name = "Parking.findByIdParking", query = "SELECT p FROM Parking p WHERE p.idParking = :idParking"),
		@NamedQuery(name = "Parking.findByCeldaCarro", query = "SELECT p FROM Parking p WHERE p.celdaCarro = :celdaCarro"),
		@NamedQuery(name = "Parking.findByCeldaMoto", query = "SELECT p FROM Parking p WHERE p.celdaMoto = :celdaMoto"),
		@NamedQuery(name = "Parking.findByPrecioHoraCarro", query = "SELECT p FROM Parking p WHERE p.precioHoraCarro = :precioHoraCarro"),
		@NamedQuery(name = "Parking.findByPrecioHoraMoto", query = "SELECT p FROM Parking p WHERE p.precioHoraMoto = :precioHoraMoto"),
		@NamedQuery(name = "Parking.findByPrecioDiaCarro", query = "SELECT p FROM Parking p WHERE p.precioDiaCarro = :precioDiaCarro"),
		@NamedQuery(name = "Parking.findByPrecioDiaMoto", query = "SELECT p FROM Parking p WHERE p.precioDiaMoto = :precioDiaMoto") })
public class Parking implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "idParking")
	private Integer idParking;
	@Basic(optional = false)
	@Column(name = "celdaCarro")
	private int celdaCarro;
	@Basic(optional = false)
	@Column(name = "celdaMoto")
	private int celdaMoto;
	@Basic(optional = false)
	@Column(name = "precioHoraCarro")
	private int precioHoraCarro;
	@Basic(optional = false)
	@Column(name = "precioHoraMoto")
	private int precioHoraMoto;
	@Basic(optional = false)
	@Column(name = "precioDiaCarro")
	private int precioDiaCarro;
	@Basic(optional = false)
	@Column(name = "precioDiaMoto")
	private int precioDiaMoto;

	public Parking() {
	}

	public Parking(Integer idParking) {
		this.idParking = idParking;
	}

	public Parking(Integer idParking, int celdaCarro, int celdaMoto, int precioHoraCarro, int precioHoraMoto,
			int precioDiaCarro, int precioDiaMoto) {
		this.idParking = idParking;
		this.celdaCarro = celdaCarro;
		this.celdaMoto = celdaMoto;
		this.precioHoraCarro = precioHoraCarro;
		this.precioHoraMoto = precioHoraMoto;
		this.precioDiaCarro = precioDiaCarro;
		this.precioDiaMoto = precioDiaMoto;
	}

	public Integer getIdParking() {
		return idParking;
	}

	public void setIdParking(Integer idParking) {
		this.idParking = idParking;
	}

	public int getCeldaCarro() {
		return celdaCarro;
	}

	public void setCeldaCarro(int celdaCarro) {
		this.celdaCarro = celdaCarro;
	}

	public int getCeldaMoto() {
		return celdaMoto;
	}

	public void setCeldaMoto(int celdaMoto) {
		this.celdaMoto = celdaMoto;
	}

	public int getPrecioHoraCarro() {
		return precioHoraCarro;
	}

	public void setPrecioHoraCarro(int precioHoraCarro) {
		this.precioHoraCarro = precioHoraCarro;
	}

	public int getPrecioHoraMoto() {
		return precioHoraMoto;
	}

	public void setPrecioHoraMoto(int precioHoraMoto) {
		this.precioHoraMoto = precioHoraMoto;
	}

	public int getPrecioDiaCarro() {
		return precioDiaCarro;
	}

	public void setPrecioDiaCarro(int precioDiaCarro) {
		this.precioDiaCarro = precioDiaCarro;
	}

	public int getPrecioDiaMoto() {
		return precioDiaMoto;
	}

	public void setPrecioDiaMoto(int precioDiaMoto) {
		this.precioDiaMoto = precioDiaMoto;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idParking != null ? idParking.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Parking)) {
			return false;
		}
		Parking other = (Parking) object;
		if ((this.idParking == null && other.idParking != null)
				|| (this.idParking != null && !this.idParking.equals(other.idParking))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "parqueadero.Parking[ idParking=" + idParking + " ]";
	}

}
