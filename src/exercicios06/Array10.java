package exercicios06;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Quantos alunos serão digitados? ");
		int n = teclado.nextInt();

		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		double media;
		for (int i = 0; i < n; i++) {

			System.out.println("Digite nome, primeira e segunda nota do  " + (i + 1) + "º" + " aluno");
			teclado.nextLine();

			System.out.print("Nome: ");
			aluno[i] = teclado.nextLine();

			System.out.print("Nota1: ");
			nota1[i] = teclado.nextDouble();
			System.out.print("Nota2: ");
			nota2[i] = teclado.nextDouble();
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < aluno.length; i++) {

			media = (nota1[i] + nota2[i]) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", aluno[i]);

			}
		}

		teclado.close();
	}

}
