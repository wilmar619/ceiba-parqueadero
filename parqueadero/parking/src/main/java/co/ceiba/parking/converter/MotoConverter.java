package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.MotoModel;

@Component("motoConverter")
public class MotoConverter {

	public MotoModel model2entity(VehiculoEntity vehiculoEntity) {
		MotoModel motoModel = new MotoModel();
		motoModel.setPlaca(vehiculoEntity.getPlaca());
		motoModel.setCilindraje(vehiculoEntity.getCilindraje());
		motoModel.setEstado(vehiculoEntity.isEstado());
		return motoModel;
	}

	public VehiculoEntity model2entity(MotoModel motoModel) {
		VehiculoEntity vehiculo = new VehiculoEntity();
		vehiculo.setPlaca(motoModel.getPlaca());
		vehiculo.setCilindraje(motoModel.getCilindraje());
		vehiculo.setEstado(motoModel.isEstado());
		return vehiculo;
	}
}
