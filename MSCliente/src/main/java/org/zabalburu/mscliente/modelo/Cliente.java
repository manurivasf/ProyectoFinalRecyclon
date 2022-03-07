package org.zabalburu.mscliente.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String ncuenta;
	 private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNcuenta() {
		return ncuenta;
	}
	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", ncuenta=" + ncuenta + ", nombre=" + nombre + "]";
	}
	public Cliente(int id, String ncuenta, String nombre) {
		super();
		this.id = id;
		this.ncuenta = ncuenta;
		this.nombre = nombre;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	
}
