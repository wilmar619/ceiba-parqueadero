package co.ceiba.parking.service;

import co.ceiba.parking.model.VehiculoModel;

public interface VigilanteService {

	public boolean verificarPlaca(VehiculoModel VehiculoModel, int dia);

	void addVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking);

	boolean verificarDisponibilidad(String tipoVehiculo);

	void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo);
	
	void outVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking);
}
