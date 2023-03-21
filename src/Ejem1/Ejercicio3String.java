package Ejem1;
import java.util.Scanner;

public class Ejercicio3String {

	Scanner entrada = new Scanner(System.in);
	
	void iniciar () {
		String cadena1,cadena2;
		
		cadena1=cargarString();
		cadena2=cargarString();
		
		menu(cadena1, cadena2);
		
		
	}
	
	//CARGA DEL TECLADO DOS STRING
	String cargarString() {
		
		System.out.println("Ingrese dos cadenas de texto: ");
		String cadenaIngresada = entrada.next();
		
		return cadenaIngresada;
	}
	
	//DESPLIEGUE MENU//
	void menu(String a, String b) {
		
		
		String cade1 = a;
		String cade2 = b;
		int op;
		
		do {
			
			System.out.println("1.Imprimir ambas cadenas y su largo");
			System.out.println("2.Comparar igualdad y quien es menor");
			System.out.println("3.Cambiar una cadena a todo mayúsculas y otra a todo minúsculas");
			System.out.println("4.Cargar nuevamente ambos String");
			System.out.println("0.Salir");
			
			System.out.println("");
			
			System.out.println("Ingrese una opcion: ");
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("La primera cadena es: " + cade1 + " y su largo es: " + cade1.length());
				System.out.println("La segunda cadena es: " + cade2 + " y su largo es: " + cade2.length());
				System.out.println("");
				break;
				
			case 2:
				
				if (cade1.compareTo(cade2) == 0) {
				    System.out.println("Las cadenas son iguales");
				    System.out.println("");
				} else {
				    if (cade1.compareTo(cade2) < 0) {
				        System.out.println("La primera cadena es menor que la segunda");
				        System.out.println("");
				    } else {
				        System.out.println("La segunda cadena es menor que la primera");
				        System.out.println("");
				    }
				}
				break;
				
			case 3:
				
				System.out.println("Su primera cadena en mayusculas: " + cade1.toUpperCase());
				System.out.println("Su segunda cadena en minusculas: " + cade1.toLowerCase());
				System.out.println("");
				
				break;
				
			case 4:
				
				System.out.println("Ingresa una nueva cadena: ");
				cade1 = entrada.next();
				System.out.println("Ingresa una nueva segunda cadena: ");
				cade2 = entrada.next();
				
				System.out.println("Su nueva cadena es: " + cade1);
				System.out.println("Su nueva segunda cadena es: " + cade2);
				System.out.println("");
				
				break;
				
			case 0:
				System.out.println("Fin del programa...");
				
				break;
			}
					
		} while (op != 0);
		
	}
	
}
