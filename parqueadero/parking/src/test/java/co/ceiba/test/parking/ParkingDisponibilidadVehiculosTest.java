package co.ceiba.test.parking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.model.Vehiculo;
import co.ceiba.parking.modelo.service.InterfaceParkingImplem;


public class ParkingDisponibilidadVehiculosTest {

	@Test
	public void disponibilidadVehiculos() {

		// Arrange
		InterfaceParkingImplem prueba = new InterfaceParkingImplem();
		Vehiculo pruebaCarro = new Vehiculo(500, "carro", "AGH562");
		// Act
//		String carro = pruebaCarro.getTipo();
//		int celda;
//
//		for (celda = parqueadero.getCeldaCarro(); celda > 20; celda--) {
//			prueba.ingresoVehiculo(carro);
//			System.out.println("esto es-----" + carro);
//		}
//
		String carro2 = pruebaCarro.getTipo();
		String ingreso = prueba.ingresoVehiculo(carro2);
		ingreso = prueba.disponibilidadVehiculos();

		// Assert
		assertEquals("Puede ingresar el vehiculo", ingreso);

	}

}
