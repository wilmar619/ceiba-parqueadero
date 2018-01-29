package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import co.ceiba.parking.modelo.servicio.prueba.InterfaceVehiculoImplem;

class VehiculoVerificarPlacaTest {

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
