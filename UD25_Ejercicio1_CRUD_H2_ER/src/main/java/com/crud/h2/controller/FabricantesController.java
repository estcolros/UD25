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

import com.crud.h2.dto.Fabricante;
import com.crud.h2.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricantes();
	}

	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}

	@GetMapping("/fabricantes/{id}")
	public Fabricante listarXId(@PathVariable(name = "id") Long id) {
		Fabricante fabricante_xid = new Fabricante();

		fabricante_xid = fabricanteServiceImpl.listarXId(id);

		System.out.println("Fabricante XID: " + fabricante_xid);

		return fabricante_xid;
	}

	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") Long id, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado = fabricanteServiceImpl.listarXId(id);

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);

		System.out.println("El fabricante actualizado es: " + fabricante_actualizado);

		return fabricante_actualizado;
	}

	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name = "id") Long id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}

}
