package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "disponibilidad")
@Setter
@Getter
public class Disponibilidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idDisponibilidad;
		private String horaInicio;
		private String horaFin;
		private String dia;
		private int idCiclo;
		private int idUsuario;
}
