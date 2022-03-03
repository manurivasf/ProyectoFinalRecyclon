package org.zabalburu.msbanco;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zabalburu.msbanco.modelo.Banco;
import org.zabalburu.msbanco.servicio.BancoServicio;

@RestController
public class BancoControlador {

	@Autowired
	private BancoServicio servicio;
	
	@GetMapping("/bancos")
	public List<Banco> getBancos(){
		return servicio.getBancos();
	}
	
	@GetMapping("/bancos/{id}")
	public ResponseEntity<Banco> getBanco(@PathVariable Integer id){
		Banco b = servicio.getBanco(id);
		if (b==null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(b);
		}
	}
	
	@PostMapping("/bancos")
	public ResponseEntity<Banco> nuevoBanco(@RequestBody Banco b) throws URISyntaxException{
		if(b.getNombreBanco().isEmpty()) {
			
			return ResponseEntity.unprocessableEntity().build();
			
		}else {
			b = servicio.nuevoBanco(b);
			return ResponseEntity.ok(b);
		}
		
	}
	@DeleteMapping("/bancos/{id}")
	public ResponseEntity<?> eliminarBanco(@PathVariable Integer id){
		servicio.borrarBanco(id);
		return ResponseEntity.ok().build();
	}
	
}
