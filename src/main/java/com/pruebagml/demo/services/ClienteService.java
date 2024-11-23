package com.pruebagml.demo.services;

import java.util.List;

import com.pruebagml.demo.entities.Cliente;

public interface ClienteService {

    public List<Cliente> obtenerClientes();

    public Cliente guardarCliente(Cliente cliente);

    public Cliente getClienteBySharedKey(String sharedKey);

}
