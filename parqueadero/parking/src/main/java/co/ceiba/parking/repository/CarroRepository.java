package co.ceiba.parking.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.ceiba.parking.entities.CarroEntity;

@Repository("carroRepository")
public interface CarroRepository extends JpaRepository<CarroEntity, Serializable>{
	
//	List <CarroEntity> list ();
	
//	CarroEntity findOne(Integer id);

}