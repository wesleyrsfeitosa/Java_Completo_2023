package exercicios07;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println(" How many rooms will be rented? ");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Email: ");
			String email = teclado.next();
			System.out.print("Room: ");
			int roomNumber = teclado.nextInt();

			// Rent rent = new Rent(name, email);

			vect[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms");
		for (int i = 1; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		teclado.close();
	}
}
