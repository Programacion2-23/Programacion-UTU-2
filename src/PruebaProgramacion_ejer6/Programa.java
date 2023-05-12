package PruebaProgramacion_ejer6;
import java.util.Scanner;

public class Programa {

	Scanner entrada = new Scanner(System.in);
	
	void leerArreglo(int num[]) {
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Ingese 5 numeros: ");
			num[i] = entrada.nextInt();
		}
		
	}
	
	void encontrarX (int num[]) {
		
		int buscar = 0;
		
		System.out.println("Ingrese el numero que dese buscar: ");
		buscar = entrada.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			
			if (buscar == num[i]) {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
				break;
			}
			
		}
		
		
	}
	
}
