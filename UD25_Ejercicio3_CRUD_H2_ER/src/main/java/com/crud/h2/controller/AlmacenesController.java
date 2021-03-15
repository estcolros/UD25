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

import com.crud.h2.dto.Almacenes;
import com.crud.h2.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;

	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes() {
		return almacenesServiceImpl.listarAlmacenes();
	}

	@PostMapping("/almacenes")
	public Almacenes salvarAlmacen(@RequestBody Almacenes almacen) {
		return almacenesServiceImpl.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{id}")
	public Almacenes listarXId(@PathVariable(name = "id") Long id) {
		Almacenes Almacen_xid = new Almacenes();

		Almacen_xid = almacenesServiceImpl.listarXId(id);

		System.out.println("Almacenes XID: " + Almacen_xid);

		return Almacen_xid;
	}

	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacen(@PathVariable(name = "id") Long id, @RequestBody Almacenes almacen) {

		Almacenes Almacen_seleccionado = new Almacenes();
		Almacenes Almacen_actualizado = new Almacenes();

		Almacen_seleccionado = almacenesServiceImpl.listarXId(id);

		Almacen_seleccionado.setLugar(almacen.getLugar());
		Almacen_seleccionado.setCapacidad(almacen.getCapacidad());

		Almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(Almacen_seleccionado);

		System.out.println("El Almacen actualizado es: " + Almacen_actualizado);

		return Almacen_actualizado;
	}

	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") Long id) {
		almacenesServiceImpl.eliminarAlmacen(id);
	}

}
