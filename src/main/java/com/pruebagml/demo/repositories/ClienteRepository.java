package com.pruebagml.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebagml.demo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
