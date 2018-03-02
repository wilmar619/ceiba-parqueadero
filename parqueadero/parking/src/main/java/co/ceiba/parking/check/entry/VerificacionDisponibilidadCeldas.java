package co.ceiba.parking.check.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import co.ceiba.parking.entities.ParkingEntity;
import co.ceiba.parking.exception.ParkingException;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.ParkingRepository;

public class VerificacionDisponibilidadCeldas implements VerificacionEntrada{
	
	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;
	
	public VerificacionDisponibilidadCeldas(ParkingRepository parkingRepo) {
		this.parkingRepo=parkingRepo;
	}
	
	@Override
	public void verificacion(VehiculoModel vehiculoModel) {
		String tipoVehiculo = vehiculoModel.getTipoVehiculo();
		if (celdasParqueadero(1, tipoVehiculo) <= 0) {
			throw new ParkingException("NO hay celdas disponibles para  " + tipoVehiculo );
		}
	}

	public int celdasParqueadero(int idParking, String tipoVehiculo) {
		ParkingEntity parqueadero = parkingRepo.findByIdParking(idParking);
		if (CarroModel.tipo.equals(tipoVehiculo)) {
			return parqueadero.getNumCeldasCarro();
		} else {
			return parqueadero.getNumCeldasMoto();
		}
	}

}
