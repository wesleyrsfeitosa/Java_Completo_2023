package exercicios03;

import java.io.PrintStream;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.println(" Digite a nota 1: ");
		aluno.nota1 = teclado.nextDouble();
		System.out.println(" Digite a nota 2: ");
		aluno.nota2 = teclado.nextDouble();
		System.out.println(" Digite a nota 3: ");
		aluno.nota3 = teclado.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", aluno.media());

		if (aluno.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.resultado());	
		}
		else {
		System.out.println("PASS");

		}

	}
}
