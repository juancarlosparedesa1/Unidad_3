package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3JpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("juan");
		estudiante.setApellido("paredes");
		//this.estudianteService.insera
		this.estudianteService.insetar(estudiante);
//		this.estudianteService.bucarPorNombreQuery("juan");
//		this.estudianteService.bucarPorNombreQueryTyped("juan");
//		this.estudianteService.bucarPorNombreNamedQuery("juan");
//		this.estudianteService.bucarPorNombreNamedQueryTyped("juan");
		this.estudianteService.buscarPorNombreTypeQueryDTO("juan");
		//this.estudianteService.bucarPorNombreNamedQueryTyped("juan");
		this.estudianteService.buscarPorNombreQueryTypedCriteria("juan");
		this.estudianteService.buscarPorNombreQueryTypedCriteriaAndOr("pepito", "perez", "M");
	}

}
