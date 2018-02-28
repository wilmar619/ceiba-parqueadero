package co.ceiba.parking.model;

import java.util.Date;

public class FacturaModel {

	private String placa;
	private Date horaIngreso;
	private Date horaSalida;
	private int tiempoDeParqueo;
	private int pagoTotal;
	
	
	public FacturaModel(String placa, Date horaIngreso, Date horaSalida, int tiempoDeParqueo, int pagoTotal) {
		this.placa = placa;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.tiempoDeParqueo = tiempoDeParqueo;
		this.pagoTotal = pagoTotal;
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


	public Date getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}


	public int getTiempoDeParqueo() {
		return tiempoDeParqueo;
	}


	public void setTiempoDeParqueo(int tiempoDeParqueo) {
		this.tiempoDeParqueo = tiempoDeParqueo;
	}


	public int getPagoTotal() {
		return pagoTotal;
	}


	public void setPagoTotal(int pagoTotal) {
		this.pagoTotal = pagoTotal;
	}
	
	
	
}
