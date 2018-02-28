package co.ceiba.parking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import co.ceiba.parking.service.impl.VigilanteServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
@Transactional
public class ValorAdicionalCilindraje {
	
	private static final Object VALOR_ADICIONAL_MOTO = 2000;

	VigilanteServiceImpl vigi = new VigilanteServiceImpl();

	
	@Test
	public void ValorAdicionalCilindrajeValidotest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		
//		moto.setCilindraje(500);
		int cilindrajeDeLaMoto = 800;
		
		assertEquals(VALOR_ADICIONAL_MOTO, vigi.valorAdicionalCilindraje(cilindrajeDeLaMoto));
	}
	@Test
	public void ValorAdicionalCilindrajeNoValidotest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		
//		moto.setCilindraje(500);
		int cilindrajeDeLaMoto = 100;
		
		assertNotEquals(VALOR_ADICIONAL_MOTO, vigi.valorAdicionalCilindraje(cilindrajeDeLaMoto));
	}

}
