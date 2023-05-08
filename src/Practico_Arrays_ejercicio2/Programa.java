package Practico_Arrays_ejercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	Scanner entrada = new Scanner(System.in);
	int sueldos [] = new int[6];
	
	void ingresoSueldo () {
		
		int dijitoMinimo = 1000;
		
		try {
			
			for (int i = 0; i < sueldos.length; i++) {
				System.out.println("Ingresa 6 sueldos: ");
				sueldos[i] = entrada.nextInt();
				
				if (sueldos[i] <= dijitoMinimo  ) {
					System.out.println("ERROR! debe de ingresar valores por encima del 1000");
				}
			}
			
			System.out.println("GRACIAS! Sueldos cargados con exito!");
						
		} catch (InputMismatchException ex) {
			
			System.out.println("por favor ingrese un sueldo con numeros enteros: ");
			System.out.println("Ingresa 6 sueldos: ");
		}
		
	}
	
	
	void mostrarSueldos() {
		
		int maxSueldo = 0;
		
		for (int i = 0; i < sueldos.length; i++) {
			
			if (sueldos[i] >= 5000) {
				maxSueldo++;
			}
		}
		
		System.out.println("El promedio de sueldos altos es: " + maxSueldo);
		
	}
	
}
