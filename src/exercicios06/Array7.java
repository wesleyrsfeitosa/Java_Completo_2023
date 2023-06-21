package exercicios06;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = teclado.nextInt();

		double[] vetor = new double[n];

		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextDouble();
			media += vetor[i];
		}
		System.out.println();
		media = media / n;
		System.out.printf("MEDIA DO VETOR %.3f", media);
		System.out.println();
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.1f", vetor[i]);
				System.out.println();
			}
			
		}
		
		teclado.close();
	}

}
