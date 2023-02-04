package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repo.IEstudianteRepo;
@Service
public class EstudianteServiceImpl implements IEstudianteRepo {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
		
	}

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante bucarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante bucarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.bucarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante bucarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.bucarPorNombreNamedQueryTyped(nombre);
	}

	@Override
	public Estudiante bucarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.bucarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante bucarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.bucarPorNombreNativeQueryTypedNamed(nombre);
	}

	
	
}
