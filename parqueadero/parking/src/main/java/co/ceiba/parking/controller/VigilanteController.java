package co.ceiba.parking.controller;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.ceiba.parking.model.Calendario;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.service.VigilanteService;
import co.ceiba.parking.model.VehiculosActivos;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/parqueadero")
public class VigilanteController {

	Calendario calendario = new Calendario();
	int dia = calendario.getActualDay();
	private static final Log LOG = LogFactory.getLog(VigilanteController.class);

	@Autowired
	@Qualifier("VigilanteService")
	private VigilanteService vigilante;

	@PostMapping("/addCarro")
	public void addVehiculo(@RequestBody CarroModel carroModel) {
		LOG.info("METHOD: addCarroController: " + carroModel.toString());
		vigilante.addVehiculo(carroModel, 1);
	}
	
	
	@PostMapping("/addMoto")
	public void addVehiculo(@RequestBody MotoModel motoModel) {	
		LOG.info("METHOD: addCarroController: " + motoModel.toString());
		vigilante.addVehiculo(motoModel, 1);

	}
	
	@PostMapping("/outVehiculo")
	public void sacarVehiculo(@RequestBody String placa) throws JSONException  {
		LOG.info("METHOD: outCarroController: " + placa) ;
		JSONObject json = new JSONObject(placa);
		String jsonPlaca = json.getString("placa");	 
		vigilante.outVehiculo(jsonPlaca);
	}

	
	@GetMapping("/listVehiculoActivos")
	public List<VehiculosActivos> listVehiculos() {		
		return vigilante.listaVehiculosActivos();
	}
}
