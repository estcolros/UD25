package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Almacenes;

/**
 * @author Estefania
 *
 */

public interface IAlmacenesService {

	// Metodos del CRUD

	List<Almacenes> listarAlmacenes(); // Listar All

	Almacenes guardarAlmacen(Almacenes almacen); // Guarda un almacen CREATE

	Almacenes listarXId(Long id); // Leer datos de un almacen READ

	Almacenes actualizarAlmacen(Almacenes almacen); // Actualiza datos del almacen UPDATE

	void eliminarAlmacen(Long id); // Elimina el almacen DELETE

}