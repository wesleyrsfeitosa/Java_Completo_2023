package aula01_introducao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá Mundo!");
		int num1, num2;
	
		
		System.out.println("Entre com 1º numero");
		num1 = teclado.nextInt();
		
		System.out.println("Entre com 2º numero");
		num2 = teclado.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma de num1 + num2 é: " + soma);

		teclado.close();
	}

}
