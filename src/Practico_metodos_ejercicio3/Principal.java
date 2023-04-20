package Practico_metodos_ejercicio3;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Procesos practico3 =  new Procesos();
		Scanner entrada = new Scanner(System.in);
		
		int op = 0;
		//MENU
		do {
			
			System.out.println("1. Numero par e Impar");
			System.out.println("2. el mayor de tres numeros");
			System.out.println("3. Es mayor de edad");
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				
				practico3.parImpar();
				
				break;

			case 2:
				practico3.mayorTres();
				break;
				
			case 3:
				practico3.esMayorEdad();
				
				break;
			}
			
		} while (op!=0);
	}

}
