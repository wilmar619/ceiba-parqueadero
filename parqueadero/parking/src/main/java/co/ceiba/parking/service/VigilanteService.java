package co.ceiba.parking.service;

import java.util.List;
import co.ceiba.parking.model.CarroModel;
import co.ceiba.parking.model.FacturaModel;
import co.ceiba.parking.model.VehiculosActivos;
import co.ceiba.parking.model.MotoModel;


public interface VigilanteService {
	
	void addVehiculo(CarroModel carroModel, int idParking);
	void addVehiculo(MotoModel motoModel, int idParking);
	FacturaModel outVehiculo(String placa);
	List<VehiculosActivos> listaVehiculosActivos ();
	
	
}
