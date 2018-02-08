package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.CarroEntity;
import co.ceiba.parking.model.CarroModel;

@Component("carroConverter")
public class CarroConverter {

	public CarroEntity model2entity(CarroModel carroModel) {
		CarroEntity carroEntity = new CarroEntity();
		carroEntity.setIdCarro(carroModel.getIdCarro());
		carroEntity.setPlaca(carroModel.getPlaca());
		return carroEntity;
	}
	
	public CarroModel entity2model(CarroEntity carroEntity) {
		CarroModel carroModel = new CarroModel();
		carroModel.setIdCarro(carroEntity.getIdCarro());
		carroModel.setPlaca(carroEntity.getPlaca());
		return carroModel;
	}
}
