package co.ceiba.parking.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import co.ceiba.parking.config.KeyConstans;
import co.ceiba.parking.model.Vehiculo;


@Service
public class InterfaceVehiculoImplem implements InterfaceVehiculo {

	@Override
	public List<Vehiculo> list() {
		RestTemplate restTemp = new RestTemplate();
		String url = String.format("http://%s/rest/vehiculo/all", KeyConstans.URL);
		Vehiculo[] c = restTemp.getForObject(url, Vehiculo[].class);
		List<Vehiculo> l = new ArrayList<>();
		
		for (Vehiculo h : c) {
			l.add(h);
			System.out.println(h);
		}

		return l;
	}

	@Override
	public Vehiculo findOne(Integer id) {
		RestTemplate restTemp = new RestTemplate();
		String url = String.format("http://%s/rest/vehiculo/id=" + id, KeyConstans.URL);
		Vehiculo c = restTemp.getForObject(url, Vehiculo.class);

		return c;
	}
	
	@Override
	public Vehiculo create(Vehiculo vehiculos) {
		RestTemplate restTemp = new RestTemplate();
		restTemp.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		String url = "http://192.168.2.7:9000/rest/vehiculo/guardar";
		ResponseEntity<Vehiculo> vehicu = restTemp.postForEntity(url, vehiculos, Vehiculo.class);
		return vehicu.getBody();
	}

}
