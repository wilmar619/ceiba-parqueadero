package co.ceiba.parking.service;

import java.util.List;
import co.ceiba.parking.model.Vehiculo;

public interface InterfaceVehiculo {

	List <Vehiculo> list ();

	Vehiculo findOne(Integer id);
	
	Vehiculo create(Vehiculo vehiculos);
}
