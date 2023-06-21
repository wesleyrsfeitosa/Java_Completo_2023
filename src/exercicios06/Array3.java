package exercicios06;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Quantas pessoas serão digitadas? ");
		int n = teclado.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		double media = 0;
		double porcentagem = 0;

		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a" + " pessoa");
			System.out.printf("Nome: ");
			nome[i] = teclado.next();
			System.out.printf("Idade: ");
			idade[i] = teclado.nextInt();
			System.out.printf("Altura: ");
			altura[i] = teclado.nextDouble();
			System.out.println();

			media += altura[i];

			if (idade[i] < 16) {
				porcentagem += 1;
			}

		}
		media = media / n;
		porcentagem = porcentagem * 100 / n;
		System.out.printf("Altura média: %.2f" , media);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% ", porcentagem);
		System.out.println();
		for (int i = 0; i < n; i++) {

			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		teclado.close();
	}

}
