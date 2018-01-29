package co.ceiba.test.parking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.model.Vehiculo;
import co.ceiba.parking.modelo.service.InterfaceParkingImplem;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingIngresoVehiculoTest {

	@Test
	public void ingresoVehiculoTest() {
		
		//Arrange
		InterfaceParkingImplem prueba = new InterfaceParkingImplem();
		Vehiculo pruebaCarro = new Vehiculo(500, "carro", "AGH562");
		Vehiculo pruebaMoto = new Vehiculo(800, "moto", "TGH562");
		//Act
		String tipoVehiculo = pruebaCarro.getTipo();	
		String carro = prueba.ingresoVehiculo(tipoVehiculo);
		String tipoVehiculo2 = pruebaMoto.getTipo();
		String moto = prueba.ingresoVehiculo(tipoVehiculo2);
		
		// Assert
		assertEquals("ingresado carro con exito", carro);
		assertEquals("ingresado moto con exito", moto);
		
	}

}
