package Practico_metodos_ejercicio4;
import java.util.Scanner;

public class ProgramaEdades {

	Scanner entrada = new Scanner(System.in);
	int edades[];
	int menores;
	int mayores;
	int adultosMayores;
	
	
	void inicio (int edad) {
		
		int edadesIng = edad;
		
		ingresoEdades(edadesIng);
		mostrar();
	}
	
	//GUARDA LAS EDADES INGRESADAS Y CONTARLAS
	void ingresoEdades(int a) {
		edades = new int [a];
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduzca sus " + a + " edades: ");
			edades[i] = entrada.nextInt();
			
			if (edades[i] <= 18) {
				menores++;
				
			} else if (edades[i] >= 18 && edades[i] <= 59) {
				mayores++;
				
			} else if (edades[i] >= 60) {
				adultosMayores++;
				
			}
				
		}
		
	}
	
	//MOSTRAR EN PANTALLA LA INFORMACION
	void mostrar() {
		
		System.out.println("Los menores de 18 son: " + menores);
		System.out.println("Los mayores de 18 son: " + mayores);
		System.out.println("Los adultos mayores son: " + adultosMayores);
	}
}
