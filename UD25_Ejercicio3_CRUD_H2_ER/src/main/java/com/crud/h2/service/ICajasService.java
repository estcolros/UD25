package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Cajas;

/**
 * @author Estefania
 *
 */

public interface ICajasService {

	// Metodos del CRUD

	List<Cajas> listarCaja(); // Listar All

	Cajas guardarCaja(Cajas caja); // Guarda una caja CREATE

	Cajas listarXId(String id); // Leer datps de una caja READ

	Cajas actualizarCaja(Cajas caja); // Actualiza datos de una caja UPDATE

	void eliminarCaja(String id); // Elimina una caja DELETE

}
