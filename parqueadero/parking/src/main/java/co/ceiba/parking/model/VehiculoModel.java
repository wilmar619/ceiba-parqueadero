package co.ceiba.parking.model;

public abstract class VehiculoModel {

	private String placa;
	private boolean estado;

	public VehiculoModel() {
	}

	public VehiculoModel(String placa, boolean estado) {
		this.placa = placa;
		this.estado = estado;
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

}