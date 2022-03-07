package org.zabalburu.msproveedor.controlador;

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
import org.zabalburu.msproveedor.modelo.Proveedor;
import org.zabalburu.msproveedor.servicio.ProveedorServicio;

@RestController
public class ProveedorControlador {
	@Autowired
	private ProveedorServicio servicio;
		
	@GetMapping("/proveedores")
	public List<Proveedor> getProveedores(){
		return servicio.getProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public ResponseEntity<Proveedor> getBanco(@PathVariable Integer id){
		Proveedor c = servicio.getProveedor(id);
		if (c==null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(c);
		}
	}
	
	@PostMapping("/proveedores")
	public ResponseEntity<Proveedor> nuevoBanco(@RequestBody Proveedor c) throws URISyntaxException{
		
			c = servicio.nuevoProveedor(c);
			return ResponseEntity.ok(c);
		
	}
	@DeleteMapping("/proveedores/{id}")
	public ResponseEntity<?> eliminarProveedor(@PathVariable Integer id){
		servicio.borrarProveedor(id);
		return ResponseEntity.ok().build();
	}
	
}
