package co.ceiba.test.vehiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import co.ceiba.parking.modelo.servicio.prueba.InterfaceVehiculoImplem;

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