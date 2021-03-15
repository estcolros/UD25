package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamentos") // en caso que la tabla sea diferente
public class Departamentos {

	// Atributos de entidad departamento
	@Id
	private Long id;

	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@Column(name = "presupuesto") // no hace falta si se llama igual
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Empleados> empleados;

	// Constructores
	public Departamentos() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param presupuesto
	 * @param empleado
	 */
	public Departamentos(Long id, String nombre, int presupuesto, List<Empleados> empleados) {
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleados = empleados;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleados")
	public List<Empleados> getEmpleado() {
		return empleados;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setDepartamentos(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	// Metodo para mostrar datos por consola
	@Override
	public String toString() {
		return "Departamentos [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", departamentos="
				+ empleados + "]";
	}

}