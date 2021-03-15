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

import com.crud.h2.dto.Cajas;
import com.crud.h2.service.CajasServiceImpl;


@RestController
@RequestMapping("/api")
public class CajasController {
	
	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServiceImpl.listarCaja();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCajas(@RequestBody Cajas caja) {
		return cajasServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas listarXId(@PathVariable(name="id") String id) {
		Cajas listarXID = new Cajas();
		
		listarXID = cajasServiceImpl.listarXId(id);
		
		System.out.println("Caja XID: " + listarXID);
		
		return listarXID;
	}
	
	@PutMapping("/cajas/{id}")
	public Cajas actualizarCajas(@PathVariable(name="id")String id,@RequestBody Cajas caja) {
		
		Cajas Cajas_seleccionado = new Cajas();
		Cajas Cajas_actualizado = new Cajas();
		
		Cajas_seleccionado= cajasServiceImpl.listarXId(id);
		
		Cajas_seleccionado.setContenido(caja.getContenido());
		Cajas_seleccionado.setValor(caja.getValor());
		Cajas_seleccionado.setAlmacen(caja.getAlmacen());

		
		Cajas_actualizado = cajasServiceImpl.actualizarCaja(Cajas_seleccionado);
		
		System.out.println("El Cajas actualizado es: "+ Cajas_actualizado);
		
		return Cajas_actualizado;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCajas(@PathVariable(name="id")String id) {
		cajasServiceImpl.eliminarCaja(id);
	}
	
}