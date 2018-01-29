package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.modelo.service.InterfaceVehiculoImplem;

public class VehiculoValorAdicionalCilindrajeTest {

	@Test
	public void valorAdicionalCilindrajeTest() {
		
		//Arrange
		InterfaceVehiculoImplem prueba = new InterfaceVehiculoImplem();
		
		//Act
		int valorAdicional = 2000;
		int cilindraje = prueba.valorAdicionalCilindraje();
		
		//Assert
		assertEquals(valorAdicional, cilindraje);
	}

}
