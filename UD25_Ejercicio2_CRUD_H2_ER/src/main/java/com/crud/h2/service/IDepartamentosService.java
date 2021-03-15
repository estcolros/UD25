package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Departamentos;

/**
 * @author Estefania
 *
 */
public interface IDepartamentosService {

	// Metodos del CRUD

	public List<Departamentos> listarDepartamentos();// Listar All

	Departamentos guardarDepartamentos(Departamentos departamentos); // Guarda un departamento CREATE

	Departamentos listarXId(Long id); // Leer datos de un departamento READ

	Departamentos actualizarDepartamentos(Departamentos departamentos); // Actualiza datos del departamento UPDATE

	void eliminarDepartamentos(Long id); // Elimina el departamento DELETE

}
