package exercicios06;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = teclado.nextInt();
		
		int[] vetor = new int[n];
		
		int pares = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextInt();
			System.out.println();
		}
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
			System.out.printf(vetor[i] + " ");	
			pares+=1;
			}
		}
		System.out.println("\n");
		System.out.printf("QUANTIDADE DE PARES = " + pares );
		
		teclado.close();
	}

}
