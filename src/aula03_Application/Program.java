package aula03_Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new  Scanner(System.in);

		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = teclado.nextLine();
		System.out.print("Price: ");
		product.price = teclado.nextDouble();
		System.out.print("Quantity in stock ");
		product.quantity = teclado.nextInt();
		
		
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
		
		//System.out.println(product.toString());
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		teclado.close();
	}

}
