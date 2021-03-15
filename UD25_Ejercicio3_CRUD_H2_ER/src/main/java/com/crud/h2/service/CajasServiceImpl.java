package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.h2.dao.ICajasDAO;
import com.crud.h2.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService {

	// Utilizamos los metodos de la interface ICajasDAO
	@Autowired
	ICajasDAO iCajasDAO;

	@Override
	public List<Cajas> listarCaja() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCaja(Cajas Caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(Caja);
	}

	@Override
	public Cajas listarXId(String id) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(id).get();
	}

	@Override
	public Cajas actualizarCaja(Cajas Caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(Caja);
	}

	@Override
	public void eliminarCaja(String id) {
		// TODO Auto-generated method stub
		iCajasDAO.deleteById(id);
	}

}