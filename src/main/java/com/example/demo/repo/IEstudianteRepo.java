package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);


}
