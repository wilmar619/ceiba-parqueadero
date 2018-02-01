package co.ceiba.parking.service;

import org.springframework.stereotype.Service;

import co.ceiba.parking.model.Parking;
import co.ceiba.parking.model.Vehiculo;

@Service
public class InterfaceParkingImplem implements InterfaceParking {
	Parking parqueadero = new Parking();
	Vehiculo pruebaCarro = new Vehiculo(500, "", "AGH562");
	Vehiculo pruebaMoto = new Vehiculo(800, "moto", "TGH562");
	Vehiculo pruebaVehiculo = new Vehiculo();
	
	@Override
	public String ingresoVehiculo(String tipoVehiculo) {
		if (tipoVehiculo == "carro") {
			parqueadero.setCeldaCarro(parqueadero.getCeldaCarro()-1);
			return "ingresado carro con exito";
		} else {
			parqueadero.setCeldaMoto(parqueadero.getCeldaMoto()-1);
			return "ingresado moto con exito";
		}
	}

	@Override
	public Integer calcularPago() {		
		
		return null;
	}

	@Override
	public String salidaVehiculo() {
		return null;
	}

	@Override
	public String disponibilidadVehiculos() {
		if (pruebaCarro.getTipo() == "carro" && parqueadero.getCeldaCarro() == 0) {
			return "No hay cupos para carros";
		} else if (pruebaMoto.getTipo() == "moto" && parqueadero.getCeldaMoto() == 0) {
			return "No hay cupos para motos";
		} else {
			return "Puede ingresar el vehiculo";
		}
	}

}
