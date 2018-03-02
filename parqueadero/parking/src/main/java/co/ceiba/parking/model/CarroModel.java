package co.ceiba.parking.model;

public class CarroModel extends VehiculoModel{
	
	public static String tipo = "carro";
	private String placa;
	boolean estado;
	
	public CarroModel() {
	}

	@Override
	public String getTipoVehiculo() {
		return CarroModel.tipo;
	}

	public CarroModel(String placa, boolean estado) {
		super(placa, estado);
		
	}

	public static String getTipo() {
		return tipo;
	}

	public static void setTipo(String tipo) {
		CarroModel.tipo = tipo;
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
