package org.zabalburu.mscliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zabalburu.mscliente.dao.ClienteDAO;
import org.zabalburu.mscliente.modelo.Cliente;

@Service
public class ClienteServicio {
	@Autowired
	ClienteDAO dao;
	
	public List<Cliente> getClientes(){
		List<Cliente> p= dao.findAll();
		return p;
	}
	
	public Cliente getCliente(Integer id) {
		return dao.findById(id).orElse(null);
	}
	
	
	public Cliente nuevoCliente(Cliente b) {
		return dao.save(b);
	}
	
	public void borrarCliente(Integer id) {
		dao.deleteById(id);
	}
	
}
