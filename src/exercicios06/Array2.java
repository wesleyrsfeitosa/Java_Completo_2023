package exercicios06;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = teclado.nextInt();

		double[] vetor = new double[n];

		double soma = 0;
		double media = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextDouble();
			soma += vetor[i];

		}
		media = soma / n;

		System.out.printf("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		System.out.printf("SOMA = %.2f " , soma);
		System.out.println();
		System.out.printf("MEDIA = %.2f " , media);
		
		teclado.close();
	}

}
