package exercicios04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		CurrencyConverter cD = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cD.valorDolar = teclado.nextDouble();
		
		System.out.print("How many dollars will be vought?  ");
		cD.quantidadeDolar = teclado.nextDouble();
		
		double resultado = cD.valorReais() + cD.taxa();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", resultado));


	}

}
