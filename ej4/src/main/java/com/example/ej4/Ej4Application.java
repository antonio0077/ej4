package com.example.ej4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entidades.Cliente;
import servicios.ClienteService;


import java.time.LocalDate;

import org.springframework.stereotype.Service;

import repositorio.ClienteRepository;

@SpringBootApplication
public class Ej4Application implements CommandLineRunner  {

	Logger logger = LoggerFactory.getLogger(Ej4Application.class);
	
	@Autowired
	ClienteService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Ej4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		clienteService.crearDatosDummy();
		clienteService.mostrarTodos();
		
		List<Cliente> clientes = clienteService.buscarNombreApellido("Antonio", "Garcia Rosales");
		logger.debug(clientes.get(0).toString());
		
	}
}
