package co.ceiba.parking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
public class ValorAdicionalCilindraje {
	
	private static final Object VALOR_ADICIONAL_MOTO = 2000;
	@Autowired
	@Qualifier("VigilanteService")
	VigilanteService vigilante;

	@Test
	public void ValorAdicionalCilindrajeValidotest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		
//		moto.setCilindraje(500);
		int cilindrajeDeLaMoto = 800;
		
		assertEquals(VALOR_ADICIONAL_MOTO, vigilante.valorAdicionalCilindraje(cilindrajeDeLaMoto));
	}
	@Test
	public void ValorAdicionalCilindrajeNoValidotest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		
//		moto.setCilindraje(500);
		int cilindrajeDeLaMoto = 100;
		
		assertNotEquals(VALOR_ADICIONAL_MOTO, vigilante.valorAdicionalCilindraje(cilindrajeDeLaMoto));
	}

}
