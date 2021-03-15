package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Departamentos;

/**
 * @author Estefania
 *
 */
public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long> {

}
