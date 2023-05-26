package Ejercicios_escrito_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ventasT = 0;
		int acumulador = 0;
		int ventasMax = 0;
		
		
		do {
			
			System.out.println("Ingrse su ventas: ");
			acumulador = entrada.nextInt();
			
			
			ventasT += acumulador;
			
			if (ventasMax <= acumulador) {
				
				ventasMax = acumulador;
			}
			
		} while (acumulador != 0);
		
		System.out.println("Sus ventas totales fueron: " + ventasT);
		System.out.println("Su mayor venta fue: " + ventasMax);
	}
	
	

}
