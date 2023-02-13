package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tarea14Application implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Tarea14Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Eliminar: ");
		System.out.println(this.estudianteService.eliminarPorNombre("Juan"));
		System.out.println(this.estudianteService.eliminarPorCedula("123456789"));
//
		System.out.println("Actualizar actualizar: ");
		System.out.println(this.estudianteService.actualizarApellidoPorCiudad("Cuenca", "Mesa"));
		System.out.println(this.estudianteService.actualizarNombreporGenero("F", "Julia"));
		
		
	}

}
