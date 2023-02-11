package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelRepository {

	// buscar por tipo de habitación
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
}
