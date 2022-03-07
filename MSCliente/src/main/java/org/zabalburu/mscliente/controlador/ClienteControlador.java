package org.zabalburu.mscliente.controlador;

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
import org.zabalburu.mscliente.modelo.Cliente;
import org.zabalburu.mscliente.servicio.ClienteServicio;

@RestController
public class ClienteControlador {
	@Autowired
	private ClienteServicio servicio;
		
	@GetMapping("/clientes")
	public List<Cliente> getClientes(){
		return servicio.getClientes();
	}
	
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable Integer id){
		Cliente c = servicio.getCliente(id);
		if (c==null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(c);
		}
	}
	
	@PostMapping("/clientes")
	public ResponseEntity<Cliente> nuevoCliente(@RequestBody Cliente c) throws URISyntaxException{
		
			c = servicio.nuevoCliente(c);
			return ResponseEntity.ok(c);
		
	}
	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<?> eliminarCliente(@PathVariable Integer id){
		servicio.borrarCliente(id);
		return ResponseEntity.ok().build();
	}
	
}
