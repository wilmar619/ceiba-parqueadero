package com.example.parking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.parking.dominio.Parking;
import com.example.parking.repository.ParkingRepository;

@Service
public class InterfaceParkingImplem implements InterfaceParking {

	@Autowired
	private ParkingRepository p;

	@Override
	public List<Parking> list() {
		return (List<Parking>) p.findAll();
	}

	@Override
	public Parking findOne(Integer id) {
		return p.findOne(id);
	}

}
