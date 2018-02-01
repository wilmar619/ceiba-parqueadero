package co.ceiba.parking.service;

public interface InterfaceParking {

	public String ingresoVehiculo(String tipoVehiculo);

	public String salidaVehiculo();

	public Integer calcularPago();

	public String disponibilidadVehiculos();

}
