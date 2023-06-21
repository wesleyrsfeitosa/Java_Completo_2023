package exercicios06;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = teclado.nextInt();
		
		double[] vetor = new double[n];
		
		double maiorValor = 0;
		int posicaoMaiorValor = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextInt();
			
			
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicaoMaiorValor = i;
			}

		}
		System.out.println();
		System.out.printf("MAIOR VALOR =  %.1f", maiorValor);
		System.out.println();
		System.out.printf("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
	
		
		
		teclado.close();
	}

}
