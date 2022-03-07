package org.zabalburu.msproveedor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zabalburu.msproveedor.modelo.Proveedor;		

public interface ProveedorDAO extends JpaRepository<Proveedor, Integer> {

}
