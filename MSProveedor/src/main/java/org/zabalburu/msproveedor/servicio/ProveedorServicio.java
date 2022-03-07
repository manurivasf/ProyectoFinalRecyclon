package org.zabalburu.msproveedor.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zabalburu.msproveedor.dao.ProveedorDAO;
import org.zabalburu.msproveedor.modelo.Proveedor;

@Service
public class ProveedorServicio {

	@Autowired
	ProveedorDAO dao;
	
	public List<Proveedor> getProveedores(){
		List<Proveedor> p= dao.findAll();
		return p;
	}
	
	public Proveedor getProveedor(Integer id) {
		return dao.findById(id).orElse(null);
	}
	
	
	public Proveedor nuevoProveedor(Proveedor b) {
		return dao.save(b);
	}
	
	public void borrarProveedor(Integer id) {
		dao.deleteById(id);
	}
	
}

