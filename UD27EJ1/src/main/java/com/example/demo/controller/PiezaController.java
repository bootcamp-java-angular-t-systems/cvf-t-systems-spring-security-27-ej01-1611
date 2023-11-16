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

import com.example.demo.dto.Pieza;
import com.example.demo.service.PiezaServiceImpl;

@RestController
@RequestMapping("/pieza")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaService;
	
	@GetMapping("/all")
	public List<Pieza> getAll() {
		return piezaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Pieza getById(@PathVariable(name="id") Long id) {
		return piezaService.findById(id);
	}
	
	
	@PostMapping("")
	public Pieza createPieza(@RequestBody Pieza pieza) {
		return piezaService.save(pieza);
	}
	
	@PutMapping("/{id}")
	public Pieza updatePieza(@PathVariable(name	="id")Long id,@RequestBody Pieza pieza) {
		
		Pieza piezaSeleccionada= new Pieza();
		
		piezaSeleccionada= piezaService.findById(id);
		
		piezaSeleccionada.setNombre(pieza.getNombre());
		
		
		piezaSeleccionada = piezaService.update(piezaSeleccionada);
		
		return piezaSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deletePieza(@PathVariable(name="id") Long id) {
		piezaService.delete(id);
	}
}
