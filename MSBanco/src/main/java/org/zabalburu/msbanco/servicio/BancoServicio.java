package org.zabalburu.msbanco.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zabalburu.msbanco.dao.BancoDAO;
import org.zabalburu.msbanco.modelo.Banco;

@Service
public class BancoServicio {
	@Autowired
	BancoDAO dao;
	
	public List<Banco> getBancos(){
		List<Banco> p= dao.findAll();
		return p;
	}
	
	public Banco getBanco(Integer id) {
		return dao.findById(id).orElse(null);
	}
	
	
	public Banco nuevoBanco(Banco b) {
		return dao.save(b);
	}
	
	public void borrarBanco(Integer id) {
		dao.deleteById(id);
	}
	
}
