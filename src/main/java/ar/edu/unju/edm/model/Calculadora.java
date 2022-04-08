package ar.edu.unju.edm.model;

public class Calculadora {
	//suma de dos numeros
	public int sumar(int numero1, int numero2) {
		return numero1+numero2;
	}
	//resta de dos numeros
	public int restar(int numero1, int numero2) {
		return numero1-numero2;
	}
	//multiplicacion de dos numeros
	public int producto(int numero1, int numero2) {
		return numero1*numero2;
	}
	
	//division de dos numero
	public double division(double numero1, double numero2) {
			return numero1/numero2;
	}
	
	
	//muestra el mayor numero
	public void mostrarMayor(int numeroA, int numeroB) {
		if(numeroA > numeroB) {
		System.out.println("el numero mayor es el primero");
	 }else {
		System.out.println("el numero mayor es el segundo");
	 	}
	}
}
