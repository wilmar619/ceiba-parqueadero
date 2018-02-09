package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.service.VigilanteService;

//@Service("VehiculoService")
public class VigilanteServiceImpl implements VigilanteService {
	
	@Autowired
	private VigilanteService vigilanteService;

	@Override
	public boolean verificarPlacaConElDia(VehiculoModel VehiculoModel, int dia) {
		return false;
	}

	@Override
	public void addVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking) {

	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		return false;
	}

	@Override
	public void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo) {

	}

	@Override
	public void outVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking) {

	}

}
