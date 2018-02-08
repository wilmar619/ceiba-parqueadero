package co.ceiba.parking.converter;

import org.springframework.stereotype.Component;
import co.ceiba.parking.entities.MotoEntity;
import co.ceiba.parking.model.MotoModel;

@Component("motoConverter")
public class MotoConverter {
	public MotoEntity model2entity(MotoModel motoModel) {
		MotoEntity motoEntity = new MotoEntity();
		motoEntity.setIdMoto(motoModel.getIdMoto());
		motoEntity.setPlaca(motoModel.getPlaca());
		motoEntity.setCilindraje(motoModel.getCilindraje());
		return motoEntity;
	}
	
	public MotoModel entity2model(MotoEntity motoEntity) {
		MotoModel motoModel = new MotoModel();
		motoModel.setIdMoto(motoEntity.getIdMoto());
		motoModel.setPlaca(motoEntity.getPlaca());
		motoModel.setCilindraje(motoEntity.getCilindraje());
		return motoModel;
	}
}
