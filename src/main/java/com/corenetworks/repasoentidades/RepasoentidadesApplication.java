package com.corenetworks.repasoentidades;

import com.corenetworks.repasoentidades.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepasoentidadesApplication implements CommandLineRunner {
	@Autowired
    private ISocioServicio servicio;
	public static void main(String[] args) {
		SpringApplication.run(RepasoentidadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicio.mostrarUno("12345678A"));
	}
}
