package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.MotoEntity;
import co.ceiba.parking.model.VehiculoModel;
@Component("motoConverter")
public class MotoConverter {
	public MotoEntity model2entity(VehiculoModel vehiculoModel) {
		MotoEntity motoEntity = new MotoEntity();
		motoEntity.setIdMoto(vehiculoModel.getIdVehiculo());
		motoEntity.setPlaca(vehiculoModel.getPlaca());
		motoEntity.setCilindraje(vehiculoModel.getCilindraje());
		return motoEntity;
	}

	public VehiculoModel entity2model(MotoEntity motoEntity) {
		VehiculoModel vehiculoModel = new VehiculoModel();
		vehiculoModel.setIdVehiculo(motoEntity.getIdMoto());
		vehiculoModel.setPlaca(motoEntity.getPlaca());
		vehiculoModel.setCilindraje(motoEntity.getCilindraje());
		return vehiculoModel;
	}
}
