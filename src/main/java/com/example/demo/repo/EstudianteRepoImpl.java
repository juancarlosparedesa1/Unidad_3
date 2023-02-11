//package com.example.demo.repo;
//
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.modelo.Estudiante;
//import com.example.demo.modelo.dto.EstudianteDTO;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.Query;
//import jakarta.persistence.TypedQuery;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Predicate;
//import jakarta.persistence.criteria.Root;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class EstudianteRepoImpl implements IEstudianteRepo {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public void insertar(Estudiante estudiante) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Estudiante buscarPorNombre(String nombre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorNombreTypeQuery(String nombre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorNombreNativeQuery(String nombre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorApellido(String apellido) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorGenero(String genero) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorCedula(String cedula) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorCiudad(String ciudad) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Estudiante buscarPorNombreFirst(String genero) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreQueryList(String genero) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre) {
//		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
//				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre, e.apellido) from Estudiante e where e.nombre = :datoNombre",
//				EstudianteDTO.class);
//		myTypedQuery.setParameter("datoNombre", nombre);
//		return myTypedQuery.getSingleResult();
//	}
//
//	@Override
//	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
//		// TODO Auto-generated method stub
//
//		// select * from estudiante where estu_nombre = 'Juan'
////		// select e from Estudiante e where e.nombre = : datoNombre
//		// Dinámico y se puede hacer solo con métodos
//
//		// la fabrica que perimite construir cuerys dinamicos
//		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
//		// especificamos el tipo de retorno de mi Query
//		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
//
//		// Aqui empezamos a crear el SQL
//		// 1.Defino la tabla destino
//		// a traves del from where are you from de form de dondes
//		// Definiendo el FROM-Root
//
//		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);// FROM Estudiante metodo de criteria
//		// Las condiciones WHERE Se conocen en criteriaapiquery como predicados
//		// e.nombre=:datoNombre
//		// entidad.nombre el from en miTabla
//		// de la tabla obtengame el nombre
//		Predicate condicion1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
//		myQuery.select(miTablaFrom).where(condicion1);
//		// declarado/armado mi Querylo realizamos con cualquier tipo ya conocido:
//		// TypedQuery
//
//		// la ejecucion
//		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);
//
//		return mySQL.getSingleResult();
//
////	@Override
////	public Estudiante buscarPorNombre(String nombre) {
////		// TODO Auto-generated method stub
////
////		// select * from estudiante where estu_nombre = 'Juan'
////		// select e from Estudiante e where e.nombre = : datoNombre
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
////		jpqlQuery.setParameter("datoNombre", nombre);
////		// retorna un tipo de dato generico y toca castear
////		return (Estudiante) jpqlQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorApellido(String apellido) {
////		// TODO Auto-generated method stub
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
////		jpqlQuery.setParameter("datoApellido", apellido);
////		return (Estudiante) jpqlQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorGenero(String genero) {
////		// TODO Auto-generated method stub
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
////		jpqlQuery.setParameter("datoGenero", genero);
////		return (Estudiante) jpqlQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorCedula(String cedula) {
////		// TODO Auto-generated method stub
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
////		jpqlQuery.setParameter("datoCedula", cedula);
////		return (Estudiante) jpqlQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorCiudad(String ciudad) {
////		// TODO Auto-generated method stub
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
////		jpqlQuery.setParameter("datoCiudad", ciudad);
////		return (Estudiante) jpqlQuery.getSingleResult();
////	}
////
////	@Override
////	public void insertar(Estudiante estudiante) {
////		// TODO Auto-generated method stub
////		this.entityManager.persist(estudiante);
////	}
////
////	@Override
////	public Estudiante buscarPorNombreTypeQuery(String nombre) {
////		// TODO Auto-generated method stub
////		TypedQuery<Estudiante> myTypedQuery = this.entityManager
////				.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
////		myTypedQuery.setParameter("datoNombre", nombre);
////		return myTypedQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
////		// TODO Auto-generated method stub
////		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe");
////		myQuery.setParameter("datoApellido", apellido);
////		return (Estudiante) myQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido) {
////		// TODO Auto-generated method stub
////		TypedQuery<Estudiante> typedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe",
////				Estudiante.class);
////		typedQuery.setParameter("datoApellido", apellido);
////		return typedQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorNombreNativeQuery(String nombre) {
////		// TODO Auto-generated method stub
////		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre",
////				Estudiante.class);
////		myQuery.setParameter("datoNombre", nombre);
////		return (Estudiante) myQuery.getSingleResult();
////	}
////
////	@Override
////	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
////		// TODO Auto-generated method stub
////		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
////				Estudiante.class);
////		myQuery.setParameter("datoNombre", nombre);
////		return myQuery.getSingleResult();
////	}
////
////	@Override
////	public List<Estudiante> buscarPorNombreQueryList(String genero) {
////		// TODO Auto-generated method stub
////		// select * from estudiante where estu_nombre = 'Willan'
////		// select e from Estudiante e where e.nombre = : datoNombre
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
////		jpqlQuery.setParameter("datoGenero", genero);
////		// retorna un tipo de dato generico y toca castear
////		return jpqlQuery.getResultList();
////
////	}
////
////	@Override
////	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido) {
////		// TODO Auto-generated method stub
////		TypedQuery<Estudiante> typedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe",
////				Estudiante.class);
////		typedQuery.setParameter("datoApellido", apellido);
////		return typedQuery.getResultList();
////	}
////
////	@Override
////	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
////		// TODO Auto-generated method stub
////		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
////				Estudiante.class);
////		myQuery.setParameter("datoNombre", nombre);
////		return myQuery.getResultList();
////	}
////
////	@Override
////	public Estudiante buscarPorNombreFirst(String genero) {
////		// TODO Auto-generated method stub
////		// select * from estudiante where estu_nombre = 'Willan'
////		// select e from Estudiante e where e.nombre = : datoNombre
////		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
////		jpqlQuery.setParameter("datoGenero", genero);
////		// retorna un tipo de dato generico y toca castear
////		return (Estudiante) jpqlQuery.getResultList().get(0);
////	}
////
////	@Override
////	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre) {
////		// TODO Auto-generated method stub
////		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
////				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre, e.apellido) from Estudiante e where e.nombre = :datoNombre",
////				EstudianteDTO.class);
////		myTypedQuery.setParameter("datoNombre", nombre);
////		return myTypedQuery.getSingleResult();
////	}
//
//	}
//
//	@Override
//	public List<Estudiante> buscarPorNombreQueryTypedCriteriaAndOr(String nombre, String apellido, String genero) {
//		// TODO Auto-generated method stub
//		// la fabrica que perimite construir cuerys dinamicos
//		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
//		// especificamos el tipo de retorno de mi Query
//		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
//
//		// Aqui empezamos a crear el SQL
//		// 1.Defino la tabla destino
//		// a traves del from where are you from de form de dondes
//		// Definiendo el FROM-Root
//
//		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);// FROM Estudiante metodo de criteria
//		// M:e.nombre=AND e.apellido=
//		// F:e.nombre=OR e.apellido=
//		// Creamos los predicados
//		// Predicaco del nombre
//		Predicate p1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
//		
//		// predicado del apellido
//		Predicate p2 = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
//
//		
//		//and y or pasa a ser otro predicado mas
//		
//		Predicate predicadoFinal =null;
//		if (genero.equals("M")) {
//			//predicado de AND
//			Predicate predicadoFinal1=myBuilder.and(p1,p2);//hecho un and entre el nombre y el apellido
//		}else {
//			//predicado de OR
//			Predicate predicadoFinal1=myBuilder.or(p1,p2);//hecho un and entre el nombre y el apellido
//		}
//		
//		// la ejecucion
//		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);
//
//		return mySQL.getResultList();
//		
//		
//		
//	}
//
//	@Override
//	public int eliminarPorApellido(String apellido) {
//		// TODO Auto-generated method stub
//		//DELETE FROM estudiante	WHERE	estu_apellido="Teran"
//		Query myQuery=this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.apellido =:datoEntrada");
//		myQuery.setParameter("apellido", apellido);
//		//solo execute update es una actualización de la base no hay executeeliminate
//				return myQuery.executeUpdate();
//	}
//
//	@Override
//	public int actualizarPorApellido(String apellido, String nombre) {
//		// TODO Auto-generated method stub
//		
//		//actualizando a todos los estudiabntes el nombre que tengan el apeellido paredes
//		//UPDATE estudiante set estu_nombre='Juan' WHERE estu_apellido='Paredes'
//		
//		Query myQuery=this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre =:datoNombre WHERE e.apellido=:datoApellido A>ND ");
//		//Query myQuery=this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre =:datoNombre WHERE e.apellido=:datoApellido AND "); actualizar por ciudad apellido
//		//Query myQuery=this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre =' A' WHERE e.apellido=:datoApellido AND "); mandar un dato  quemado
//		myQuery.setParameter("datoNombre", nombre);
//		myQuery.setParameter("datoApellido", apellido);
//		return myQuery.executeUpdate();
//	}
//	
//	
//	
//	
//}