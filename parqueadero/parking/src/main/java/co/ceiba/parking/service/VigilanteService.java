package co.ceiba.parking.service;

import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.MotoModel;

public interface VigilanteService {

	boolean verificarPlaca(CarroModel carroModel, int dia);

	boolean verificarDisponibilidad();

	void addCarro(CarroModel carroModel);

	void addMoto(MotoModel motoModel);
	
	void comenzarFactura(CarroModel carroModel);

}
