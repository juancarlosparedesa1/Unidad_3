package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

	public void insertar(Estudiante estudiante);
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante bucarPorNombreQueryTyped(String nombre);
	public Estudiante bucarPorNombreNamedQuery(String nombre);
	public Estudiante bucarPorNombreNamedQueryTyped(String nombre);
	public Estudiante bucarPorNombreNativeQuery(String nombre);
	public Estudiante bucarPorNombreNativeQueryTypedNamed(String nombre);



}
