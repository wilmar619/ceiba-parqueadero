package co.ceiba.parking;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.model.VehiculosActivos;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.service.impl.VigilanteServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)

public class ListaVehiculosActivosTest {
	
	@Autowired
	@Qualifier("VigilanteService")
	private VigilanteServiceImpl vigi;
	
	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Test
	public void ListaVehiculosActivostest() {
		
		CarroModel carro = new CarroModel();
		carro.setPlaca("GHJ456");
		carro.setTipoVehiculo(CarroModel.tipo);
		vigi.addVehiculo(carro, 1);
		
		MotoModel moto = new MotoModel();
		moto.setPlaca("UUX83C");
		moto.setTipoVehiculo(MotoModel.tipo);	
		moto.setCilindraje(100);
		vigi.addVehiculo(moto, 1);
					
		List<VehiculosActivos> listaVehiculosActivos = vigi.listaVehiculosActivos();
		int vehiculosActivos =  listaVehiculosActivos.size();

		
		assertEquals(4, vehiculosActivos );

	}

}
