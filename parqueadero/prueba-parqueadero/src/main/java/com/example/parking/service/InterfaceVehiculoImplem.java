package com.example.parking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parking.dominio.Vehiculo;
import com.example.parking.repository.VehiculoRepository;

@Service
public class InterfaceVehiculoImplem implements InterfaceVehiculo {

	@Autowired
	private VehiculoRepository ve;

	@Override
	public List<Vehiculo> list() {
		return (List<Vehiculo>) ve.findAll();
	}

	@Override
	public Vehiculo findOne(Integer id) {
		return ve.findOne(id);
	}

	@Override
	public Vehiculo create(Vehiculo vehiculos) {
		return ve.save(vehiculos);
	}

}
