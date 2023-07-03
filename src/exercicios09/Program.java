package exercicios09;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int l = teclado.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int c = teclado.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print("Digite o valor da " + (i + 1) + " linha ");
				mat[i][j] = teclado.nextInt();
			}
		}
		System.out.println("Diagonal Principal");
		for (int i = 0; i < l; i++) {

			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]<0) {
					cont++;
				}
			}

		}

		System.out.print("Numeros negativos : " + cont);
		teclado.close();
	}

}
