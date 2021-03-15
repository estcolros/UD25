package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes") // en caso que la tabla sea diferente
public class Almacenes {

	// Atributos de entidad almacenes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lugar") // no hace falta si se llama igual
	private String lugar;

	@Column(name = "capacidad") // no hace falta si se llama igual
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajas> caja;

	// Constructores
	/**
	 * 
	 */
	public Almacenes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	public Almacenes(Long id, String lugar, int capacidad, List<Cajas> caja) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Cajas> getCaja() {
		return caja;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the caja
	 */
	@JsonIgnore
	public List<Cajas> getCajas() {
		return caja;
	}

	/**
	 * @param cajas the caja to set
	 */
	public void setCajas(List<Cajas> caja) {
		this.caja = caja;
	}

	// Metodo para mostrar datos por consola
	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + caja + "]";
	}

}