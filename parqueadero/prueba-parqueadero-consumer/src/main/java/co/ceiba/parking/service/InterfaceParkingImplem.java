package co.ceiba.parking.service;

import java.util.List;

import org.springframework.stereotype.Service;
import co.ceiba.parking.model.Parking;


@Service
public class InterfaceParkingImplem implements InterfaceParking {

	@Override
	public List<Parking> list() {
	
		return null;
	}

	@Override
	public Parking findOne(Integer id) {
		return null;
	}

	

}
