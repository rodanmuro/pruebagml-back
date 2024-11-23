package com.pruebagml.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebagml.demo.entities.Cliente;
import com.pruebagml.demo.services.ClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente) {
        Cliente clienteGuardado = clienteService.guardarCliente(cliente);
        return ResponseEntity.ok(clienteGuardado);
    }
}
