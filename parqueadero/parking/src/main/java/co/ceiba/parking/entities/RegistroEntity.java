package co.ceiba.parking.entities;

import java.util.Date;

public class RegistroEntity {

	private int idRegistro;
	private String tipoVehiculo;
	private String placa;
	private int cilindraje;
	private Date fechaEntrada;
	private Date fechaSalida;
	private boolean estado;
	private int pagoTotal;

	public RegistroEntity() {
		super();
	}

	public RegistroEntity(int idRegistro, String tipoVehiculo, String placa, int cilindraje, Date fechaEntrada,
			Date fechaSalida, boolean estado, int pagoTotal) {
		super();
		this.idRegistro = idRegistro;
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.estado = estado;
		this.pagoTotal = pagoTotal;
	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
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

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(int pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	@Override
	public String toString() {
		return "RegistroEntity [idRegistro=" + idRegistro + ", tipoVehiculo=" + tipoVehiculo + ", placa=" + placa
				+ ", cilindraje=" + cilindraje + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
				+ ", estado=" + estado + ", pagoTotal=" + pagoTotal + "]";
	}

}
