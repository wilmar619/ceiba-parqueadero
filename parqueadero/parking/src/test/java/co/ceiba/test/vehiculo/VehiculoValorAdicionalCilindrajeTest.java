package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import co.ceiba.parking.service.InterfaceVehiculoImplem;

public class VehiculoValorAdicionalCilindrajeTest {

	@Test
	public void valorAdicionalCilindrajeTest() {
		
		//Arrange
		InterfaceVehiculoImplem prueba = new InterfaceVehiculoImplem();
	//	Vehiculo pruebaVehiculo = new Vehiculo(800, "moto", "ADF125");
		//Act
		
		int valorAdicional = 2000;
		int cilindraje = prueba.valorAdicionalCilindraje();
//		int valorAdicional = 2000;
//		int mayorCilindraje = pruebaVehiculo.getCilindraje();
//		mayorCilindraje = prueba.valorAdicionalCilindraje();
		
		//Assert
		assertEquals(valorAdicional, cilindraje);
	}

}
