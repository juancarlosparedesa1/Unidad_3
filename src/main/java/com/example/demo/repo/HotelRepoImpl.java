package com.example.demo.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		//SELECT * from hotel h join habitacion ha on h.hot_id=ha.habi_id_hotel
		//JON DE HABITACIONES SE HACE LA REFERENCIA A LA RELACIÓN QUE TIENE MI TABLA PRINCIPAL lis<Hotel< habitaciones
		//@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL) //ya esta mapeado 
		//private List<Habitacion> habitaciones;
		//h.habitaciones alias (ha)
		//		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha ON pk=Fk",Hotel.class);
		//ON pk=Fk ya esta implicito no es necesario
//		@ManyToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name = "habi_id_hotel")
//		private Hotel hotel;
		//para jpa puede ser Inner Join o solo Join es el mismo
		//TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//bajo demanda solucion al lazy
		List<Hotel> listaHoteles=myQuery.getResultList();
		for(Hotel h:listaHoteles) {
			List<Habitacion> listaTmp=new ArrayList<>();
			for (Habitacion ha:h.getTipoHabitacion()) {
				if(ha.getTipo().equals(tipoHabitacion)) {
					listaTmp.add(ha);
				}
				h.setHabitaciones((listaTmp);
			}
			
			h.getHabitaciones().size();
			
			
			
		};
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		//SELECT * from hotel h join habitacion ha on h.hot_id=ha.habi_id_hotel
		//JON DE HABITACIONES SE HACE LA REFERENCIA A LA RELACIÓN QUE TIENE MI TABLA PRINCIPAL lis<Hotel< habitaciones
		//@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL) //ya esta mapeado 
		//private List<Habitacion> habitaciones;
		//h.habitaciones alias (ha)
		//		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha ON pk=Fk",Hotel.class);
		//ON pk=Fk ya esta implicito no es necesario
//		@ManyToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name = "habi_id_hotel")
//		private Hotel hotel;
		//para jpa puede ser Inner Join o solo Join es el mismo
		//TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//bajo demanda solucion al lazy
		List<Hotel> listaHoteles=myQuery.getResultList();
//		for(Hotel h:listaHoteles) {
//			h.getHabitaciones().size();
//		};
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		//SELECT * from hotel h join habitacion ha on h.hot_id=ha.habi_id_hotel
		//JON DE HABITACIONES SE HACE LA REFERENCIA A LA RELACIÓN QUE TIENE MI TABLA PRINCIPAL lis<Hotel< habitaciones
		//@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL) //ya esta mapeado 
		//private List<Habitacion> habitaciones;
		//h.habitaciones alias (ha)
		//		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha ON pk=Fk",Hotel.class);
		//ON pk=Fk ya esta implicito no es necesario
//		@ManyToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name = "habi_id_hotel")
//		private Hotel hotel;
		//para jpa puede ser Inner Join o solo Join es el mismo
		//TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo ",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//bajo demanda solucion al lazy
		List<Hotel> listaHoteles=myQuery.getResultList();
//		for(Hotel h:listaHoteles) {
//			h.getHabitaciones().size();
//		};
		return myQuery.getResultList();
	}

}
