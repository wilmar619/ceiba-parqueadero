package co.ceiba.parking.model;

import java.util.Date;

public class VehiculosActivos {
	
	private String placa;
	private Date horaIngreso;
	private String tipoVehiculo;
	

	public VehiculosActivos(String placa, Date horaIngreso, String tipoVehiculo) {
		this.placa = placa;
		this.horaIngreso = horaIngreso;
		this.tipoVehiculo = tipoVehiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Date getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	

}
