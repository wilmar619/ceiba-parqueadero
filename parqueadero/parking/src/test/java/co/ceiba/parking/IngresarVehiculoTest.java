package co.ceiba.parking;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.service.impl.VigilanteServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
@Transactional
public class IngresarVehiculoTest {
	
	@Autowired
	@Qualifier("VigilanteService")
	private VigilanteServiceImpl vigi;
	
	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;


	@Test
	public void addVehiculoCarrotest() {
		
		CarroModel carro = new CarroModel();
		carro.setPlaca("YAO83C");
		carro.setTipoVehiculo(CarroModel.tipo);	
		vigi.addVehiculo(carro, 1);
		
		FacturaEntity fac = facturaRepo.findByPlacaAndEstado("YAO83C", true);
		assertEquals(carro.getPlaca(), fac.getPlaca() );	
		
		facturaRepo.delete(fac);
	
	}
	
	@Test
	public void addVehiculoMotoTest() {
		
		MotoModel moto = new MotoModel();
		moto.setPlaca("KAO83C");
		moto.setTipoVehiculo(MotoModel.tipo);	
		moto.setCilindraje(100);
		vigi.addVehiculo(moto, 1);
		
		FacturaEntity fac = facturaRepo.findByPlacaAndEstado("KAO83C", true);
		
		assertEquals(moto.getPlaca(), fac.getPlaca() );
		
		facturaRepo.delete(fac);
		
	}

}
