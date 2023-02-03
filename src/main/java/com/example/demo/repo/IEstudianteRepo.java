package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
<<<<<<< HEAD

	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
=======
	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);


>>>>>>> dbce384 (TAREA 12: Query con Jakarta Persistence)

}
