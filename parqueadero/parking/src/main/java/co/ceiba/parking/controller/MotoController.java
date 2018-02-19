package co.ceiba.parking.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.ceiba.parking.model.Calendario;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.service.VigilanteService;

@RestController
@RequestMapping("/moto")
public class MotoController {

	Calendario calendario = new Calendario();
	int dia = calendario.getActualDay();
	private static final Log LOG = LogFactory.getLog(MotoController.class);

	@Autowired
	@Qualifier("VigilanteService")
	private VigilanteService vigilante;

	@PostMapping("/addVehiculo")
	public void addVehiculo(@RequestBody MotoModel motoModel) {	
		LOG.info("METHOD: addCarroController: " + motoModel.toString());
		vigilante.addVehiculo(motoModel, 1);

	}

	@PostMapping("/outVehiculo")
	public void addVehiculo(@RequestBody String placa) throws JSONException {
		LOG.info("METHOD: outCarroController: " + placa);
		JSONObject json = new JSONObject(placa);
		String jsonPlaca = json.getString("placa");
		vigilante.outVehiculoMoto(jsonPlaca);
	}
}
