package Practico_Metodos_Calculadora;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		CalculadoraEjer1yEjer2 calc = new CalculadoraEjer1yEjer2();
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2;
		
		//pedida de numeros a los usuarios
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();
		
		//pasaje de los numeros a los metodos
		int result1 = calc.suma(num1,num2);
		int result2 = calc.resta(num1,num2);
		int result3 = calc.multi(num1,num2);
		int result4 = calc.division(num1,num2);

		//mostrar en pantalla
		
		System.out.println("El resultado de la suma es: " + result1);
		System.out.println("El resultado de la resta es: " + result2);
		System.out.println("El resultado de la multiplicacion es: " + result3);
		System.out.println("El resultado de la division es: " + result4); 
	} 

}
