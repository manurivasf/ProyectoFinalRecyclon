package org.zabalburu.msbanco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zabalburu.msbanco.modelo.Banco;

public interface BancoDAO extends JpaRepository<Banco, Integer> {

}
