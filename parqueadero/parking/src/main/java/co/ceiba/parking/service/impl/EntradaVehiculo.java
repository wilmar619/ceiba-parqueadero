package co.ceiba.parking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.ceiba.parking.entities.CarroEntity;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.repository.CarroRepository;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.MotoRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;

@Service("vigilanteServicioIngreso")
public class EntradaVehiculo implements VigilanteService {

	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;
	
	@Autowired
	@Qualifier("facturacionRepository")
	private FacturaRepository facturacionRepo ;
	
	@Autowired
	@Qualifier("motoRepository")
	private MotoRepository motoRepo ;
	
	@Autowired
	@Qualifier("carroRepository")
	private CarroRepository carroRepo ;
	
	@Override
	public CarroModel ingresoVehiculo(CarroModel vehiculo) {
		//CarroEntity carro = carroRepo.save();
		return carroRepo.save(vehiculo);
	}
	
//	@Override
//	public CarroModel addCarro(CarroModel carroModel) {
//	CarroEntity carro = carroRepository.save(carroConverter.model2entity(carroModel));
//	return carroConverter.entity2model(carro);
//	}

}
