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

import com.crud.h2.dto.Empleados;
import com.crud.h2.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired
	EmpleadosServiceImpl EmpleadosServiceImpl;

	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados() {
		return EmpleadosServiceImpl.listarEmpleados();
	}

	@PostMapping("/empleados")
	public Empleados salvarEmpleados(@RequestBody Empleados empleados) {
		return EmpleadosServiceImpl.guardarEmpleados(empleados);
	}

	@GetMapping("/empleados/{dni}")
	public Empleados empleadoXID(@PathVariable(name = "dni") String id) {

		Empleados empleado_xid = new Empleados();

		empleado_xid = EmpleadosServiceImpl.listarXIid(id);

		return empleado_xid;
	}

	@PutMapping("/empleados/{dni}")
	public Empleados actualizarEmpleado(@PathVariable(name = "dni") String id, @RequestBody Empleados empleado) {

		Empleados empleado_seleccionado = new Empleados();
		Empleados empleado_actualizado = new Empleados();

		empleado_seleccionado = EmpleadosServiceImpl.listarXIid(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamentos(empleado.getDepartamentos());

		empleado_actualizado = EmpleadosServiceImpl.actualizarEmpleados(empleado_seleccionado);

		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name = "dni") String id) {
		EmpleadosServiceImpl.eliminarEmpleados(id);
	}

}