package com.example.parking.service;

import java.util.List;

import com.example.parking.dominio.Parking;

public interface InterfaceParking {

	List <Parking> list ();
	
	Parking findOne(Integer id);

}

