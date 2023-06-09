package exercicios05;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);	
	
	Account account;
	System.out.print("Enter account number: ");
	int number = teclado.nextInt();
	
	System.out.println("Enter account holder: ");
	teclado.nextLine();
	String holder = teclado.nextLine();
	
	System.out.println("Is there na initial deposit (y/n)? ");
	char response = teclado.next().charAt(0);
	
	if(response == 'y') {
	System.out.println("Enter initial deposit value: ");	
	double initialDeposit = teclado.nextDouble();
	account = new Account(number, holder, initialDeposit);
	}
	else {
		account = new Account(number, holder);
	}
	System.out.println();
	System.out.println("Account data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a deposit value: ");
	double depositValue = teclado.nextDouble();
	account.deposit(depositValue);
	System.out.println("Update account data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a withdraw value: ");
	double withdrawValue = teclado.nextDouble();
	account.withdraw(withdrawValue);
	System.out.println("Update account data: ");
	System.out.println(account);
	
	
	teclado.close();
	}

}
