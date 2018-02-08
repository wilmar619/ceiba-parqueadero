package co.ceiba.parking.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.ceiba.parking.entities.ParkingEntity;

@Repository("parkingRepository")
public interface ParkingRepository extends JpaRepository<ParkingEntity, Serializable> {

	 ParkingEntity findByIdParking(int idParking);

}
