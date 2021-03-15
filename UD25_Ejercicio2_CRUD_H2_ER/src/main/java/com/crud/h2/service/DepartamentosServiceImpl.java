package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentosDAO;
import com.crud.h2.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService {

	// Utilizamos los metodos de la interface IDepartamentosDAO
	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public Departamentos listarXId(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	public Departamentos actualizarDepartamentos(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public void eliminarDepartamentos(Long id) {
		// TODO Auto-generated method stub
		iDepartamentosDAO.deleteById(id);
	}

}