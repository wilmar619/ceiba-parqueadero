package co.ceiba.parking.service;

import java.util.Date;

import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.model.VehiculoModel;

public interface VigilanteService {

	public boolean verificarPlacaConElDia(VehiculoModel vehiculoModel, int diaIngreso);

	void addVehiculo(CarroModel carroModel, int idParking);

	void addVehiculo(MotoModel motoModel, int idParking);

	boolean verificarDisponibilidad(String tipoVehiculo);

	void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo);

	void outVehiculo(String placa);

	long calcularTimpoEnHoras(Date fechaEntrada, Date fechaSalida);

}
