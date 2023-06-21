package exercicios06;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas voce vai digitar? ");
		int n = teclado.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		
		double maiorIdade = 0;
		String maisVelho = null;
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Dados da " + (i+1) + "a" + " pessoa");
			System.out.print("Nome: ");
			nome[i] = teclado.next();
			System.out.print("Idade: ");
			idade[i] = teclado.nextInt();
			
			
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maisVelho = nome[i];
			}

		}
		System.out.printf("PESSOA MAIS VELHA: %s", maisVelho);
	
		
		
		teclado.close();
	}

}
