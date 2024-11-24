import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Bank Account
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double loanAmount;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.loanAmount = 0.0;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient funds!");
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void applyLoan(double amount) {
        if (amount > 0) {
            loanAmount += amount;
            System.out.println("Loan approved for: $" + amount);
        } else {
            System.out.println("Invalid loan amount!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Loan Amount: $" + loanAmount);
    }
}

// Main class for Banking System
public class BankingSystem {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n*** Banking System Menu ***");
            System.out.println("1. Create Account");
            System.out.println("2. Modify Account");
            System.out.println("3. Check Balance");
            System.out.println("4. Apply for Loan");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    modifyAccount();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    applyForLoan();
                    break;
                case 5:
                    System.out.println("Exiting Banking System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    private static void modifyAccount() {
        System.out.print("Enter Account Number to Modify: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter New Account Holder Name: ");
            String newName = scanner.nextLine();
            account.setAccountHolderName(newName);
            System.out.println("Account updated successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void applyForLoan() {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter Loan Amount: ");
            double loanAmount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account.applyLoan(loanAmount);
        } else {
            System.out.println("Account not found!");
        }
    }

    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
