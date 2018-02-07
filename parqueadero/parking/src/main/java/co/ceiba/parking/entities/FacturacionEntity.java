package co.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facturacion")
public class FacturacionEntity {

	@Id
	@GeneratedValue
	@Column(name = "idFacturacion")
	private int idFacturacion;
	@Column(name = "tipoVehiculo")
	private int tipoVehiculo;
	@Column(name = "placa")
	private String placa;
	@Column(name = "cilindraje")
	private int cilindraje;
	@Column(name = "horaIngreso")
	private int horaIngreso;
	@Column(name = "horaSalida")
	private int horaSalida;
	@Column(name = "estado")
	private boolean estado;
	@Column(name = "pagoTotal")
	private int pagoTotal;

	public FacturacionEntity() {

	}

	public FacturacionEntity(int idFacturacion, int tipoVehiculo, String placa, int cilindraje, int horaIngreso,
			int horaSalida, boolean estado, int pagoTotal) {
		super();
		this.idFacturacion = idFacturacion;
		this.tipoVehiculo = tipoVehiculo;
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.estado = estado;
		this.pagoTotal = pagoTotal;
	}

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
		return "FacturacionEntity [idFacturacion=" + idFacturacion + ", tipoVehiculo=" + tipoVehiculo + ", placa="
				+ placa + ", cilindraje=" + cilindraje + ", horaIngreso=" + horaIngreso + ", horaSalida=" + horaSalida
				+ ", estado=" + estado + ", pagoTotal=" + pagoTotal + "]";
	}

}
