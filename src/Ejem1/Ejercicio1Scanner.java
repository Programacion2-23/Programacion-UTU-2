package Ejem1;
import java.util.Scanner;

public class Ejercicio1Scanner {

	Scanner entrada = new Scanner(System.in);
	
	String apellido;
	int edad;
	double altura;
	int cedula;
	
	void inicar () {
		Cargar();
		imprimir();
	}
	
	//Cargar datos 
	
	void Cargar() {
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.next();
		
		System.out.println("Ingrese su edad: ");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese su altura: ");
		altura = entrada.nextDouble();
		
		System.out.println("Ingrese su cedula: ");
		cedula = entrada.nextInt();
	}
	
	//Imprimir datos
	
	void imprimir() {
		
		System.out.println("Su Apellido es: " + apellido);
		System.out.println("Su Edad es: " + edad);
		System.out.println("Su Altura es: " + altura);
		System.out.println("Su Cedula es: " + cedula);
		
	}
}
