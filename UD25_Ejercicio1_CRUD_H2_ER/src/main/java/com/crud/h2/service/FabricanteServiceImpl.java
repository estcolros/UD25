package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricantesDAO;
import com.crud.h2.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	//Utilizamos los métodos de la interface IFabricantesDAO
	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricante listarXId(Long id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(id);
	}
	
}