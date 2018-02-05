package co.ceiba.parking.modeloweb;

import co.ceiba.parking.model.Vehiculo;
import co.ceiba.parking.service.InterfaceVehiculo;
import co.ceiba.parking.service.InterfaceVehiculoImplem;

public class PruebaIngresarDatos {

	InterfaceVehiculo vehi = new InterfaceVehiculoImplem();

	public PruebaIngresarDatos() {
		initComponents();
	}

	public void initComponents() {

		Vehiculo ingreso = new Vehiculo(500, "moto", "ale456");
		vehi.create(ingreso);

		System.out.println("ingresado los datos exitosamente  " + ingreso.toString());

	}

	public static void main(String[] args) {
		new PruebaIngresarDatos();

	}
}