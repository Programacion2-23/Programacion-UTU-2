package Ejercicios_escrito_1;

import java.util.Scanner;

public class Programa1 {
	Scanner entrada = new Scanner(System.in);
	
	void areaTriangulo() {
		
		float area = 0;
		int base;
		int altura;
		
		System.out.println("Ingrese la base: ");
		base = entrada.nextInt();
		System.out.println("ingrese la altura: ");
		altura = entrada.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("El area del triangulo es: " + area);
		System.out.println("");
		
	}
	
	void areaCirculo() {
		
		int radio;
		
		System.out.println("Ingrese el tamanio del radio: ");
		radio = entrada.nextInt();
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: " + area);
		System.out.println("");
		
	}
	
	void areaCuadrado() {
		double area;
		
		System.out.println("Ingrese el lado de un cuadrado: ");
		int lado = entrada.nextInt();
		
		area = lado * lado;
		
		System.out.println("El area del cuadrado es: " + area);
		
		
	}

}
