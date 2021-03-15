package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenesDAO;
import com.crud.h2.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	// Utilizamos los metodos de la interface IAlmacenesDAO
	@Autowired
	IAlmacenesDAO iAlmacenesDAO;

	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes listarXId(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);
	}

}