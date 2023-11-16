package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IPiezaDAO;
import com.example.demo.dto.Pieza;

@RestController
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDAO piezaDAO;
	
	public List<Pieza> findAll() {
		return piezaDAO.findAll();
	}
	
	public Pieza findById(Long id) {
		return piezaDAO.findById(id).get();
	}
	
	public Pieza save(Pieza pieza) {
		return piezaDAO.save(pieza);
	}
	
	public Pieza update(Pieza pieza) {
		return piezaDAO.save(pieza);
	}
	
	public void delete(Long id) {
		piezaDAO.deleteById(id);
	}
}
