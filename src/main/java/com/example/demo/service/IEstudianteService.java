package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	public void  insetar(Estudiante estudiante);
	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante bucarPorNombreQuery(String nombre);
	public Estudiante bucarPorNombreQueryTyped(String nombre);
	public Estudiante bucarPorNombreNamedQuery(String nombre);
	public Estudiante bucarPorNombreNamedQueryTyped(String nombre);


}
