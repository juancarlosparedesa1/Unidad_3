package com.example.demo.repo;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);

	public void borrar(String placa);

}