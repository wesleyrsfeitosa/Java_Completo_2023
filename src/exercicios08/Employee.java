package exercicios08;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	//construtor----------------------------------------------------------
	public Employee() {	
	}

	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//get e set----------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//metodos-------------------------------------------
	
	public void increaseSalary(double percentage) {
		this.salary+= (salary / 100) * percentage;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	

}
