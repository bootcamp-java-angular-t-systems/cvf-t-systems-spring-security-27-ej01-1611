package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Proveedor;

@Repository
public interface IProveedorDAO extends JpaRepository<Proveedor, Long>{

}
