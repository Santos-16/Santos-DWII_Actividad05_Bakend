package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImp implements DisponibilidadService{
	
	
	@Autowired
	private DisponibilidadRepository repository;

	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Disponibilidad insertarDisponible(Disponibilidad obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

}
