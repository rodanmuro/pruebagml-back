package com.pruebagml.demo;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebagml.demo.entities.Cliente;
import com.pruebagml.demo.repositories.ClienteRepository;
import com.pruebagml.demo.services.ClienteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final ClienteService clienteService;

	public DemoApplication(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = null;


		for (int i = 0; i < 5; i++) {
			cliente = Cliente.builder()
					.sharedKey("cliente"+i)
					.businessId("nombre"+i+" apellido"+i)
					.email("correo"+i+"@correo.com")
					.phone(3156332247L+i)
					.startDate(LocalDate.now())
					.endDate(LocalDate.now())
					.dataAdded(LocalDate.now())
					.build();
	
			clienteService.guardarCliente(cliente);
		}
	}

}
