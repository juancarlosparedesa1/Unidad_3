package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	public Estudiante buscarPorNombre(String nombre);
<<<<<<< HEAD
	public Estudiante buscarPorApellido(String apellido);
=======

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);
>>>>>>> dbce384 (TAREA 12: Query con Jakarta Persistence)


}
