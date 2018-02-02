package co.ceiba.parking.modeloweb;

import co.ceiba.parking.model.Vehiculo;
import co.ceiba.parking.service.InterfaceVehiculo;
import co.ceiba.parking.service.InterfaceVehiculoImplem;

public class PruebaIngresarDatos {

	InterfaceVehiculo vehi = new InterfaceVehiculoImplem();
	
	public PruebaIngresarDatos() {
		initComponents();
	}
	
	 private void initComponents() {
	Vehiculo ingreso = new Vehiculo(
			800,
			"carro", 
			"abc123");
	vehi.create(ingreso);
	System.out.println(ingreso.toString());

	}		
	 public static void main(String[] args) {
			new PruebaIngresarDatos();
		}
}
