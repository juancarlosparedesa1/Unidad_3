package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repo.IEstudianteRepo;
<<<<<<< HEAD
=======

>>>>>>> dbce384 (TAREA 12: Query con Jakarta Persistence)
@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
<<<<<<< HEAD

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
=======
	
	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombre(nombre);
>>>>>>> dbce384 (TAREA 12: Query con Jakarta Persistence)
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return null;
	}
	
=======
		return this.estudianteRepo.buscarPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGenero(genero);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedula(cedula);
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudad(ciudad);
	}

>>>>>>> dbce384 (TAREA 12: Query con Jakarta Persistence)

}
