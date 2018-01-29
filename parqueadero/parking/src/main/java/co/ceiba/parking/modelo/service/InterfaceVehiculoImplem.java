package co.ceiba.parking.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import co.ceiba.parking.model.Vehiculo;

public class InterfaceVehiculoImplem implements InterfaceVehiculo {

	@Autowired
	Vehiculo pruebaVehiculo = new Vehiculo();

	@Override
	public boolean validarTipo() {

		boolean carro = true;
		boolean moto = false;

		if (carro == pruebaVehiculo.getTipo()) {
			return carro;
		}
		return moto;
	}

	@Override
	public String verificarPlaca(String dia) {

		String letra = pruebaVehiculo.getPlaca();

		if (letra == "A" && dia.equals("Domingo") && dia.equals("Lunes")) {

			return "puede ingresar";
		} else {

			return "no puede ingresar";

		}

	}

	@Override
	public int valorAdicionalCilindraje() {
		int valorAdicional = 2000;
		int mayorCilindraje = pruebaVehiculo.getCilindraje();

		if (mayorCilindraje > 500 && validarTipo() == false) {

			return valorAdicional;
		}
		return 0;

	}

}
