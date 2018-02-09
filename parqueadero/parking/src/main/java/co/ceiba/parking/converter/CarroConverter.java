package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.CarroModel;

@Component("carroConverter")
public class CarroConverter {

	public CarroModel model2entity(VehiculoEntity vehiculoEntity) {
		CarroModel carroModel = new CarroModel();
		carroModel.setPlaca(vehiculoEntity.getPlaca());
		carroModel.setEstado(vehiculoEntity.isEstado());
		return carroModel;
	}

	public VehiculoEntity entity2model(CarroModel carroModel) {
		VehiculoEntity vehiculo = new VehiculoEntity();
		vehiculo.setPlaca(carroModel.getPlaca());
		vehiculo.setEstado(carroModel.isEstado());

		return vehiculo;
	}

}
