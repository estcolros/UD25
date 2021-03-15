package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Empleados;

/**
 * @author Estefania
 *
 */
public interface IEmpleadosDAO extends JpaRepository<Empleados, String> {

}
