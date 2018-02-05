package co.ceiba.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.ceiba.parking.entities.ParkingEntity;

public interface ParkingRepository  extends JpaRepository<ParkingEntity, Integer>{

}
