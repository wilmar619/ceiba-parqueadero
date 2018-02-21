package co.ceiba.parking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.VehiculoRepository;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ParkingApplication.class)
@SpringBootTest
public class CalcularTotalApagarCarro {

	@Autowired
	@Qualifier("VigilanteService")
	VigilanteService vigilante;

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Autowired
	@Qualifier("vehiculoRepository")
	private VehiculoRepository vehiculoRepo;

	@Test
	public void CalcularTotalApagarCarroHorastest() {
		VehiculoEntity carro = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();
		
		carro.setPlaca("TWB413");
		vehiculoRepo.save(carro);	
		
		fac.setPlaca(carro.getPlaca());
		fac.setTiempoDeParqueo(40);
		fac.setTipoVehiculo("carro");
		facturaRepo.save(fac);

		assertEquals(16000, vigilante.calcularTotalApagarCarro("TWB413"));
		
		vehiculoRepo.delete(carro);
		facturaRepo.delete(fac);

	}
	@Test
	public void CalcularTotalApagarCarroValorMalotest() {
		VehiculoEntity carro = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();
		
		carro.setPlaca("TWB413");
		vehiculoRepo.save(carro);	
		
		fac.setPlaca(carro.getPlaca());
		fac.setTiempoDeParqueo(20);
		fac.setTipoVehiculo("carro");
		facturaRepo.save(fac);

		assertNotEquals(15000, vigilante.calcularTotalApagarCarro("TWB413"));
		
		vehiculoRepo.delete(carro);
		facturaRepo.delete(fac);

	}@Test
	public void CalcularTotalApagarCarroHorasYMinutos() {
		VehiculoEntity carro = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();
		
		carro.setPlaca("TWB413");
		vehiculoRepo.save(carro);	
		
		fac.setPlaca(carro.getPlaca());
		fac.setTiempoDeParqueo(49);
		fac.setTipoVehiculo("carro");
		facturaRepo.save(fac);

		assertEquals(17000, vigilante.calcularTotalApagarCarro("TWB413"));
		
		vehiculoRepo.delete(carro);
		facturaRepo.delete(fac);

	}

}
