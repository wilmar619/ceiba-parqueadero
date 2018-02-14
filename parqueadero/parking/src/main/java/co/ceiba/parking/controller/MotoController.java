package co.ceiba.parking.controller;

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
@RequestMapping("/moto")
public class MotoController {

	Calendario calendario = new Calendario();
	int dia = calendario.getActualDay();
//	private static final String MOTO = "Moto";

//	private static final Log LOG = LogFactory.getLog(MotoController.class);

	@Autowired
	@Qualifier("VehiculoService")
	private VigilanteService vigilante;

	@PostMapping("/addVehiculo")
	public void addVehiculo(@RequestBody VehiculoModel vehiculoModel) {

	}
}
