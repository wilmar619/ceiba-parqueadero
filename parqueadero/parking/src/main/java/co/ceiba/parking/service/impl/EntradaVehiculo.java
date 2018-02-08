package co.ceiba.parking.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.converter.CarroConverter;
import co.ceiba.parking.converter.MotoConverter;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.entities.ParkingEntity;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.CarroRepository;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.MotoRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.service.VigilanteService;


@Service("meterVehiculoService")
public class EntradaVehiculo implements VigilanteService {

	@Autowired
	@Qualifier("carroConverter")
	private CarroConverter carroConverter;

	@Autowired
	@Qualifier("motoConverter")
	private MotoConverter motoConverter;

	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Autowired
	@Qualifier("motoRepository")
	private MotoRepository motoRepo;

	@Autowired
	@Qualifier("carroRepository")
	private CarroRepository carroRepo;

	@Override
	public boolean verificarPlaca(VehiculoModel vehiculoModel, int dia) {
		String placa = vehiculoModel.getPlaca();
		char primeraLetra = placa.charAt(0);
		if (primeraLetra == 'A'|| primeraLetra =='a') {
			return (1 == dia) || (2 == dia);
		}
		return true;
	}

	@Override
	public void addVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if ("Carro".equals(tipoVehiculo)) {
			parqueadero.setNumCeldasCarro(parqueadero.getNumCeldasCarro() - 1);
			carroRepo.save(carroConverter.model2entity(vehiculoModel));
		} else {
			parqueadero.setNumCeldasMoto(parqueadero.getNumCeldasMoto() - 1);
			motoRepo.save(motoConverter.model2entity(vehiculoModel));
		}
		parkingRepo.save(parqueadero);
		comenzarFactura(vehiculoModel, tipoVehiculo);

	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		return (celdasParqueadero(1, tipoVehiculo)!=0);
	}

	@Override
	public void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo) {
		Date fechaInicio = new Date();
		FacturaEntity factura = new FacturaEntity();
		factura.setEstado(true);
		factura.setPlaca(vehiculoModel.getPlaca());
		factura.setTipoVehiculo(tipoVehiculo);
		factura.setHoraIngreso(fechaInicio);
		facturaRepo.save(factura);
	}
	
	public int celdasParqueadero(int idParking, String tipoVehiculo) {		
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if("Carro".equals(tipoVehiculo)) {
			return parqueadero.getNumCeldasCarro();
		}else {
			return parqueadero.getNumCeldasMoto();
		}
		
	}

}
