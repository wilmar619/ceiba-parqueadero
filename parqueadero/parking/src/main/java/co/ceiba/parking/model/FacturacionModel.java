package co.ceiba.parking.model;

public class FacturacionModel {

	private int idFacturacion;
	private int tipoVehiculo;
	private int placa;
	private int cilindraje;
	private int horaIngreso;
	private int horaSalida;
	private int estado;
	private int pagoTotal;

	public int getIdFacturacion() {
		return idFacturacion;
	}

	public void setIdFacturacion(int idFacturacion) {
		this.idFacturacion = idFacturacion;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(int horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(int pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

}
