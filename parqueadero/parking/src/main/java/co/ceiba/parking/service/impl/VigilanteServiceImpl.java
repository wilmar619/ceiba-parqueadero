package co.ceiba.parking.service.impl;

import java.util.Calendar;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.ceiba.parking.converter.CarroConverter;
import co.ceiba.parking.converter.MotoConverter;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.entities.ParkingEntity;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.repository.VehiculoRepository;
import co.ceiba.parking.service.VigilanteService;

@Service("VigilanteService")
public class VigilanteServiceImpl implements VigilanteService {

	private static final Log LOG = LogFactory.getLog(VigilanteServiceImpl.class);

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
	public void addVehiculo(CarroModel carroModel, int idParking) {
		LOG.info("METHOD: addCarroServicio");
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if (verificarDisponibilidad(CarroModel.tipo)) {
			parqueadero.setNumCeldasCarro(parqueadero.getNumCeldasCarro() - 1);
			if (!verificarPlacaConElDia(carroModel, Calendar.DAY_OF_WEEK)) {
				vehiculoRepo.save(carroConverter.model2entity(carroModel));
				comenzarFactura(carroModel, CarroModel.tipo);
			}
		}
	}

	@Override
	public boolean verificarDisponibilidad(String tipoVehiculo) {
		return (celdasParqueadero(1, tipoVehiculo) != 0);
	}

	public int celdasParqueadero(int idParking, String tipoVehiculo) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if (CarroModel.tipo.equals(tipoVehiculo)) {
			return parqueadero.getNumCeldasCarro();
		} else {
			return parqueadero.getNumCeldasMoto();
		}
	}

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
	public void comenzarFactura(VehiculoModel vehiculoModel, String tipoVehiculo) {
		Date fechaInicio = new Date();
		FacturaEntity factura = new FacturaEntity();
		factura.setEstado(true);
		factura.setPlaca(vehiculoModel.getPlaca());
		factura.setTipoVehiculo(tipoVehiculo);
		factura.setHoraIngreso(fechaInicio);
		facturaRepo.save(factura);
	}

	@Override
	public void outVehiculo(String placa) {
		Date fechaSalida = new Date();
		FacturaEntity factura = facturaRepo.findByPlaca(placa);
		factura.setEstado(false);
		factura.setHoraSalida(fechaSalida);
		long tiempoDeParqueo = calcularTimpoEnHoras(factura.getHoraIngreso(), fechaSalida);
		factura.setTiempoDeParqueo((int) tiempoDeParqueo);
		int totalAPagar = calcularTotalApagar(placa);
		factura.setPagoTotal(totalAPagar);
		facturaRepo.save(factura);

	}

	@Override
	public int calcularTotalApagar(String placa) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(1);
		FacturaEntity factura = facturaRepo.findByPlaca(placa);

		int tiempoParqueado = factura.getTiempoDeParqueo();
		LOG.info("METHOD: juligono " + tiempoParqueado);
		int totalHoras = tiempoParqueado % 24;
		int totalDias = tiempoParqueado / 24;
		if (totalHoras % 24 > 9) {
			totalDias++;
			return totalDias * parqueadero.getPrecioDiaCarro();
		}

		return totalHoras * parqueadero.getPrecioHoraCarro() + totalDias * parqueadero.getPrecioDiaCarro();
	}

	@Override
	public long calcularTimpoEnHoras(Date fechaEntrada, Date fechaSalida) {
		long tiempoEnHoras = ((fechaSalida.getTime() - fechaEntrada.getTime()) / (60 * 60 * 1000));
		long timpoEnSegundos = ((fechaSalida.getTime() - fechaEntrada.getTime()) % (60 * 60 * 1000));
		if ((timpoEnSegundos) != 0) {
			tiempoEnHoras++;
		}

		return tiempoEnHoras;
	}

	public int valorAdicionalCilindraje(int cilindraje) {
		int valorAdicional = 2000;
		if (cilindraje > 500) {
			return valorAdicional;
		}
		int noValorAdicional = 0;
		return noValorAdicional;

	}

	@Override
	public void addVehiculo(MotoModel motoModel, int idParking) {
	}

}
