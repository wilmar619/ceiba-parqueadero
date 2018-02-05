package co.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking")
public class ParkingEntity {

	@Id
	@GeneratedValue
	@Column(name = "idParking")
	private int idParking;
	@Column(name = "numCeldaCarro")
	private int numCeldaCarro;
	@Column(name = "numCeldaMoto")
	private int numCeldaMoto;
	@Column(name = "precioHoraCarro")
	private int precioHoraCarro;
	@Column(name = "precioHoraMoto")
	private int precioHoraMoto;
	@Column(name = "precioDiaCarro")
	private int precioDiaCarro;
	@Column(name = "precioDiaMoto")
	private int precioDiaMoto;

	public ParkingEntity() {
		super();
	}

	public ParkingEntity(int idParking, int numCeldaCarro, int numCeldaMoto, int precioHoraCarro, int precioHoraMoto,
			int precioDiaCarro, int precioDiaMoto) {
		super();
		this.idParking = idParking;
		this.numCeldaCarro = numCeldaCarro;
		this.numCeldaMoto = numCeldaMoto;
		this.precioHoraCarro = precioHoraCarro;
		this.precioHoraMoto = precioHoraMoto;
		this.precioDiaCarro = precioDiaCarro;
		this.precioDiaMoto = precioDiaMoto;
	}

	public int getIdParking() {
		return idParking;
	}

	public void setIdParking(int idParking) {
		this.idParking = idParking;
	}

	public int getNumCeldaCarro() {
		return numCeldaCarro;
	}

	public void setNumCeldaCarro(int numCeldaCarro) {
		this.numCeldaCarro = numCeldaCarro;
	}

	public int getNumCeldaMoto() {
		return numCeldaMoto;
	}

	public void setNumCeldaMoto(int numCeldaMoto) {
		this.numCeldaMoto = numCeldaMoto;
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
	public String toString() {
		return "ParkingEntity [idParking=" + idParking + ", numCeldaCarro=" + numCeldaCarro + ", numCeldaMoto="
				+ numCeldaMoto + ", precioHoraCarro=" + precioHoraCarro + ", precioHoraMoto=" + precioHoraMoto
				+ ", precioDiaCarro=" + precioDiaCarro + ", precioDiaMoto=" + precioDiaMoto + "]";
	}

}
