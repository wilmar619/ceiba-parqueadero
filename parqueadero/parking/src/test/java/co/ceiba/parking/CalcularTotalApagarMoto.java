package co.ceiba.parking;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.VehiculoRepository;
import co.ceiba.parking.service.VigilanteService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
@Transactional
public class CalcularTotalApagarMoto {

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
	public void CalcularTotalApagarMotoHorastest() {
		VehiculoEntity moto = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();

		moto.setPlaca("ETR456");
		moto.setCilindraje(100);
		vehiculoRepo.save(moto);

		fac.setPlaca(moto.getPlaca());
		fac.setTiempoDeParqueo(1);
		fac.setTipoVehiculo("moto");
		fac.setCilindraje(moto.getCilindraje());

		facturaRepo.save(fac);

		assertEquals(500, vigilante.calcularTotalApagarMoto("ETR456"));

	}

	@Test
	public void CalcularTotalApagarMotoHorasMasValorAdicionaltest() {
		VehiculoEntity moto = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();
		
		moto.setPlaca("ETR458");
		moto.setCilindraje(800);
		vehiculoRepo.save(moto);
		
		fac.setPlaca(moto.getPlaca());
		fac.setTiempoDeParqueo(1);
		fac.setTipoVehiculo("moto");
		fac.setCilindraje(moto.getCilindraje());
		
		facturaRepo.save(fac);

		assertEquals(2500, vigilante.calcularTotalApagarMoto("ETR458"));

		vehiculoRepo.delete(moto);
		 facturaRepo.delete(fac);
		
	}

	@Test
	public void CalcularTotalApagarMotoHorasMasDeUnDiaSinValorAdicionaltest() {
		VehiculoEntity moto = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();

		moto.setPlaca("ETR457");
		moto.setCilindraje(200);
		vehiculoRepo.save(moto);

		fac.setPlaca(moto.getPlaca());
		fac.setTiempoDeParqueo(25);
		fac.setTipoVehiculo("moto");
		fac.setCilindraje(moto.getCilindraje());

		facturaRepo.save(fac);

		assertEquals(4500, vigilante.calcularTotalApagarMoto("ETR457"));

	}

	@Test
	public void CalcularTotalApagarMotoHorasMasDeUnDiaConValorAdicionaltest() {
		VehiculoEntity moto = new VehiculoEntity();
		FacturaEntity fac = new FacturaEntity();

		moto.setPlaca("ETR450");
		moto.setCilindraje(800);
		vehiculoRepo.save(moto);

		fac.setPlaca(moto.getPlaca());
		fac.setTiempoDeParqueo(25);
		fac.setTipoVehiculo("moto");
		fac.setCilindraje(moto.getCilindraje());

		facturaRepo.save(fac);

		assertEquals(6500, vigilante.calcularTotalApagarMoto("ETR450"));

	}

}
