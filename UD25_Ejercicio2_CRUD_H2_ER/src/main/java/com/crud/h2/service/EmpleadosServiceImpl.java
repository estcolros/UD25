package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService {

	// Utilizamos los metodos de la interface iEmpleadossDAO
	@Autowired
	IEmpleadosDAO iEmpleadossDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadossDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iEmpleadossDAO.save(empleados);
	}

	@Override
	public Empleados listarXIid(String id) {
		// TODO Auto-generated method stub
		return iEmpleadossDAO.findById(id).get();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		return iEmpleadossDAO.save(empleados);
	}

	@Override
	public void eliminarEmpleados(String id) {
		// TODO Auto-generated method stub
		iEmpleadossDAO.deleteById(id);
	}

}