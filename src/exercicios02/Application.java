package exercicios02;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Employee Emp = new Employee();
		
		System.out.println("Name: ");
		Emp.Name = teclado.nextLine();
		
		System.out.println("Gloss Salary: ");
		Emp.GlossSalary = teclado.nextDouble();
		
		System.out.println("Tax: ");
		Emp.Tax = teclado.nextDouble();
		
		
		System.out.println();
		System.out.println("Employee: kkk" + Emp);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = teclado.nextDouble();
		
		Emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + Emp);
	
		
		
		
		
		
		
		teclado.close();

	}

}
