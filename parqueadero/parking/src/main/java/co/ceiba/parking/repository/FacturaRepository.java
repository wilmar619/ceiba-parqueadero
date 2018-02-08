package co.ceiba.parking.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.ceiba.parking.entities.FacturaEntity;

@Repository("facturaRepository")
public interface FacturaRepository extends JpaRepository<FacturaEntity, Serializable>{

}