package aula05_construtores;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Price: ");
		double price = teclado.nextDouble();	
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be adden in stosk: ");
		int quantity = teclado.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be remove from stock");
		quantity = teclado.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);

		// System.out.println(product.toString());

		// System.out.println(product.name + ", " + product.price + ", " +
		// product.quantity);

		teclado.close();
	}

}
