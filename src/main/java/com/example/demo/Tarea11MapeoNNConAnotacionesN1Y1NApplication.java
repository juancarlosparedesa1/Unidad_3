package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Tarea11MapeoNNConAnotacionesN1Y1NApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService rentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea11MapeoNNConAnotacionesN1Y1NApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Creamos Vehiculo
		Vehiculo vehi1 = new Vehiculo();
		vehi1.setPlaca("PSG-1532");
		vehi1.setColor("Negro");
		vehi1.setMarca("Renault");
		vehi1.setTipo("L");

		//Creamos Cliente
		Cliente cli1 = new Cliente();
		cli1.setNumeroCedula("1726897777");
		cli1.setNombre("Juan");
		cli1.setApellido("Paredes");
		cli1.setEdad(26);

		//Guradamos vehiculos
		this.vehiculoService.guardar(vehi1);
		
		//Guardamos clientes
		this.clienteService.guardar(cli1);

		//Realizamos la renta del vehiculo mediante su placa y numero de cedula del cliente
		this.rentaService.realizarRenta("PSG-1532", "1726897777");
		
		
	}

}
