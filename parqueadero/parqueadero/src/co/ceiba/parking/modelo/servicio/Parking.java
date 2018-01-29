package co.ceiba.parking.modelo.servicio;

public class Parking {

	private int celdaCarro;
	private int celdaMoto;
	private int precioHoraCarro;
	private int precioHoraMoto;
	private int precioDiaCarro;
	private int precioDiaMoto;

	public Parking() {
		this.celdaCarro = 20;
		this.celdaMoto = 10;
		this.precioHoraCarro = 1000;
		this.precioHoraMoto = 500;
		this.precioDiaCarro = 8000;
		this.precioDiaMoto = 4000;
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

}