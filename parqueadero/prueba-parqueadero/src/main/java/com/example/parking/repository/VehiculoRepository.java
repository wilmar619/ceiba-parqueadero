package com.example.parking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.parking.dominio.Vehiculo;


@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {

}
