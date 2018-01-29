package co.ceiba.parking.model;

public class Parking {

	private int totalCarro = 20;
	private int totalMoto = 10;
	private int horaCarro = 1000;
	private int horaMoto = 500;
	private int diaCarro = 8000;
	private int diaMoto = 4000;

	public Parking() {

	}

	public Parking(int totalCarro, int totalMoto, int horaCarro, int horaMoto, int diaCarro, int diaMoto) {
		super();
		this.totalCarro = totalCarro;
		this.totalMoto = totalMoto;
		this.horaCarro = horaCarro;
		this.horaMoto = horaMoto;
		this.diaCarro = diaCarro;
		this.diaMoto = diaMoto;
	}

	public int getTotalCarro() {
		return totalCarro;
	}

	public void setTotalCarro(int totalCarro) {
		this.totalCarro = totalCarro;
	}

	public int getTotalMoto() {
		return totalMoto;
	}

	public void setTotalMoto(int totalMoto) {
		this.totalMoto = totalMoto;
	}

	public int getHoraCarro() {
		return horaCarro;
	}

	public void setHoraCarro(int horaCarro) {
		this.horaCarro = horaCarro;
	}

	public int getHoraMoto() {
		return horaMoto;
	}

	public void setHoraMoto(int horaMoto) {
		this.horaMoto = horaMoto;
	}

	public int getDiaCarro() {
		return diaCarro;
	}

	public void setDiaCarro(int diaCarro) {
		this.diaCarro = diaCarro;
	}

	public int getDiaMoto() {
		return diaMoto;
	}

	public void setDiaMoto(int diaMoto) {
		this.diaMoto = diaMoto;
	}

}