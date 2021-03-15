package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas") // en caso que la tabla sea diferente
public class Cajas {

	// Atributos de entidad cajas
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "contenido") // no hace falta si se llama igual
	private String contenido;

	@Column(name = "valor") // no hace falta si se llama igual
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacenes almacen;

	// Constructores
	public Cajas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Cajas(String id, String contenido, int valor, Almacenes almacen) {
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the id
	 */
	public String getid() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setid(String id) {
		this.id = id;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacenes getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	// Metodo para mostrar datos por consola
	@Override
	public String toString() {
		return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}

}
