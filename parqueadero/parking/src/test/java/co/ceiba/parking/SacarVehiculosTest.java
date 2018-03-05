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
public class SacarVehiculosTest {

	@Autowired
	@Qualifier("VigilanteService")
	private VigilanteServiceImpl vigi;

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Test
	public void outVehiculoCarroTest() {

		CarroModel carro = new CarroModel();
		carro.setPlaca("ERF83C");
		carro.setTipoVehiculo(CarroModel.tipo);
		vigi.addVehiculo(carro, 1);

		vigi.outVehiculo("ERF83C");

		FacturaEntity fact = facturaRepo.findByPlacaAndEstado("ERF83C", false);

		assertEquals(carro.isEstado(), fact.isEstado());
		
		facturaRepo.delete(fact);

	}
	
	@Test
	public void outVehiculoMotoTest() {

		MotoModel moto = new MotoModel();
		moto.setPlaca("UUO83C");
		moto.setTipoVehiculo(MotoModel.tipo);	
		moto.setCilindraje(100);
		vigi.addVehiculo(moto, 1);

		vigi.outVehiculo("UUO83C");

		FacturaEntity fact = facturaRepo.findByPlacaAndEstado("UUO83C", false);

		assertEquals(moto.isEstado(), fact.isEstado());
		
		facturaRepo.delete(fact);

	}

}
