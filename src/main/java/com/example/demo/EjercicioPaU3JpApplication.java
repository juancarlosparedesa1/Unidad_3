package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class EjercicioPaU3JpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//creamos estudiante(BD vacia)
//		Estudiante estudiante1 = new Estudiante();
//		estudiante1.setNombre("Juan Carlos");
//		estudiante1.setApellido("Paredes");
//		estudiante1.setCedula("1234242423");
//		estudiante1.setGenero("M");
//		estudiante1.setCiudad("Quito");
		
		//Realizamos las busquedas
		System.out.println(this.estudianteService.buscarPorNombre("juan"));
		System.out.println(this.estudianteService.buscarPorApellido("paredes"));
		System.out.println(this.estudianteService.buscarPorGenero("m"));
		System.out.println(this.estudianteService.buscarPorCedula("121"));
		System.out.println(this.estudianteService.buscarPorCiudad("quito"));
	
	}

}
