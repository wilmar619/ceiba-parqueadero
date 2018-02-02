package co.ceiba.parking.service;

import java.util.List;

import co.ceiba.parking.model.Parking;


public interface InterfaceParking {

	List <Parking> list ();
	
	Parking findOne(Integer id);

}

