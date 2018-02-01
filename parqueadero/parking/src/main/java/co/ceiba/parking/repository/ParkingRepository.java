package co.ceiba.parking.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.ceiba.parking.model.Parking;

@Repository
public interface ParkingRepository  extends CrudRepository <Parking, Integer>  {

	

}
