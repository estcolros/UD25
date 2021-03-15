package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Cajas;

/**
 * @author Estefania
 *
 */
public interface ICajasDAO extends JpaRepository<Cajas, String> {

}
