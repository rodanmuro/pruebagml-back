package com.pruebagml.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/cliente/{sharedKey}")
    public ResponseEntity<List<Cliente>> obtenerClientesBySharedKey(@PathVariable String sharedKey){
        List<Cliente> clientes = clienteService.getClienteBySharedKey(sharedKey);
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> obtenerClientes(){
        List<Cliente> clientes = clienteService.obtenerClientes();
        return ResponseEntity.ok(clientes);
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente) {
        Cliente clienteGuardado = clienteService.guardarCliente(cliente);
        return ResponseEntity.ok(clienteGuardado);
    }
}
