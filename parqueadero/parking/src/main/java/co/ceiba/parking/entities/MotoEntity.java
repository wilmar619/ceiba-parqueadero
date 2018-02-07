package co.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class MotoEntity {

	@Id
	@GeneratedValue
	@Column(name = "idMoto")
	private int idMoto;
	@Column(name = "cilindraje")
	private int cilindraje;
	@Column(name = "placa")
	private int placa;
	@Column(name = "estado")
	private boolean estado;

	public MotoEntity() {

	}

	public MotoEntity(int idMoto, int cilindraje, int placa, boolean estado) {
		super();
		this.idMoto = idMoto;
		this.cilindraje = cilindraje;
		this.placa = placa;
		this.estado = estado;
	}

	public int getIdMoto() {
		return idMoto;
	}

	public void setIdMoto(int idMoto) {
		this.idMoto = idMoto;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "MotoEntity [idMoto=" + idMoto + ", cilindraje=" + cilindraje + ", placa=" + placa + ", estado=" + estado
				+ "]";
	}

}
