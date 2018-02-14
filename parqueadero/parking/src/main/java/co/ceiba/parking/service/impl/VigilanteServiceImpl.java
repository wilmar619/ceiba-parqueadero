package co.ceiba.parking.service.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.converter.CarroConverter;
import co.ceiba.parking.converter.MotoConverter;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.entities.ParkingEntity;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.repository.VehiculoRepository;
import co.ceiba.parking.service.VigilanteService;

@Service("VehiculoService")
public class VigilanteServiceImpl implements VigilanteService {

	int lunes = Calendar.MONDAY;
	int domingo = Calendar.SUNDAY;

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
	@Qualifier("vehiculoRepository")
	private VehiculoRepository vehiculoRepo;

	@Override
	public boolean verificarPlacaConElDia(VehiculoModel vehiculoModel, int diaIngreso) {
		String placa = vehiculoModel.getPlaca();
		char primeraLetra = placa.charAt(0);
		if ((primeraLetra == 'A') && ((lunes == diaIngreso) || (domingo == diaIngreso))) {
			return true;
		}
		return false;
	}

	@Override
	public void addVehiculo(CarroModel carroModel, int idParking) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if (verificarDisponibilidad(CarroModel.tipo)) {
			parqueadero.setNumCeldasCarro(parqueadero.getNumCeldasCarro() - 1);
			if (verificarPlacaConElDia(carroModel, Calendar.DAY_OF_WEEK)) {
				vehiculoRepo.save(carroConverter.model2entity(carroModel));
			}
		}
	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		return (celdasParqueadero(1, tipoVehiculo) != 0);
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
		return idParking;
		// ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		// if("Carro".equals(tipoVehiculo)) {
		// return parqueadero.getNumCeldasCarro();
		// }else {
		// return parqueadero.getNumCeldasMoto();
		// }

	}

	@Override
	public void outVehiculo(VehiculoModel vehiculoModel, String tipoVehiculo, int idParqueadero) {

	}

}
