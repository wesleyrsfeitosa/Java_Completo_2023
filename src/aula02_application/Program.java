package aula02_application;

import java.util.Scanner;

import aula02_entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle x: ");
		System.out.println("Digite o valor de xA");
		x.a = teclado.nextDouble();
		System.out.println("Digite o valor de xB");
		x.b = teclado.nextDouble();
		System.out.println("Digite o valor de xC");
		x.c = teclado.nextDouble();

		System.out.println("Enter the measures of triangle y: ");
		System.out.println("Digite o valor de yA");
		y.a = teclado.nextDouble();
		System.out.println("Digite o valor de yB");
		y.b = teclado.nextDouble();
		System.out.println("Digite o valor de yC");
		y.c = teclado.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);

		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Lager area: X");
		} else {
			System.out.println("Lager area: Y");
		}

		teclado.close();
	}

}
