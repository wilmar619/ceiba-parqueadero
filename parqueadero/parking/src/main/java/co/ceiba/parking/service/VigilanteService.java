package co.ceiba.parking.service;

import java.util.List;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.VehiculosActivos;
import co.ceiba.parking.model.MotoModel;
import co.ceiba.parking.model.VehiculoModel;

public interface VigilanteService {

	public boolean verificarPlacaConElDia(VehiculoModel vehiculoModel, int diaIngreso);
	void addVehiculo(CarroModel carroModel, int idParking);
	void addVehiculo(MotoModel motoModel, int idParking);
	void outVehiculo(String placa);

	List<VehiculosActivos> listaVehiculosActivos ();
	
	
}
