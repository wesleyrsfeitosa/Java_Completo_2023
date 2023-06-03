package exercicios02;

public class Employee {
	String Name;
	double GlossSalary;
	double Tax;
	
	public double netSalary() {
		return GlossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GlossSalary += (GlossSalary * percentage ) / 100;
		
		
		
		
		
	}

	@Override
	public String toString() {
		return Name + ", $ " + netSalary() ;
	}

}
