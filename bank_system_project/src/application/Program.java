package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;

public class Program {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Client client = new Client();

		System.out.print("Login: ");
		String login = sc.nextLine().toLowerCase();

		System.out.print("Password: ");
		String password = sc.nextLine().toLowerCase();

		if (login.equals("admin") && password.equals("admin")) {
			try {
				StringBuilder menu = new StringBuilder();
				menu.append("+------------------------+").append(System.lineSeparator());
				menu.append("|          MENU          |").append(System.lineSeparator());
				menu.append("+------------------------+").append(System.lineSeparator());
				menu.append("| 1 - Deposit            |").append(System.lineSeparator());
				menu.append("| 2 - Withdraw           |").append(System.lineSeparator());
				menu.append("| 3 - Check Balance      |").append(System.lineSeparator());
				menu.append("| 4 - Show Informations  |").append(System.lineSeparator());
				menu.append("| 5 - Exit               |").append(System.lineSeparator());
				menu.append("+------------------------+").append(System.lineSeparator());

				System.out.println(menu);
				System.out.print("Choose an option: ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("How much do you want to deposit? ");
					Double amount = sc.nextDouble();
					client.deposit(amount);
					break;
				case 2:
					System.out.print("How much do you want to withdraw? ");
					amount = sc.nextDouble();
					client.deposit(amount);
					break;
				case 3:
					client.checkBalance();
					break;
				case 4:
					client.showInformations();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					break;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Invalid Format!");
				Thread.sleep(1200);
				Program.main(args);
			}

		} else {
			System.out.println();
			System.out.println("Invalid option. Please try again.");
			Thread.sleep(1200);
			Program.main(args);
		}

		sc.close();
	}
}
