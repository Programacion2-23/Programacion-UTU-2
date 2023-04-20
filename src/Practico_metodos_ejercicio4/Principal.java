package Practico_metodos_ejercicio4;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ProgramaEdades prog4 = new ProgramaEdades();
		Scanner entrada = new Scanner(System.in);
		
		int cantidadEdades;
		
		System.out.println("Cuantas edades va a ingresar? ");
		cantidadEdades = entrada.nextInt();
		prog4.inicio(cantidadEdades);

	}

}
