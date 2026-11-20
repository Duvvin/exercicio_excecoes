package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do proprietário: ");
		String holder = sc.nextLine();
		System.out.println("Insira o saldo inicial da conta: ");
		double balance = sc.nextDouble();
		System.out.println("Insira o limite de saque diário: ");
		double limitWithdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, limitWithdraw);
		System.out.println("New Balance: " + acc.getBalance());
		
		System.out.println("Entre com a quantia que deseja sacar: ");
		double withdraw = sc.nextDouble();
		acc.setBalance(withdraw);
		System.out.println("New Balance: " + acc.getBalance());
		
		sc.close();
		} 
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
	}
}
