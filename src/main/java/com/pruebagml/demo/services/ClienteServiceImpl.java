package com.pruebagml.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pruebagml.demo.entities.Cliente;
import com.pruebagml.demo.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> obtenerClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        Cliente clienteGuardado = clienteRepository.save(cliente);
        return clienteGuardado;
    }

    @Override
    public List<Cliente> getClienteBySharedKey(String sharedKey) {
        List<Cliente> clientes = clienteRepository.findBySharedKeyContaining(sharedKey);
        return clientes;
    }

}
