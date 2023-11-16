package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> findAll();

	public Suministra findById(Long id);

	public Suministra update(Suministra suministra);

	public Suministra save(Suministra suministra);

	public void delete(Long id);

}
