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

import com.crud.h2.dto.Articulos;
import com.crud.h2.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@GetMapping("/articulos")
	public List<Articulos> listarArticulos() {
		return articuloServiceImpl.listarArticulo();
	}

	@PostMapping("/articulos")
	public Articulos salvarArticulos(@RequestBody Articulos articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}

	@GetMapping("/articulos/{id}")
	public Articulos listarXId(@PathVariable(name = "id") Long id) {
		Articulos listarXID = new Articulos();

		listarXID = articuloServiceImpl.listarXId(id);

		System.out.println("Fabricante XID: " + listarXID);

		return listarXID;
	}

	@PutMapping("/articulo/{id}")
	public Articulos actualizarArticulos(@PathVariable(name = "id") Long id, @RequestBody Articulos articulo) {

		Articulos articulo_seleccionado = new Articulos();
		Articulos articulo_actualizado = new Articulos();

		articulo_seleccionado = articuloServiceImpl.listarXId(id);

		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());

		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);

		System.out.println("El articulo actualizado es: " + articulo_actualizado);

		return articulo_actualizado;
	}

	@DeleteMapping("/articulo/{id}")
	public void eliminarArticulos(@PathVariable(name = "id") Long id) {
		articuloServiceImpl.eliminarArticulo(id);
	}

}