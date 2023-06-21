package exercicios06;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Quantos pessoas serão digitadas? ");
		int n = teclado.nextInt();
		
		double[] altura = new double[n];
		char[] genero= new char[n];
		
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da " + (i+1) + "ª pessoa ");
			altura[i] = teclado.nextDouble();
			System.out.printf("Genero da " + (i+1) + "ª pessoa ");
			genero[i] = teclado.next().charAt(0);
		}
			
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for(int i = 0; i < n; i++) {
			
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (altura[i] < menorAltura ) {
				menorAltura = altura[i];
			}
			
		}
		
		double media= 0;
		int homens= 0;
		int mulheres =0;
		for(int i = 0; i < n; i++) {
			if(genero[i] == 'm') {
			homens++;
			}
			else{ 
				mulheres++;
			media = media +  altura[i];
			
		}
			}
				
	media = media / mulheres;
	
		System.out.print("Menor Altura = " + menorAltura + "\n");
		System.out.print("Maior Altura = " + maiorAltura + "\n");
		System.out.printf("Media das alturas das mulheres = %.2f ",  media);
		System.out.print("\nNumero de homens = " + homens);
			
		teclado.close();	
		}
	}


