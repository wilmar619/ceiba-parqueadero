package co.ceiba.parking.model;

public class Vehiculo {
	
	private int cilindraje;
	private String tipo;
	private String placa;
	
	public Vehiculo(){
		
	}

	public Vehiculo(int cilindraje, String tipo, String placa) {
		super();
		this.cilindraje = cilindraje;
		this.tipo = tipo;
		this.placa = placa;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
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
	
	

	
}
