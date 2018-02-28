package co.ceiba.parking.model;

public class MotoModel extends VehiculoModel {


	public static final String tipo = "moto";
	private String placa;
	private int cilindraje;
	boolean estado;
	
	
	
	public MotoModel() {
	}

	public MotoModel(String placa, int cilindraje, boolean estado) {
		super(placa,estado);
		this.cilindraje = cilindraje;
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


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
