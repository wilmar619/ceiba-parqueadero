package co.ceiba.parking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
public class CalcularTotalApagar {
	
	@Autowired
	@Qualifier("VigilanteService")
	VigilanteService vigilante;
	
	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Test
	public void CalcularTotalApagartest() {
		
		FacturaEntity factura = facturaRepo.findByPlaca("abc123");
		
		int tiempoDeParqueo = 2;
		
		assertEquals(8000, vigilante.calcularTotalApagar("abc123"));

	}

}
