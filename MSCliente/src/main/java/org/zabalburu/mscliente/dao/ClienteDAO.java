package org.zabalburu.mscliente.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zabalburu.mscliente.modelo.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
