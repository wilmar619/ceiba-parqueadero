package co.ceiba.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.service.impl.EntradaVehiculo;



@RestController
@RequestMapping(path = "/rest/carro")
public class CarroController {

	@Autowired
	@Qualifier("vigilanteServicioIngreso")
	private EntradaVehiculo entraVehiculo;


	
	@PostMapping(value = "/guardar")
	public void addVehiculo(@RequestBody CarroModel vehiculo) {
	
	}
}
