package co.ceiba.parking.check.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import co.ceiba.parking.exception.ParkingException;
import co.ceiba.parking.repository.FacturaRepository;

public class VerificacionSiEstaActivoYExisteLaPlacaSalida implements VerificacionSalida {

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;
	
	public VerificacionSiEstaActivoYExisteLaPlacaSalida(FacturaRepository facturaRepo) {
		this.facturaRepo=facturaRepo;
	}


	@Override
	public void verificacion(String placa) {
		if (verificarSiEstaActivoYExisteLaPlaca(placa)) {
			throw new ParkingException("La placa ingresada no existe parqueadero");
		}
	}

	public boolean verificarSiEstaActivoYExisteLaPlaca(String placa) {
		return facturaRepo.findByPlacaAndEstado(placa, true) != null;
	}

}
