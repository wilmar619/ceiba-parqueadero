package co.ceiba.parking.modelo.servicio.prueba;

import co.ceiba.parking.modelo.servicio.Vehiculo;

public class InterfaceVehiculoImplem implements InterfaceVehiculo {

	Vehiculo pruebaVehiculo = new Vehiculo(800, "moto", "ADF125");

	@Override
	public String validarTipo() {

		String carro = "carro";
		String moto = "moto";

		if (carro == pruebaVehiculo.getTipo()) {
			return carro;
		}
		return moto;
	}

	@Override
	public String verificarPlaca(String dia) {

		char letra = pruebaVehiculo.getPlaca().charAt(0);

		if (letra == 'A' && (dia.equals("Domingo") || dia.equals("Lunes"))) {

			return "puede ingresar";
		} else {

			return "no puede ingresar";

		}
	}

	@Override
	public int valorAdicionalCilindraje() {
		int valorAdicional = 2000;
		int mayorCilindraje = pruebaVehiculo.getCilindraje();

		if (mayorCilindraje > 500 && validarTipo() == "moto") {

			return valorAdicional;
		}
		return 0;

	}

}
