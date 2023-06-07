package aula04_estaticos;

import java.util.Scanner;

public class Program {

	

	public static void main(String[] args) {
		
	//	Calculator calc = new Calculator();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Entre com o valor do raio: ");
		double radius = teclado.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI values: %.2f%n", Calculator.PI);

		teclado.close();

	}

	
}
