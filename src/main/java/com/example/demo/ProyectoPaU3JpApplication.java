package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectoPaU3JpApplication implements CommandLineRunner {

//	@Autowired
//	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Estudiante estudiante = new Estudiante();
//		estudiante.setNombre("juan");
//		estudiante.setApellido("paredes");
//		this.estudianteService.insetar(estudiante);
//		// this.estudianteService.insera
//		this.estudianteService.insetar(estudiante);
////		this.estudianteService.bucarPorNombreQuery("juan");
////		this.estudianteService.bucarPorNombreQueryTyped("juan");
////		this.estudianteService.bucarPorNombreNamedQuery("juan");
////		this.estudianteService.bucarPorNombreNamedQueryTyped("juan");
//		this.estudianteService.buscarPorNombreTypeQueryDTO("juan");
//		// this.estudianteService.bucarPorNombreNamedQueryTyped("juan");
//		this.estudianteService.buscarPorNombreQueryTypedCriteria("juan");
//		this.estudianteService.buscarPorNombreQueryTypedCriteriaAndOr("pepito", "perez", "M");
//		// el numero es el número de datos que se afexta 0 1 o n
//		//indica el numero de estudiantes que se actualizaron o eliminaron
//		this.estudianteService.eliminarPorApellido("paredes");
//		this.estudianteService.actualizarPorApellido("paredes", "Solis");
		
	}

}
