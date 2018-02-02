package co.ceiba.parking.model;

import java.io.Serializable;

public class Parking implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idParking;
	private int celdaCarro;
	private int celdaMoto;
	private int precioHoraCarro;
	private int precioHoraMoto;
	private int precioDiaCarro;
	private int precioDiaMoto;
	
	public Parking() {
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
		final int prime = 31;
		int result = 1;
		result = prime * result + celdaCarro;
		result = prime * result + celdaMoto;
		result = prime * result + ((idParking == null) ? 0 : idParking.hashCode());
		result = prime * result + precioDiaCarro;
		result = prime * result + precioDiaMoto;
		result = prime * result + precioHoraCarro;
		result = prime * result + precioHoraMoto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		if (celdaCarro != other.celdaCarro)
			return false;
		if (celdaMoto != other.celdaMoto)
			return false;
		if (idParking == null) {
			if (other.idParking != null)
				return false;
		} else if (!idParking.equals(other.idParking))
			return false;
		if (precioDiaCarro != other.precioDiaCarro)
			return false;
		if (precioDiaMoto != other.precioDiaMoto)
			return false;
		if (precioHoraCarro != other.precioHoraCarro)
			return false;
		if (precioHoraMoto != other.precioHoraMoto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parking [idParking=" + idParking + ", celdaCarro=" + celdaCarro + ", celdaMoto=" + celdaMoto
				+ ", precioHoraCarro=" + precioHoraCarro + ", precioHoraMoto=" + precioHoraMoto + ", precioDiaCarro="
				+ precioDiaCarro + ", precioDiaMoto=" + precioDiaMoto + "]";
	}
	
	
	
}
