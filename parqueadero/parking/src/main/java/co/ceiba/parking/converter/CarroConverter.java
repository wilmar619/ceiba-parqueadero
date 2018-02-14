package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.CarroModel;

@Component("carroConverter")
public class CarroConverter {

	public CarroModel entity2model(VehiculoEntity vehiculoEntity) {
		CarroModel carroModel = new CarroModel();
		carroModel.setPlaca(vehiculoEntity.getPlaca());
		carroModel.setEstado(vehiculoEntity.isEstado());
		return carroModel;
	}

	public VehiculoEntity model2entity(CarroModel carroModel) {
		VehiculoEntity vehiculoModel = new VehiculoEntity();
		vehiculoModel.setPlaca(carroModel.getPlaca());
		vehiculoModel.setEstado(carroModel.isEstado());

		return vehiculoModel;
	}

}
