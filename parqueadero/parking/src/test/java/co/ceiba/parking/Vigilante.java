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
import co.ceiba.parking.service.impl.VigilanteServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
public class Vigilante {
	
	@Autowired
	@Qualifier("VigilanteService")
	VigilanteService vigilante;
	
	@Test
	public void test() {
		Date entrada = new GregorianCalendar(2018, 1, 14, 7, 0, 0).getTime();
		Date salida = new GregorianCalendar(2018, 1, 14, 9, 0, 0).getTime();
		
		assertEquals(2,vigilante.calcularTimpoEnHoras(entrada, salida));
	}

}
