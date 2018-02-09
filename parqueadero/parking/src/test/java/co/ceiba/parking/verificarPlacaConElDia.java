package co.ceiba.parking;

import static org.junit.Assert.assertTrue;
import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
public class verificarPlacaConElDia {

	@Autowired
	private VigilanteService vigilanteService;

	@Test
	public void testVerificarPlacaTieneLetraAyDiaLunes() {
		VehiculoModel vehiculoModel = new VehiculoModel();
		vehiculoModel.setPlaca("AAA123");

		boolean placaIniciaPorA = vigilanteService.verificarPlacaConElDia(vehiculoModel, Calendar.MONDAY);

		assertTrue(placaIniciaPorA);
	}

	@Test
	public void testVerificarPlacaTieneLetraAyDiaDomingo() {
		VehiculoModel vehiculoModel = new VehiculoModel();
		vehiculoModel.setPlaca("AAA123");

		boolean placaIniciaPorA = vigilanteService.verificarPlacaConElDia(vehiculoModel, Calendar.SUNDAY);

		assertTrue(placaIniciaPorA);
	}
	@Test
	public void testVerificarPlacaTieneNoLetraAyDiaDomingo() {
		
	}
	@Test
	public void testVerificarPlacaTieneNoLetraAyDiaLunes() {
		
	}
}
