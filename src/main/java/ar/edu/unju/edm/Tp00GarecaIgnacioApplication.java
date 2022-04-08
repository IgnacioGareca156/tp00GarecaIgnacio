package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00GarecaIgnacioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00GarecaIgnacioApplication.class, args);
		
		System.out.println("HOLA SOY NACHO");
		
		Calculadora unaCalculadora  = new Calculadora();
		int resultado = unaCalculadora.sumar(10,5);
		System.out.println(resultado);
		
		
		Calculadora unaCalculadora2  = new Calculadora();
		int resultado2 = unaCalculadora2.restar(10,5);
		System.out.println(resultado2);
		
		
		Calculadora unaCalculadora3  = new Calculadora();
		int resultado3 = unaCalculadora3.producto(10,5);
		System.out.println(resultado3);
		
		Calculadora unaCalculadora4  = new Calculadora();
		double resultado4 = unaCalculadora4.division(10,5);
		System.out.println(resultado4);
		
		Calculadora unaCalculadora5 = new Calculadora();
		unaCalculadora5.mostrarMayor(10,5);
		
	}

}
