package co.ceiba.parking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;
import co.ceiba.parking.repository.VehiculoRepository;


@RunWith(SpringRunner.class)
//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = ParkingApplication.class)
//@Transactional
public class CalcularTotalApagarVehiculosTest {


	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepository facturaRepo;

	@Autowired
	@Qualifier("vehiculoRepository")
	private VehiculoRepository vehiculoRepo;
	
	@Autowired
	@Qualifier("parkingRepository")
	private ParkingRepository parkingRepo;
	
	//@InjectMocks
//	VigilanteServiceImpl vigi = new VigilanteServiceImpl(null, null);

	@Test
	public void CalcularTotalApagarCarroHorastest() {
//		VehiculoEntity carro = new VehiculoEntity();
//		
//		FacturaEntity fac = new FacturaEntity();
//		carro.setPlaca("TRB413");
//		vehiculoRepo.save(carro);	
//		
//		fac.setPlaca("TRB413");
//		fac.setTiempoDeParqueo(1);
//		fac.setTipoVehiculo("carro");
//		facturaRepo.save(fac);
//		
//		fac.setCilindraje(0);
//		fac.setEstado(true);
//		fac.setHoraIngreso((2018, 1, 14, 7, 0, 0).getTime());
//		fac.setHoraSalida((2018, 1, 14, 7, 0, 0).getTime());

		
		
	//	facturaRepo.save(fac);

	
//		

//	}
//	@Test
//	public void CalcularTotalApagarCarroValorMalotest() {
//		VehiculoEntity carro = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//		
//		carro.setPlaca("TWB414");
//		vehiculoRepo.save(carro);	
//		
//		fac.setPlaca(carro.getPlaca());
//		fac.setTiempoDeParqueo(20);
//		fac.setTipoVehiculo("carro");
//		facturaRepo.save(fac);
//
//		assertNotEquals(5500, vigi.calcularTotalApagarVehiculo("TWB414"));
//		
//		vehiculoRepo.delete(carro);
//		facturaRepo.delete(fac);
//
//	}
//	@Test
//	public void CalcularTotalApagarCarroHorasYMinutos() {
//		VehiculoEntity carro = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//		
//		carro.setPlaca("TWB418");
//		vehiculoRepo.save(carro);	
//		
//		fac.setPlaca(carro.getPlaca());
//		fac.setTiempoDeParqueo(49);
//		fac.setTipoVehiculo("carro");
//		facturaRepo.save(fac);
//
//		assertEquals(17000, vigi.calcularTotalApagarVehiculo("TWB418"));
//		
//		vehiculoRepo.delete(carro);
//		facturaRepo.delete(fac);
//
//	}
//	
//	@Test
//	public void CalcularTotalApagarMotoHorastest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//
//		moto.setPlaca("ETR456");
//		moto.setCilindraje(100);
//		vehiculoRepo.save(moto);
//
//		fac.setPlaca(moto.getPlaca());
//		fac.setTiempoDeParqueo(1);
//		fac.setTipoVehiculo("moto");
//		fac.setCilindraje(moto.getCilindraje());
//
//		facturaRepo.save(fac);
//
//		assertEquals(500, vigi.calcularTotalApagarVehiculo("ETR456"));
//
//	}
//
//	@Test
//	public void CalcularTotalApagarMotoHorasMasValorAdicionaltest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//		
//		moto.setPlaca("ETR458");
//		moto.setCilindraje(800);
//		vehiculoRepo.save(moto);
//		
//		fac.setPlaca(moto.getPlaca());
//		fac.setTiempoDeParqueo(1);
//		fac.setTipoVehiculo("moto");
//		fac.setCilindraje(moto.getCilindraje());
//		
//		facturaRepo.save(fac);
//
//		assertEquals(2500, vigi.calcularTotalApagarVehiculo("ETR458"));
//
//		vehiculoRepo.delete(moto);
//		 facturaRepo.delete(fac);
//		
//	}
//
//	@Test
//	public void CalcularTotalApagarMotoHorasMasDeUnDiaSinValorAdicionaltest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//
//		moto.setPlaca("ETR457");
//		moto.setCilindraje(200);
//		vehiculoRepo.save(moto);
//
//		fac.setPlaca(moto.getPlaca());
//		fac.setTiempoDeParqueo(25);
//		fac.setTipoVehiculo("moto");
//		fac.setCilindraje(moto.getCilindraje());
//
//		facturaRepo.save(fac);
//
//		assertEquals(4500, vigi.calcularTotalApagarVehiculo("ETR457"));
//
//	}
//
//	@Test
//	public void CalcularTotalApagarMotoHorasMasDeUnDiaConValorAdicionaltest() {
//		VehiculoEntity moto = new VehiculoEntity();
//		FacturaEntity fac = new FacturaEntity();
//
//		moto.setPlaca("ETR450");
//		moto.setCilindraje(800);
//		vehiculoRepo.save(moto);
//
//		fac.setPlaca(moto.getPlaca());
//		fac.setTiempoDeParqueo(25);
//		fac.setTipoVehiculo("moto");
//		fac.setCilindraje(moto.getCilindraje());
//
//		facturaRepo.save(fac);
//
//		assertEquals(6500, vigi.calcularTotalApagarVehiculo("ETR450"));
//
	}

}
