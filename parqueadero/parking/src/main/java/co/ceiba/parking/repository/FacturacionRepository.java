package co.ceiba.parking.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.ceiba.parking.entities.FacturacionEntity;
@Repository("facturacionRepository")
public interface FacturacionRepository extends JpaRepository<FacturacionEntity, Serializable>{

}
