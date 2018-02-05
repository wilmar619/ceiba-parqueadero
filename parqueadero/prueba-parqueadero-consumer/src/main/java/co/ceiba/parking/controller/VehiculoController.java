package co.ceiba.parking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ceiba.parking.model.Vehiculo;
import co.ceiba.parking.service.InterfaceVehiculo;



@RestController
@RequestMapping(path = "/rest/vehiculo")
public class VehiculoController {

	@Autowired
	private InterfaceVehiculo vehi;

	@GetMapping(path = "/all")
	public ResponseEntity<List<Vehiculo>> list() {
		return new ResponseEntity<List<Vehiculo>>(vehi.list(), HttpStatus.OK);
	}

	@GetMapping(value = "/id={id}")
	public ResponseEntity<Vehiculo> list(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(vehi.findOne(id), HttpStatus.OK);
	}

	@PostMapping(value = "/guardar")
	public ResponseEntity<Void> postMethod(@RequestBody Vehiculo vehiculos) {
		vehi.create(vehiculos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
