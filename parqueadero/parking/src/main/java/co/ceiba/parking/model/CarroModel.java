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

	@Override
	public String getPlaca() {
		return placa;
	}
	@Override
	public void setPlaca(String placa) {
		this.placa = placa;
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
