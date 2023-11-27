package Bank1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // create a new bank account
        BankAccount account = new BankAccount("1234567890", 1000.0, "John Smith", "john.smith@email.com", "123-456-7890");
        
        // display the options
        System.out.println("1. Deposit funds\n2. Withdraw funds\n3. Check balance\n4. Exit");
        
        while (true) {
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}


