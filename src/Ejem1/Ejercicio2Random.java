package Ejem1;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio2Random {

	void iniciar () {
		
		int valor = generarAleatorio();
		int num;
		String resul;
		
		do {
			System.out.println(valor);
			num = pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
		} while(resul!= "es igual");
		System.out.println("Felicitaciones Acertastee!!");
		
	}
	
	
	//pide un nro por pantalla
		int pedirNumero() {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Ingrese un numero: ");
			int numeroIng = entrada.nextInt();
			
			return numeroIng;
		}
	
	//devuelve un numero aleatorio entre 1 y 1000
	int generarAleatorio() {
		Random rand = new Random();
		int numR = 1000;
		
		int randomNumer = rand.nextInt(numR);
		
		return randomNumer;
	}
	
	
	//compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
	 String compararNumeros(int a, int b) {
		 String mayor = "es mayor";
		 String menor = "es menor";
		 String igual = "es igual";
		 
		 if (a > b) {
			return mayor; 
		 } else if (a < b) {
			return menor;
		} else {
			return igual;
		}
		 
		 
	}
	
}
