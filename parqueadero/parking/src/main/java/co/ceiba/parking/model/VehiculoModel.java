package co.ceiba.parking.model;

public class VehiculoModel {

	private int idVehiculo;
	private String tipo;
	private String placa;
	private int cilindraje;

	public VehiculoModel() {

	}

	public VehiculoModel(int idVehiculo, String tipo, String placa, int cilindraje) {
		super();
		this.idVehiculo = idVehiculo;
		this.tipo = tipo;
		this.placa = placa;
		this.cilindraje = cilindraje;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
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

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "VehiculoModel [idVehiculo=" + idVehiculo + ", tipo=" + tipo + ", placa=" + placa + ", cilindraje="
				+ cilindraje + "]";
	}

}