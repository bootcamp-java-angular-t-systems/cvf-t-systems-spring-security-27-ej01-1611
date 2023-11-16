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

import com.example.demo.dto.Suministra;
import com.example.demo.service.SuministraServiceImpl;

@RestController
@RequestMapping("/suministra")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraService;
	
	@GetMapping("/all")
	public List<Suministra> getAll() {
		return suministraService.findAll();
	}
	
	@GetMapping("/{id}")
	public Suministra getById(@PathVariable(name="id") Long id) {
		return suministraService.findById(id);
	}
	
	
	@PostMapping("")
	public Suministra createSuministra(@RequestBody Suministra suministra) {
		return suministraService.save(suministra);
	}
	
	@PutMapping("/{id}")
	public Suministra updateSuministra(@PathVariable(name="id")Long id,@RequestBody Suministra suministra) {
		
		Suministra suministraSeleccionada= new Suministra();
		
		suministraSeleccionada= suministraService.findById(id);
		
		suministraSeleccionada.setProveedor(suministra.getProveedor());
		suministraSeleccionada.setPieza(suministra.getPieza());
		suministraSeleccionada.setPrecio(suministra.getPrecio());
		
		suministraSeleccionada = suministraService.update(suministraSeleccionada);
		
		return suministraSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteSuministra(@PathVariable(name="id") Long id) {
		suministraService.delete(id);
	}
}
