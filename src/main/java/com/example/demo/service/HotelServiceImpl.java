package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repo.IHotelRepository;
@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelInnerJoin(tipoHabitacion);
	}
	@Override
	public List<Hotel> buscarHotelOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterJoin(tipoHabitacion);
	}
	@Override
	public List<Hotel> buscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelRightJoin(tipoHabitacion);
	}
	@Override
	public List<Hotel> buscarHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.buscarHotelLeftJoin(tipoHabitacion);
	}

}
