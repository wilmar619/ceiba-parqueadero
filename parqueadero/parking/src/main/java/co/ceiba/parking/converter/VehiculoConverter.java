package co.ceiba.parking.converter;

import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.VehiculoModel;

public class VehiculoConverter {

	public VehiculoModel entity2model(VehiculoModel vehiculoModel) {
		VehiculoEntity vehiculoEntity = new VehiculoEntity();
		vehiculoEntity.setIdVehiculo(vehiculoModel);
		vehiculoEntity.setEstado(vehiculoModel);
		vehiculoEntity.setPlaca(vehiculoModel.getPlaca());

		return vehiculoEntity;

	}

}
