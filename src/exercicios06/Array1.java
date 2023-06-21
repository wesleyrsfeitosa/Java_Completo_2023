package exercicios06;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = teclado.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite um numero: ");
			vetor[i] = teclado.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
			
		
teclado.close();
	}

}
