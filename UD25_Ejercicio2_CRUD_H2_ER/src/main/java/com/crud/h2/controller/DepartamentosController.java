package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Departamentos;
import com.crud.h2.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {

	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;

	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos() {
		return departamentosServiceImpl.listarDepartamentos();
	}

	@PostMapping("/departamentos")
	public Departamentos salvarDepartamento(@RequestBody Departamentos departamento) {
		return departamentosServiceImpl.guardarDepartamentos(departamento);
	}

	@GetMapping("/departamentos/{id}")
	public Departamentos listarXId(@PathVariable(name = "id") Long id) {
		Departamentos departamento_xid = new Departamentos();

		departamento_xid = departamentosServiceImpl.listarXId(id);

		System.out.println("Departamentos XID: " + departamento_xid);

		return departamento_xid;
	}

	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name = "id") Long id,
			@RequestBody Departamentos departamento) {

		Departamentos departamento_seleccionado = new Departamentos();
		Departamentos departamento_actualizado = new Departamentos();

		departamento_seleccionado = departamentosServiceImpl.listarXId(id);

		departamento_seleccionado.setNombre(departamento.getNombre());

		departamento_actualizado = departamentosServiceImpl.actualizarDepartamentos(departamento_seleccionado);

		System.out.println("El departamento actualizado es: " + departamento_actualizado);

		return departamento_actualizado;
	}

	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name = "id") Long id) {
		departamentosServiceImpl.eliminarDepartamentos(id);
	}

}
