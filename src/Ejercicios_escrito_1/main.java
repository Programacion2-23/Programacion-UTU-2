package Ejercicios_escrito_1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Programa1 prog1 = new Programa1();
		Scanner entrada = new Scanner(System.in);
		
		int op;
			
			do {
				
				System.out.println("1. Area del triangulo");
				System.out.println("2. Area del circulo");
				System.out.println("3. Area del cuadrado");
				System.out.println("0. salir");
				System.out.println("Ingrese la opcion que quiere: ");
				op = entrada.nextInt();
				
				switch (op) {
				case 1:
					prog1.areaTriangulo();
					break;

				case 2:
					
					prog1.areaCirculo();
					
					break;
					
				case 3:
					prog1.areaCuadrado();
					break;
				}
				
			} while (op != 0);
	}

}
