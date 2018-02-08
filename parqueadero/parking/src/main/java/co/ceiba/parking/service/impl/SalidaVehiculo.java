package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;


public class SalidaVehiculo implements VigilanteService {

	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;

	@Autowired
	@Qualifier("facturacionRepository")
	private FacturaRepository facturacionRepo;

	@Override
	public boolean verificarPlaca(VehiculoModel VehiculoModel, int dia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParqueadero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo) {
		// TODO Auto-generated method stub
		
	}

	
}
