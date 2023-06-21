package exercicios06;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Quantos valores vai ter cada vetor? ");
		int n = teclado.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		

		int soma = 0;
		System.out.println("Digite os valores do vetor A: ");
		for (int a = 0; a < vetorA.length; a++) {
			vetorA[a] = teclado.nextInt();
			
		}
			System.out.println("Digite os valores do vetor B: ");
			for (int b = 0; b < vetorB.length; b++) {
				vetorB[b] = teclado.nextInt();
				
			}
			System.out.println("VETOR RESULTANTE: ");
			for (int c = 0; c < vetorC.length; c++) {
				soma = vetorA[c] + vetorB[c];
				System.out.println(soma);	
		}

		
	teclado.close();	
	}

}
