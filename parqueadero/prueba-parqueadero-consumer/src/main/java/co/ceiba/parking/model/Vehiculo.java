package co.ceiba.parking.model;

import java.io.Serializable;

public class Vehiculo implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer idVehiculo;
	private Integer cilindraje;
	private String tipo;
	private String placa;

	public Vehiculo() {
	}

    public Vehiculo(Integer cilindraje, String tipo, String placa) {
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.placa = placa;
    }

	
	


	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + ((idVehiculo == null) ? 0 : idVehiculo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (cilindraje == null) {
			if (other.cilindraje != null)
				return false;
		} else if (!cilindraje.equals(other.cilindraje))
			return false;
		if (idVehiculo == null) {
			if (other.idVehiculo != null)
				return false;
		} else if (!idVehiculo.equals(other.idVehiculo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", cilindraje=" + cilindraje + ", tipo=" + tipo + ", placa="
				+ placa + "]";
	}

	
	
}
