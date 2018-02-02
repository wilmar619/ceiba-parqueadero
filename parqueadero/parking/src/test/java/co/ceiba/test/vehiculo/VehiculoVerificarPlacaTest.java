package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.ceiba.parking.service.InterfaceVehiculoImplem;

public class VehiculoVerificarPlacaTest {

	@Test
	public void verificarPlacatest() {
		// Arrange
		InterfaceVehiculoImplem prueba = new InterfaceVehiculoImplem();
		// Act
		String vehiculo = prueba.verificarPlaca("Domingo");
		// Assert
		assertEquals("puede ingresar", vehiculo);
	}

}
