package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.repository.CarroRepository;
import co.ceiba.parking.repository.FacturacionRepository;
import co.ceiba.parking.repository.MotoRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;

@Service
public class EntradaVehiculo implements VigilanteService {

	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;
	
	@Autowired
	@Qualifier("facturacionRepository")
	private FacturacionRepository facturacionRepo ;
	
	@Autowired
	@Qualifier("facturacionRepository")
	private MotoRepository motoRepo ;
	
	@Autowired
	@Qualifier("facturacionRepository")
	private CarroRepository carroRepo ;
	
	@Override
	public String ingresoVehiculo(String Vehiculo) {
	
		return carroRepo.save(Vehiculo);
	}

}
