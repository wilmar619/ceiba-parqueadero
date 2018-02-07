package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ceiba.parking.repository.FacturacionRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;

@Service
public class EntradaVehiculo implements VigilanteService {

	@Autowired
	private ParkingRepository parkingRepository;
	
	@Autowired
	private FacturacionRepository facturacionRepository ;
	
	@Override
	public String ingresoVehiculo(String Vehiculo) {
	
		return null;
	}


}
