package co.ceiba.parking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import co.ceiba.parking.check.entry.VerificacionDiaYPlacaHabil;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.VehiculoModel;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
@Transactional
public class VerificarPlacaConElDiaTest {


	VerificacionDiaYPlacaHabil veri = new VerificacionDiaYPlacaHabil();

	@Test
	public void testVerificarPlacaTieneLetraAyDiaLunes() {

		VehiculoModel vehiculoModel = new CarroModel();

		vehiculoModel.setPlaca("AAA123");

		boolean placaIniciaPorA = veri.verificarPlacaConElDia(vehiculoModel, Calendar.MONDAY);

		assertTrue(placaIniciaPorA);
	}

	@Test
	public void testVerificarPlacaTieneLetraAyDiaDomingo() {
		VehiculoModel vehiculoModel = new CarroModel();
		vehiculoModel.setPlaca("AAA123");

		boolean placaIniciaPorA = veri.verificarPlacaConElDia(vehiculoModel, Calendar.SUNDAY);

		assertTrue(placaIniciaPorA);
	}

	@Test
	public void testVerificarPlacaNoTieneLetraAyDiaLunes() {
		VehiculoModel vehiculoModel = new CarroModel();
		vehiculoModel.setPlaca("BAA123");

		boolean placaNoIniciaPorA = veri.verificarPlacaConElDia(vehiculoModel, Calendar.MONDAY);

		assertTrue(placaNoIniciaPorA);

	}

	@Test
	public void testVerificarPlacaNoTieneLetraAyDiaDomingo() {
		VehiculoModel vehiculoModel = new CarroModel();
		vehiculoModel.setPlaca("BAA123");

		boolean placaNoIniciaPorA = veri.verificarPlacaConElDia(vehiculoModel, Calendar.SUNDAY);

		assertTrue(placaNoIniciaPorA);
	}
	@Test
	public void testVerificarPlacaTieneLetraAyNoDiaDomingo() {
		VehiculoModel vehiculoModel = new CarroModel();
		vehiculoModel.setPlaca("AAA123");

		boolean placaNoIniciaPorA = veri.verificarPlacaConElDia(vehiculoModel, Calendar.SATURDAY);

		assertFalse(placaNoIniciaPorA);
	}
}
