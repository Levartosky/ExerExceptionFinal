package application;


import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.*;

public class Program {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	
		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		System.out.println("Enter the name of holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.println("Enter the balance: ");
		double balance = sc.nextDouble();
		System.out.println("Enter the withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account (number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
		account.withdraw(amount);
		System.out.println("New balance: "+ String.format("%.2f", account.getBalance()));
		
		}
		
		
		catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
