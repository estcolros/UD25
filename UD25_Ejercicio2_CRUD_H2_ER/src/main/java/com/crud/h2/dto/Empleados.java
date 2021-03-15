package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados") // en caso que la tabla sea diferente
public class Empleados {

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String id;

	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@Column(name = "apellidos") // no hace falta si se llama igual
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamentos departamentos;

	// Constructores
	public Empleados() {

	}

	public Empleados(String id, String nombre, String apellidos, Departamentos departamentos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the departamentos
	 */
	public Departamentos getDepartamentos() {
		return departamentos;
	}

	/**
	 * @param departamentos the departamentos to set
	 */
	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	// Metodo para mostrar datos por consola
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamentos="
				+ departamentos + "]";
	}

}
