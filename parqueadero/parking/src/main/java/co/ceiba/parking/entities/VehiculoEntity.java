package co.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class VehiculoEntity {

	@Id
	@GeneratedValue
	@Column(name = "idVehiculo")
	private int idVehiculo;
	@Column(name = "placa")
	private String placa;
	@Column(name = "estado")
	private boolean estado;
	@Column(name = "cilindrajes")
	private int cilindraje;

	public VehiculoEntity() {
	}

	public VehiculoEntity( String placa, boolean estado, int cilindraje) {
		this.placa = placa;
		this.estado = estado;
		this.cilindraje = cilindraje;
	}
	
	public VehiculoEntity( String placa, boolean estado) {
		this.placa = placa;
		this.estado = estado;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "VehiculoEntity [idVehiculo=" + idVehiculo + ", placa=" + placa + ", estado=" + estado + ", cilindraje="
				+ cilindraje + "]";
	}

	
}
