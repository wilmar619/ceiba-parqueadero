package com.example.parking.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.parking.dominio.Parking;


@Repository
public interface ParkingRepository  extends CrudRepository <Parking, Integer>  {

	

}
