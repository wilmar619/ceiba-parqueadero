package co.ceiba.parking.model;

public class MotoModel {

	private int idMoto;
	private int cilindraje;
	private String placa;
	private boolean estado;

	public MotoModel() {

	}

	public MotoModel(int idMoto, int cilindraje, String placa, boolean estado) {
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
