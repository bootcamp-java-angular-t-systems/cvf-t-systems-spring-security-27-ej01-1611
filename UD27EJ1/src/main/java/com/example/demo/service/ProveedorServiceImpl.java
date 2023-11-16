package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedorDAO;
import com.example.demo.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO proveedorDAO;
	
	public List<Proveedor> findAll() {
		return proveedorDAO.findAll();
	}
	
	public Proveedor findById(Long id) {
		return proveedorDAO.findById(id).get();
	}
	
	public Proveedor save(Proveedor proveedor) {
		return proveedorDAO.save(proveedor);
	}
	
	public Proveedor update(Proveedor proveedor) {
		return proveedorDAO.save(proveedor);
	}
	
	public void delete(Long id) {
		proveedorDAO.deleteById(id);
	}
}
