package co.ceiba.parking.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.ceiba.parking.model.Calendario;
import co.ceiba.parking.model.VehiculoModel;
import co.ceiba.parking.service.VigilanteService;

@RestController
@RequestMapping("/carro")
public class CarroController {

	Calendario calendario = new Calendario();
	int dia = calendario.getActualDay();
	private static final String CARRO = "Carro";

	private static final Log LOG = LogFactory.getLog(CarroController.class);

	@Autowired
	@Qualifier("VehiculoService")
	private VigilanteService vigilante;

	@PostMapping("/addVehiculo")
	public void addVehiculo(@RequestBody VehiculoModel vehiculoModel) {
//		LOG.info("METHOD: addCarro() -- PARAMS: " + vehiculoModel.toString());
//		if (vigilante.verificarPlacaConElDia(vehiculoModel, dia) && vigilante.verificarDisponibilidad(CARRO)) {
//			vigilante.addVehiculo(vehiculoModel, CARRO, 1);
//			LOG.info("Carro ingresado");
//		} else {
//			LOG.info("Acceso denegado");
//		}
	}

	@PostMapping("/numCeldas")
	public boolean numCeldas() {
		return false;
		//return vigilante.verificarDisponibilidad(CARRO);
	}

//	@PutMapping
//	public int outVehiculo(@RequestBody VehiculoModel vehiculoModel) {
//		vigilante.verificarPlaca(vehiculoModel, dia);
//		int total = 0 ;
//		return total;
//	}
}
