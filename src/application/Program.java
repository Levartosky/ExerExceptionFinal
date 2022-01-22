package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.*;

public class Program {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
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
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("New balance: "+ account.getBalance());
		
		}
		
		
		catch (DomainException e) {
			System.out.println("Error message: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
