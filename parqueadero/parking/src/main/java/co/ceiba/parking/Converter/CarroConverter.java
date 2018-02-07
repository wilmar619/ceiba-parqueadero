package co.ceiba.parking.Converter;

import co.ceiba.parking.entities.CarroEntity;

public class CarroConverter {

	CarroEntity carro = new CarroEntity();
	
	public void model2entity() {
		carro.setIdCarro(0);
		carro.setPlaca(null);
		carro.setEstado(true);
		
	}
	
	public void entity2model() {
		carro.setIdCarro(0);
		carro.setPlaca(null);
		carro.setEstado(true);
		
	}

}
