package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.VehiculoEntity;
import co.ceiba.parking.model.CarroModel;

@Component("carroConverter")
public class CarroConverter {

	public CarroModel entity2model(VehiculoEntity vehiculoEntity) {
		return new CarroModel(vehiculoEntity.getPlaca(),vehiculoEntity.isEstado());
	
	}

	public VehiculoEntity model2entity(CarroModel carroModel) {
		return  new VehiculoEntity(carroModel.getPlaca(),true);
	
	}

}
