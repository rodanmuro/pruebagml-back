package com.pruebagml.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebagml.demo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    public List<Cliente> findBySharedKeyContaining(String sharedKey);
    
}
