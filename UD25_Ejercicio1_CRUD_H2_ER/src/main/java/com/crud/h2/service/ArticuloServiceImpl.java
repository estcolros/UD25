package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulos;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	// Utilizamos los metodos de la interface IArticulosDAO
	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulo() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos listarXId(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById(id);
	}

}