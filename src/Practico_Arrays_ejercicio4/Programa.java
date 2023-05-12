package Practico_Arrays_ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	Scanner entrada = new Scanner(System.in);

	void ingresoNumeross(int numeros[]) {
		
		try {
			
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println("Ingrese 5 numeros positivos: ");
				numeros[i] = entrada.nextInt();
				
				if (numeros[i] <= 0 ) {
					System.out.println("ERROR, Ingrese numeros positivos");
				}
				
			}
			
			
		} catch (InputMismatchException ex) {
			
			System.out.println("ERROR! IVALIDO");
			System.out.println("Ingrese nuevamente 5 numeros positivos: ");
			
		}
	}
	
	void imprimirMayor(int numeros[]) {
		int mayor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		System.out.println("El mayor es: " + mayor);
		
	}
	
}
