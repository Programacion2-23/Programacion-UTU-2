package Practico_metodos_ejercicio4;
import java.util.Scanner;

public class ProgramaEdades {

	Scanner entrada = new Scanner(System.in);
	int edades[];
	int menores;
	int mayores;
	int adultosMayores;
	
	
	void inicio (int edad) {
		
		ingresoEdades(edad);
		contar();
		mostrar();
	}
	
	//GUARDA LAS EDADES INGRESADAS
	void ingresoEdades(int a) {
		edades = new int [a];
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduzca sus " + a + " edades: ");
			edades[i] = entrada.nextInt();
		}
		
	}
	
	//CONTAR CUANTOS SON MAYORES,MENORES Y ADULTOS MAYORES
	void contar () {
		
		
	}
	
	//MOSTRAR EN PANTALLA LA INFORMACION
	void mostrar() {
		
	}
}
