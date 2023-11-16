package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISuministraDAO;
import com.example.demo.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDAO suministraDAO;
	
	public List<Suministra> findAll() {
		return suministraDAO.findAll();
	}
	
	public Suministra findById(Long id) {
		return suministraDAO.findById(id).get();
	}
	
	public Suministra save(Suministra suministra) {
		return suministraDAO.save(suministra);
	}
	
	public Suministra update(Suministra suministra) {
		return suministraDAO.save(suministra);
	}
	
	public void delete(Long id) {
		suministraDAO.deleteById(id);
	}
}
