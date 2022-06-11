package com.tp2_neoris.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@Entity
@JsonSerialize
public class ClienteEntity implements Serializable{
	
	private static final long serialVersionUID = 5551500470600610698L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CLIENTE_ID")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="DNI")
	private int dni;
	
	@Column(name="HABILITADO")
	private boolean habilitado;



	public ClienteEntity(Long id, String nombre, String apellido, int dni, boolean habilitado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.habilitado = habilitado;
	}

	public ClienteEntity() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
	
}
