package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.modelo.service.InterfaceVehiculoImplem;


public class VehiculoVerificarPlacaTest {

	@Test
	public void verificarPlacatest() {
		//Arrange
		InterfaceVehiculoImplem prueba = new InterfaceVehiculoImplem();
		//Act	
		String vehiculo = prueba.verificarPlaca("Domingo");		
		//Assert
	assertEquals("puede ingresar", vehiculo);
	}

}
