package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional // voy a usar el entityManager
@Repository
public class EstudianteRepoimpl implements IEstudianteRepo {

	// punto de conexion con la base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub

		/*
		 * Vamos hacer un SELECT
		 * 
		 * En SQL seria de la siguiente manera: devuelveme de todas las columnas de la
		 * tabla estudiante donde la fila estu_nombre ="JuanCarlos" select * from
		 * estudiante where estu_nombre = "juanCarlos"
		 * 
		 * En Query seria de la siguiente manera: devuelveme el objeto estudiante de la
		 * clase Estudiante donde el atributo e.nombre=:datoNombre select e from
		 * Estudiante e where e.nombre =:datoNombre
		 *
		 */
		// vamos a crear el Query

		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.nombre =:datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		// retorna un dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.apellido =:datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		// retorna un dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.genero =:datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		// retorna un dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.cedula =:datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		// retorna un dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery(" select e from Estudiante e where e.ciudad =:datoCiudad");
		jpqlQuery.setParameter("datoCiudad",ciudad);
		// retorna un dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}
}
