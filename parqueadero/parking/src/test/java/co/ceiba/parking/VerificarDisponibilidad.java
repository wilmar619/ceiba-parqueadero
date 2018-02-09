package co.ceiba.parking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.service.VigilanteService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
public class VerificarDisponibilidad {
	
	@Autowired
	private VigilanteService vigilanteService;

	@Test
	public void testVerificarDisponibilidad() {
	
	}

}
