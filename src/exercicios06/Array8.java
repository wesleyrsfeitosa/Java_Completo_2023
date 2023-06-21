package exercicios06;

import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = teclado.nextInt();
		
		int[] vetor = new int[n];
		
		int pares = 0;
		double mediaPares = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextInt();
			
			if(vetor[i] % 2 == 0) {
				pares+=1;
				mediaPares+=vetor[i];
				}
		}
		
		
		
		if(mediaPares > 0) {
			mediaPares = mediaPares / pares;
		System.out.printf("MEDIA DOS PARES %.2f", mediaPares);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		teclado.close();
	}

}
