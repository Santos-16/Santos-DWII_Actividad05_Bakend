package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Setter
@Getter
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nombres;
	private String apaterno;
	private String amaterno;
	private String fechaNacimiento;
	private String fechaRegistro;
	private String email;
	private String estado;
	private String celular;
	private String direccion;
	private String login;
	private String password;
	private String dni;
	private int idTipoUsuario;
	private int idUbigeo;
}
