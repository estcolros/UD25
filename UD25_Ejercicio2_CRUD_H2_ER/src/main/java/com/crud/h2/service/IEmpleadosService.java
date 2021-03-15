package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleados;

/**
 * @author Estefania
 *
 */
public interface IEmpleadosService {

	// Metodos del CRUD

	public List<Empleados> listarEmpleados(); // Listar All

	public Empleados guardarEmpleados(Empleados empleados); // Guarda un empleado CREATE

	public Empleados actualizarEmpleados(Empleados empleados); // Leer datos de un empleado READ

	void eliminarEmpleados(String id); // Actualiza datos del empleado UPDATE

	Empleados listarXIid(String id); // Elimina el empleado DELETE

}