package co.ceiba.parking.model;

public class CarroModel extends VehiculoModel{
	
	public static final String tipo = "carro";
	private String placa;
	boolean estado;

	
	public CarroModel() {
	}

	public CarroModel(String placa, boolean estado) {
		super(placa, estado);
		
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
