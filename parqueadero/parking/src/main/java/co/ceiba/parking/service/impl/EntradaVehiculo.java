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

@Service("vigilanteServicioIngreso")
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
		return false;
	}

	@Override
	public void addVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParking) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if ("Carro".equals(tipoVehiculo)) {
			parqueadero.setNumCeldasCarro(parqueadero.getNumCeldasCarro() - 1);
		} else {
			parqueadero.setNumCeldasMoto(parqueadero.getNumCeldasMoto() - 1);
		}
		parkingRepo.save(parqueadero);
		comenzarFactura(vehiculoModel);
		carroRepo.save(carroConverter.model2entity(vehiculoModel));

	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		return false;
	}

	@Override
	public void comenzarFactura(VehiculoModel vehiculoModel) {

		Date fechaInicio = new Date();
		FacturaEntity factura = new FacturaEntity();
		factura.setEstado(true);
		factura.setPlaca(vehiculoModel.getPlaca());
		factura.setTipoVehiculo("Carro");
		factura.setHoraIngreso(fechaInicio);
		facturaRepo.save(factura);
	}

}
