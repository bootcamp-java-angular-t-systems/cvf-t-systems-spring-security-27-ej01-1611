package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Suministra;

@Repository
public interface ISuministraDAO extends JpaRepository<Suministra, Long> {

}
