package exercicios08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		// PART 1 - READING DATA:
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");

			System.out.print("id: ");
			Integer id = teclado.nextInt();
			while (hasId(list, id)) {
				System.out.println("Esse ID ja existe, tente novamente!");
				System.out.print("id: ");
				id = teclado.nextInt();
			}

			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();

			System.out.print("Salary: ");
			Double salary = teclado.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);

		}

		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int idsalary = teclado.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		// Integer pos = position(list, idsalary);

		if (emp == null) {
			System.out.println("Esse ID não existe!");
		} else {
			System.out.print("Entre com a porcentagem:");
			double percent = teclado.nextDouble();
			emp.increaseSalary(percent);
			// list.get(emp).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employee:");
		for (Employee e : list) {
			System.out.println(e);
		}

		teclado.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;

	}
}
