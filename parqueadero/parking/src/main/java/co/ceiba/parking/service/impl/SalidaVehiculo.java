package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;

@Service
public class SalidaVehiculo implements VigilanteService {
	
	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;
	
	@Autowired
	@Qualifier("facturacionRepository")
	private FacturaRepository facturacionRepo ;

	@Override
	public CarroModel ingresoVehiculo(CarroModel Vehiculo) {

		return null;
	}

	
	}

