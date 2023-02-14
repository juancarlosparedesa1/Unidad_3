package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3JpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Hotel hotel1 = new Hotel();
		hotel1.setDireccion("Miraflores");
		hotel1.setNombre("Patito");
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Paredes");
		estudiante1.setNombre("Juan");
		estudiante1.setCedula("1726897299");
		estudiante1.setCiudad("Quito");
		estudiante1.setGenero("M");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Angulo");
		estudiante2.setNombre("Carlos");
		estudiante2.setCedula("1726897777");
		estudiante2.setCiudad("Carchi");
		estudiante2.setGenero("M");

//		this.estudianteService.insertar(estudiante1);
//		this.estudianteService.insertar(estudiante2);
		
//		select h1_0.hote_id,h1_0.hote_direccion,h1_0.hote_nombre_primer
//		from hotel h1_0 join habitacion h2_0
		List<Hotel> lista =this.hotelService.buscarHotelInnerJoin("VIP");
		List<Hotel> lista1 =this.hotelService.buscarHotelLeftJoin("VIP");
		List<Hotel> lista2 =this.hotelService.buscarHotelRightJoin("NOVIP");



		//eager para que me traiga los datos, si no especifico es Lazy
		
		//INNER
		for(Hotel h:lista) {
//			System.out.println(h.getNombre());
//			System.out.println(h.getHabitaciones());///problema
			//por=? codigo de erro es por lazy LazyInitializacionException
			//solucion
			//en hotel ,fethc=Eager despues del cascade
			//fetch=FetchType.LAZY POR DEFECTO
			//con lazy significa que es bajo demanda repository capa cuando es bajo demanda en el repo debo acceder a esa lista para que me traiga
			//para imprimir
			System.out.println(h.getNombre());
			for (Habitacion ha: h.getHabitaciones()) {
				System.out.println("las habiTaciones de:"+h.getNombre()+":"+h.getHabitaciones());
				
			}
			System.out.println();
			
			
		};
		
		//LEFT
		
		for(Hotel h:lista1) {
//			System.out.println(h.getNombre());
//			System.out.println(h.getHabitaciones());///problema
			//por=? codigo de erro es por lazy LazyInitializacionException
			//solucion
			//en hotel ,fethc=Eager despues del cascade
			//fetch=FetchType.LAZY POR DEFECTO
			//con lazy significa que es bajo demanda repository capa cuando es bajo demanda en el repo debo acceder a esa lista para que me traiga
			//para imprimir
			System.out.println(h.getNombre());
			for (Habitacion ha: h.getHabitaciones()) {
				System.out.println("las habiTaciones de:"+h.getNombre()+":"+h.getHabitaciones());
				
			}
			System.out.println();
			
			
		};
		
		//RIGHT
		for(Hotel h:lista2) {
//			System.out.println(h.getNombre());
//			System.out.println(h.getHabitaciones());///problema
			//por=? codigo de erro es por lazy LazyInitializacionException
			//solucion
			//en hotel ,fethc=Eager despues del cascade
			//fetch=FetchType.LAZY POR DEFECTO
			//con lazy significa que es bajo demanda repository capa cuando es bajo demanda en el repo debo acceder a esa lista para que me traiga
			//para imprimir
			System.out.println(h.getNombre());
			for (Habitacion ha: h.getHabitaciones()) {
				System.out.println("las habiTaciones de:"+h.getNombre()+":"+h.getHabitaciones());
				
			}
			System.out.println();
			
			
		};
		
				//un hotel sin ninguna habitacion
		        //una habitacion sin hotel pk de habitacion nulo
			
				//System.out.println("Actualizar nombre por apellido: ");
//				System.out.println(this.estudianteService.atualizarporApellido("Paredes", "Juan"));
//				System.out.println("Eliminar por apellido: ");
//				System.out.println(this.estudianteService.eliminarPorApellido("Angulo"));

	}

}
