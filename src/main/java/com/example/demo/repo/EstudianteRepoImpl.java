package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext

	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_nombre = "Juan" (pg admin)
		// primer tipo Query
		// select e from Estudiante e where e.nombre = : datoNombre //datovariable
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = : datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		return (Estudiante) jpqlQuery.getSingleResult();// retorna tipo de objetos genericos
		// hago un cast al estudiante
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante bucarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.nombre = : datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();

	}

	@Override
	public Estudiante bucarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		//reutilización
		Query myQuery=this.entityManager.createNamedQuery("Estudiante.BuscarPorNomb");
		myQuery.setParameter("datoNombre", myQuery);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante bucarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		//se puede hacer combinación entre
		TypedQuery<Estudiante>myQuery=this.entityManager.createNamedQuery("Estudiante.bucarPorNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);		
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante bucarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNativeQuery( "select * from estudiante where estu_nombre =:datoNombre",Estudiante.class );
		myQuery.setParameter("datoNombre", myQuery);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante bucarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante>myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

}
