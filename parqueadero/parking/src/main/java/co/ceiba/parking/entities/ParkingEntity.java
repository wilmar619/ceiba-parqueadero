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
	@Column(name = "numCeldasCarro")
	private int numCeldasCarro;
	@Column(name = "numCeldasMoto")
	private int numCeldasMoto;
	@Column(name = "precioHoraCarro")
	private int precioHoraCarro;
	@Column(name = "precioHoraMoto")
	private int precioHoraMoto;
	@Column(name = "precioDiaCarro")
	private int precioDiaCarro;
	@Column(name = "precioDiaMoto")
	private int precioDiaMoto;

	public ParkingEntity() {

	}

	public ParkingEntity(int idParking, int numCeldasCarro, int numCeldasMoto, int precioHoraCarro, int precioHoraMoto,
			int precioDiaCarro, int precioDiaMoto) {
		super();
		this.idParking = idParking;
		this.numCeldasCarro = numCeldasCarro;
		this.numCeldasMoto = numCeldasMoto;
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

	public int getNumCeldasCarro() {
		return numCeldasCarro;
	}

	public void setNumCeldasCarro(int numCeldasCarro) {
		this.numCeldasCarro = numCeldasCarro;
	}

	public int getNumCeldasMoto() {
		return numCeldasMoto;
	}

	public void setNumCeldasMoto(int numCeldasMoto) {
		this.numCeldasMoto = numCeldasMoto;
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

}