package co.ceiba.parking.model;

public class MotoModel extends VehiculoModel {


	public static  String tipo = "moto";
	private String placa;
	private int cilindraje;
	boolean estado;
	

	public MotoModel() {
	}

	@Override
	public String getTipoVehiculo() {
		return MotoModel.tipo;
	}
	public MotoModel(String placa, int cilindraje, boolean estado) {
		super(placa,estado);
		this.cilindraje = cilindraje;
	}



	public static String getTipo() {
		return tipo;
	}

	public static void setTipo(String tipo) {
		MotoModel.tipo = tipo;
	}
	@Override
	public String getPlaca() {
		return placa;
	}

	@Override
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
	public boolean isEstado() {
		return estado;
	}

	@Override
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
