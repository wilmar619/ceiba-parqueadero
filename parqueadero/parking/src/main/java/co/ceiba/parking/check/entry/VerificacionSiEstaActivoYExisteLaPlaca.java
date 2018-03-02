package co.ceiba.parking.check.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import co.ceiba.parking.exception.ParkingException;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.repository.FacturaRepository;


public class VerificacionSiEstaActivoYExisteLaPlaca implements VerificacionEntrada {

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;
	
	public VerificacionSiEstaActivoYExisteLaPlaca(FacturaRepository facturaRepo) {
		this.facturaRepo=facturaRepo;
	}


	@Override
	public void verificacion(VehiculoModel vehiculoModel) {
		String placa = vehiculoModel.getPlaca();
		if (verificarSiEstaActivoYExisteLaPlaca(placa)) {
			throw new ParkingException("La placa ingresada ya existe en el parqueadero");
		}
	}

	public boolean verificarSiEstaActivoYExisteLaPlaca(String placa) {
		return facturaRepo.findByPlacaAndEstado(placa, true) != null;
	}

}
