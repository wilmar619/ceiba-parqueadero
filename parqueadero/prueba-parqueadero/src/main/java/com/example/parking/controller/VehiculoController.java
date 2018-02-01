package com.example.parking.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.parking.dominio.Vehiculo;
import com.example.parking.service.InterfaceVehiculo;
import org.springframework.http.MediaType;


@RestController
@RequestMapping(path = "/rest/vehiculo")
public class VehiculoController {
	
	@Autowired
	private InterfaceVehiculo vehi;
	
	@RequestMapping(path = "/all")
	public ResponseEntity<List<Vehiculo>> list() {
		return new ResponseEntity<>(vehi.list(), HttpStatus.OK);
	}
	@RequestMapping(value = "/id={id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Vehiculo> list(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(vehi.findOne(id), HttpStatus.OK);
	}
	@PostMapping(value = "/guardar")
	public ResponseEntity<Void> postMethod(@RequestBody Vehiculo vehiculos) {
		vehi.create(vehiculos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
