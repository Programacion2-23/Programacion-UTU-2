package Practico_Arrays_ejercicio3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Programa {
	Scanner entrada = new Scanner(System.in);
	
	int mayores = 0;
	int menores = 0;
	
	void pedirEdades(int edad[]) {
		
		try {
			
			for (int i = 0; i < edad.length; i++) {
				
				System.out.println("Ingrese 10 edades: ");
				edad[i] = entrada.nextInt();
				
				if (edad[i] <= 18) {
					
					System.out.println("Error, las personas deben ser mayores, ingrese de nuevo");
					menores++;
					
				} else {
					mayores++;
				}
			}
			
		} catch (InputMismatchException ex) {
			
			System.out.println("ERROR! INGRESE UN NUMERO ENTERO:");
			System.out.println("Ingrese 10 edades: ");	
		}
		
	}
	
	void mostrarEdades(int edad[]) {
		
		System.out.println("El promedio de edades menores ingresadas son: " + menores);
		System.out.println("El promedio de edades mayores ingresadas son: " + mayores);
	}
}
