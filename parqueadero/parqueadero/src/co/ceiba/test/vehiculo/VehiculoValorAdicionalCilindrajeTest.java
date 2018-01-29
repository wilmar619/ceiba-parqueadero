package co.ceiba.test.vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import co.ceiba.parking.modelo.servicio.prueba.InterfaceVehiculoImplem;

class VehiculoValorAdicionalCilindrajeTest {

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