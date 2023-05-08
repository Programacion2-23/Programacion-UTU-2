package Practico_Arrays_ejercicio1;
import java.util.Scanner;

public class Programa {	
	
	Scanner entrada = new Scanner(System.in);
	
	
	void mostrarArrays(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		
	}
	
	void cargarArrays(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Ingrese 5 numeros: ");
			a[i] = entrada.nextInt();
		}
		
	}
	
	void menorArrays(int a[]) {
		
		int menor = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] < menor) {
				menor = a[i];
			}
			
		}
		
		System.out.println("El numero menor de el array es: " + menor);
		
	}
	
	void mayorArrays(int a[]) {
		
		int mayor = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] > mayor) {
				mayor = a[i];
			}
			
		}
		
		System.out.println("El numero mayor de el array es: " + mayor);
		
	}
	
}
