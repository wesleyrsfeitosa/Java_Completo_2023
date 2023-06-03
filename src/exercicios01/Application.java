package exercicios01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle Width: ");
		rectangle.width = teclado.nextDouble();
		
		System.out.println("Enter rectangle Height: ");
		rectangle.height = teclado.nextDouble();
		
		
		String result = rectangle.toString();
		
		System.out.println(result);
		
		
		
		
		teclado.close();

	}

}
