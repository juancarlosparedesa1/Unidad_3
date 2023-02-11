//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.modelo.Estudiante;
//import com.example.demo.modelo.dto.EstudianteDTO;
//import com.example.demo.repo.IEstudianteRepo;
//@Service
//public class EstudianteServiceImpl implements IEstudianteRepo {
//
//	@Autowired
//	private IEstudianteRepo estudianteRepo;
//	@Override
//	public void insertar(Estudiante estudiante) {
//		// TODO Auto-generated method stub
//		this.estudianteRepo.insertar(estudiante);
//		
//	}
//
////	@Override
////	public Estudiante buscarPorNombreQuery(String nombre) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public Estudiante buscarPorApellidoQuery(String apellido) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public Estudiante bucarPorNombreQueryTyped(String nombre) {
////		// TODO Auto-generated method stub
////		return this.buscarPorNombreQuery(nombre);
////	}
////
////	@Override
////	public Estudiante bucarPorNombreNamedQuery(String nombre) {
////		// TODO Auto-generated method stub
////		return this.bucarPorNombreNamedQuery(nombre);
////	}
////
////	@Override
////	public Estudiante bucarPorNombreNamedQueryTyped(String nombre) {
////		// TODO Auto-generated method stub
////		return this.bucarPorNombreNamedQueryTyped(nombre);
////	}
////
////	@Override
////	public Estudiante bucarPorNombreNativeQuery(String nombre) {
////		// TODO Auto-generated method stub
////		return this.bucarPorNombreNativeQuery(nombre);
////	}
////
////	@Override
////	public Estudiante bucarPorNombreNativeQueryTypedNamed(String nombre) {
////		// TODO Auto-generated method stub
////		return this.bucarPorNombreNativeQueryTypedNamed(nombre);
////	}
//
//	@Override
//	public Estudiante buscarPorNombre(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombre(nombre);
//	}
//
//	@Override
//	public Estudiante buscarPorNombreTypeQuery(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreTypeQuery(nombre);
//	}
//
//
//	@Override
//	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
//		// TODO Auto-generated method stub
//		return this.buscarPorApellidoNamedQuery(apellido);
//	}
//
//	@Override
//	public Estudiante buscarPorNombreNativeQuery(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreNativeQuery(nombre);
//	}
//
//	@Override
//	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreNativeQueryTypedNamed(nombre);
//	}
//
//	@Override
//	public Estudiante buscarPorApellido(String apellido) {
//		// TODO Auto-generated method stub
//		return this.buscarPorApellido(apellido);
//	}
//
//	@Override
//	public Estudiante buscarPorGenero(String genero) {
//		// TODO Auto-generated method stub
//		return this.buscarPorGenero(genero);
//	}
//
//	@Override
//	public Estudiante buscarPorCedula(String cedula) {
//		// TODO Auto-generated method stub
//		return this.buscarPorCedula(cedula);
//	}
//
//	@Override
//	public Estudiante buscarPorCiudad(String ciudad) {
//		// TODO Auto-generated method stub
//		return this.buscarPorCiudad(ciudad);
//	}
//
//	@Override
//	public Estudiante buscarPorNombreFirst(String genero) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreFirst(genero);
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreQueryList(String genero) {
//		// TODO Auto-generated method stub
//		return this. buscarPorNombreQueryList(genero);
//	}
//
//	@Override
//	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido) {
//		// TODO Auto-generated method stub
//		return this.buscarPorApellidoNamedQueryTypedList(apellido);
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreNativeQueryTypedNamedList(nombre);
//	}
//
//	@Override
//	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreTypeQueryDTO(nombre);
//	}
//
//	@Override
//	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreQueryTypedCriteria(nombre);
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreQueryTypedCriteriaAndOr(String nombre, String apellido, String bandera) {
//		// TODO Auto-generated method stub
//		return this.buscarPorNombreQueryTypedCriteriaAndOr(nombre, apellido, bandera);
//	}
//
//	@Override
//	public int eliminarPorApellido(String apellido) {
//		// TODO Auto-generated method stub
//		return this.eliminarPorApellido(apellido);
//	}
//
//	@Override
//	public int actualizarPorApellido(String apellido, String nombre) {
//		// TODO Auto-generated method stub
//		return this.actualizarPorApellido(apellido, nombre);
//	}
//	
//	
//
//	
//	
//}
