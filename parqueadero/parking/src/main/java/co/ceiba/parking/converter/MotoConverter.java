package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.MotoModel;

@Component("motoConverter")
public class MotoConverter {

	public MotoModel entity2model(VehiculoEntity vehiculoEntity) {
		return new MotoModel(vehiculoEntity.getPlaca(),vehiculoEntity.getCilindraje(),vehiculoEntity.isEstado());

	}

	public VehiculoEntity model2entity(MotoModel motoModel) {
	return new VehiculoEntity(motoModel.getPlaca(),true,motoModel.getCilindraje());

	}
}
