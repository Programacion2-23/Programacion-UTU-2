package Practico_Arrays_ejercicio1;

public class Main {

	public static void main(String[] args) {
		Programa prog1 = new Programa();
		
		int listado [] = new int[5];
		
		prog1.cargarArrays(listado);
		prog1.mostrarArrays(listado);
		prog1.menorArrays(listado);
		prog1.mayorArrays(listado);

	}

}
