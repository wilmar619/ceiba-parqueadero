package co.ceiba.parking;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ParkingApplication.class)
@SpringBootTest
public class CalcularTimpoEnHoras {

	@Autowired
	@Qualifier("VigilanteService")
	VigilanteService vigilante;

	@Test
	public void CalcularTimpoEnHorastest() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 14, 10, 0, 0).getTime();

		assertEquals(3, vigilante.calcularTimpoEnHoras(entrada, salida));
	}

	@Test
	public void CalcularTimpoEnHorasConMinutostest() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 14, 10, 2, 0).getTime();

		assertEquals(4, vigilante.calcularTimpoEnHoras(entrada, salida));
	}

	@Test
	public void CalcularTimpoEnHorasConSegundostest() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 14, 10, 0, 3).getTime();

		assertEquals(4, vigilante.calcularTimpoEnHoras(entrada, salida));
	}

	@Test
	public void CalcularTimpoEnHorasConDiastest() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 15, 7, 0, 0).getTime();

		assertEquals(24, vigilante.calcularTimpoEnHoras(entrada, salida));

	}
	@Test
	public void CalcularTimpoEnHorasQueFalletest() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 15, 10, 0, 0).getTime();

		assertNotEquals(24, vigilante.calcularTimpoEnHoras(entrada, salida));
	
		

	}
}
