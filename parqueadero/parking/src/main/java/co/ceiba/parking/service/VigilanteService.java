package co.ceiba.parking.service;

import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.VehiculoModel;

public interface VigilanteService {

	public boolean verificarPlacaConElDia(VehiculoModel vehiculoModel, int diaIngreso);

	void addVehiculo(CarroModel carroModel, int idParking);

	boolean verificarDisponibilidad(String tipoVehiculo);

	void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo);
	
	void outVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking);

}
