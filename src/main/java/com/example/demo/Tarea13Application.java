package com.example.demo;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;

@SpringBootApplication
public class Tarea13Application implements CommandLineRunner {

	@Autowired
	private IAutomovilService automovilService;
	public static void main(String[] args) {
		SpringApplication.run(Tarea13Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Automovil auto1 = new Automovil();
		Automovil auto2 = new Automovil();
		
		auto1.setPlaca("PSV-1255");
		auto1.setColor("azul");
		auto1.setMarca("Chevrolet");
		auto1.setTipo("L");
		auto1.setAño("2011");
		auto1.setModelo("sedan");
		auto1.setPrecio(new BigDecimal(20000));

		auto2.setPlaca("CBD-1551");
		auto2.setColor("Negro");
		auto2.setMarca("Lexus");
		auto2.setTipo("L");
		auto2.setAño("2000");
		auto2.setModelo("sedan");
		auto2.setPrecio(new BigDecimal(35000));
		 this.automovilService.insertar(auto2);
		 this.automovilService.insertar(auto1);
		 

		System.out.println("Typed Query:");
		System.out.println(this.automovilService.buscarPorPlacaTypedQuery("CBD-1551"));
		System.out.println(this.automovilService.buscarporMarcaTypedQuery("Lexus"));
		System.out.println(this.automovilService.buscarPorColorTypedQuery("Negro"));
		System.out.println("Named Query:");
		System.out.println(this.automovilService.buscarPorPlacaNamedQuery("CBD-1551"));
		System.out.println(this.automovilService.buscarporMarcaNamedQuery("Lexus"));
		System.out.println(this.automovilService.buscarPorColorNamedQuery("Negro"));
		System.out.println("Native Query:");
		System.out.println(this.automovilService.buscarPorPlacaNativeQuery("CBD-1551"));
		System.out.println(this.automovilService.buscarporMarcaNativeQuery("Lexus"));
		System.out.println(this.automovilService.buscarPorColorNativeQuery("Negro"));
		System.out.println("Named Native Query:");
		System.out.println(this.automovilService.buscarPorPlacaNamedNativeQuery("CBD-1551"));
		System.out.println(this.automovilService.buscarporMarcaNamedNativeQuery("Lexus"));
		System.out.println(this.automovilService.buscarPorColorNamedNativeQuery("Negro"));

		
		
	}

}
