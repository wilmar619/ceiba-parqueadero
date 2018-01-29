package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.ceiba.parking.modelo.service.InterfaceVehiculoImplem;

class VehiculoValidarTipoTest {

	@Test
	public void validarTipoTest() {
		//Arrange
		InterfaceVehiculoImplem prueba = new InterfaceVehiculoImplem();
		
		//Act
		String tipo = prueba.validarTipo();

		
		// Assert
		assertEquals("moto", tipo);

		
	}

}
