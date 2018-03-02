package co.ceiba.parking.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.ceiba.parking.entities.FacturaEntity;
import co.ceiba.parking.model.FacturaModel;

@Repository("facturaRepository")
public interface FacturaRepository extends JpaRepository<FacturaEntity, Serializable> {

	public abstract FacturaEntity findByPlaca(String placa);

	public FacturaEntity findByPlacaAndEstado(String placa, boolean estado);

	public List<FacturaEntity> findByEstado(boolean estado);

	public default FacturaModel entity2model(FacturaEntity facturaEntity) {
		return new FacturaModel(facturaEntity.getPlaca(), facturaEntity.getHoraIngreso(), facturaEntity.getHoraSalida(),
				facturaEntity.getTiempoDeParqueo(), facturaEntity.getPagoTotal());

	}

}
