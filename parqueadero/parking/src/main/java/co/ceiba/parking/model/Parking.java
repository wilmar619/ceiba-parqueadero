package co.ceiba.parking.model;

public class Parking {


	private int idParking;
	private int numCeldaCarro;
	private int numCeldaMoto;
	private int precioHoraCarro;
	private int precioHoraMoto;
	private int precioDiaCarro;
	private int precioDiaMoto;

	public Parking() {
	}

	public Parking(int idParking, int numCeldaCarro, int numCeldaMoto, int precioHoraCarro, int precioHoraMoto,
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
