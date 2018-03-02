package co.ceiba.parking.check.entry;

import java.util.Calendar;
import co.ceiba.parking.exception.ParkingException;
import co.ceiba.parking.model.VehiculoModel;


public class VerificacionDiaYPlacaHabil implements VerificacionEntrada {


	@Override
	public void verificacion(VehiculoModel vehiculoModel) {
		if (!verificarPlacaConElDia(vehiculoModel, Calendar.DAY_OF_WEEK)) {
			throw new ParkingException("El dia de hoy no puede ingresar vehiculos iniciados con A");
		}

	}

	public boolean verificarPlacaConElDia(VehiculoModel vehiculoModel, int diaIngreso) {
		String placa = vehiculoModel.getPlaca().toUpperCase();
		char primeraLetra = placa.charAt(0);
		if (primeraLetra == 'A') {
			return (Calendar.MONDAY == diaIngreso) || (Calendar.SUNDAY == diaIngreso);
		}

		return true;
	}

}
