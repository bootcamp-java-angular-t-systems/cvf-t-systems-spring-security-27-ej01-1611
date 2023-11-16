package com.example.demo.controller;

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

import com.example.demo.dto.Proveedor;
import com.example.demo.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorService;
	
	@GetMapping("/all")
	public List<Proveedor> getAll() {
		return proveedorService.findAll();
	}
	
	@GetMapping("/{id}")
	public Proveedor getById(@PathVariable(name="id") Long id) {
		return proveedorService.findById(id);
	}
	
	
	@PostMapping("")
	public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}
	
	@PutMapping("/{id}")
	public Proveedor updateProveedor(@PathVariable(name="id")Long id,@RequestBody Proveedor proveedor) {
		
		Proveedor proveedorSeleccionada= new Proveedor();
		
		proveedorSeleccionada= proveedorService.findById(id);
		
		proveedorSeleccionada.setNombre(proveedor.getNombre());
		
		
		proveedorSeleccionada = proveedorService.update(proveedorSeleccionada);
		
		return proveedorSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProveedor(@PathVariable(name="id") Long id) {
		proveedorService.delete(id);
	}
}
