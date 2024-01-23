package com.corenetworks.repasoentidades;

import com.corenetworks.repasoentidades.modelo.Barco;
import com.corenetworks.repasoentidades.modelo.Patron;
import com.corenetworks.repasoentidades.modelo.Salida;
import com.corenetworks.repasoentidades.modelo.Socio;
import com.corenetworks.repasoentidades.servicio.IPatronServicio;
import com.corenetworks.repasoentidades.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RepasoentidadesApplication implements CommandLineRunner {
	@Autowired
    private ISocioServicio servicio;
	@Autowired
	private IPatronServicio servicioPatron;
	public static void main(String[] args) {
		SpringApplication.run(RepasoentidadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Socio s1 = new Socio("12345678Z","Tita Ruiz","Moral");
	    Barco b1 = new Barco("1234ABC",1, "Lola",300);
//		Barco b2 = new Barco("1235ABC",2, "Viento",300);
//		b1.setSocio(s1);
//		b2.setSocio(s1);
//		List<Barco> barcos = new ArrayList<>();
//		barcos.add(b1);
//		barcos.add(b2);
//		s1.setB1(barcos);
//		System.out.println("---- INSERTAR DE UNO ----");
//		System.out.println(servicio.insertar(s1));


		System.out.println("---- CONSULTA DE UNO ----");
		System.out.println(servicio.mostrarUno("12345678Z"));

		Patron p1 = new Patron("12345678A","Miguel Angel Gonzalez","Alpedrete");
		Salida s1 = new Salida(1, LocalDate.now(), LocalTime.now(),b1);
		s1.setPatron(p1);
		Salida s2 = new Salida(2, LocalDate.now(), LocalTime.now(),b1);
		s2.setPatron(p1);
		List<Salida> salidas = new ArrayList<>();
		salidas.add(s1);
		salidas.add(s2);
		p1.setS1(salidas);
		System.out.println(servicioPatron.insertar(p1));




//		System.out.println("---- CONSULTA DE TODOS ----");
//		System.out.println(servicio.mostrarTodos());
//		System.out.println("---- CONSULTA DE FILTRO ----");
//		System.out.println(servicio.obtenerSociosAlpedrete());

//		s1.setNombre("Tita Ruiz");
//		s1.setDireccion("Moralzarzal");
//		System.out.println("---- MODIFICAR DE UNO ----");
//		System.out.println(servicio.modificar(s1));
//		System.out.println("---- ELIMINAR DE UNO ----");
//		servicio.eliminar("12345678Z");
//		System.out.println("---- ORDENADOS POR NOMBRE ----");
//		System.out.println(servicio.obtenerSociosOrdenadosNombre());
//		System.out.println("---- AGRUPADOS POR DIRECCION ----");
//		System.out.println(servicio.obtenerSociosAgrupadoPorDireccion());

	}
}
