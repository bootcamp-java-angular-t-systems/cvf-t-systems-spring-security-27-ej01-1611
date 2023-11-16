package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Proveedor;

@Service
public interface IProveedorService {

	public List<Proveedor> findAll();

	public Proveedor findById(Long id);

	public Proveedor update(Proveedor proveedor);

	public Proveedor save(Proveedor proveedor);

	public void delete(Long id);

}
