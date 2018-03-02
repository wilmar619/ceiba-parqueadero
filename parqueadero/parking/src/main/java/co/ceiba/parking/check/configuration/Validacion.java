package co.ceiba.parking.check.configuration;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.ceiba.parking.check.entry.VerificacionDiaYPlacaHabil;
import co.ceiba.parking.check.entry.VerificacionDisponibilidadCeldas;
import co.ceiba.parking.check.entry.VerificacionEntrada;
import co.ceiba.parking.check.entry.VerificacionSiEstaActivoYExisteLaPlaca;
import co.ceiba.parking.check.out.VerificacionSalida;
import co.ceiba.parking.check.out.VerificacionSiEstaActivoYExisteLaPlacaSalida;
import co.ceiba.parking.repository.FacturaRepository;
import co.ceiba.parking.repository.ParkingRepository;

@Configuration
public class Validacion {
	
	@Bean
	public List<VerificacionEntrada> listaDeVerificacionDeIngreso (ParkingRepository parkingRepo,FacturaRepository facturaRepo){
		List<VerificacionEntrada> validaciones = new ArrayList<>();
		validaciones.add(new VerificacionDiaYPlacaHabil());
		validaciones.add(new VerificacionDisponibilidadCeldas(parkingRepo));
		validaciones.add(new VerificacionSiEstaActivoYExisteLaPlaca(facturaRepo));
		
		return validaciones;
	}
	
	@Bean
	public List<VerificacionSalida> listaDeVerificacionDeSalida (FacturaRepository facturaRepo){
		List<VerificacionSalida> validaciones = new ArrayList<>();
		validaciones.add(new VerificacionSiEstaActivoYExisteLaPlacaSalida(facturaRepo));
		return validaciones;
	}

}
