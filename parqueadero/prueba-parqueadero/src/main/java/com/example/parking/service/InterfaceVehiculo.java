package com.example.parking.service;

import java.util.List;
import com.example.parking.dominio.Vehiculo;
 

public interface InterfaceVehiculo {

	List <Vehiculo> list ();

	Vehiculo findOne(Integer id);
	
	Vehiculo create(Vehiculo vehiculos);
}
