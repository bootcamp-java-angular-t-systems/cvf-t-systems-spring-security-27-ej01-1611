package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> findAll();

	public Pieza findById(Long id);

	public Pieza update(Pieza pieza);

	public Pieza save(Pieza pieza);

	public void delete(Long id);
}
