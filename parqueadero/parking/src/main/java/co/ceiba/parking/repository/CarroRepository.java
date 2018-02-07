package co.ceiba.parking.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.ceiba.parking.entities.CarroEntity;
import co.ceiba.parking.model.CarroModel;

@Repository("carroRepository")
public interface CarroRepository extends JpaRepository<CarroEntity, Serializable>{

	CarroModel save(CarroModel vehiculo);
	
//	List <CarroEntity> list ();
	
//	CarroEntity findOne(Integer id);

}
