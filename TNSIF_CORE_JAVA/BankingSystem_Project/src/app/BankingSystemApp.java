package app;

import model.*;
import service.*;
import java.util.*;

public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingService bank = new BankingServiceImpl();
        int choice;

        do {
            System.out.println("\n---- Banking System ----");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List Accounts by Customer ID");
            System.out.println("7. List Transactions by Account ID");
            System.out.println("8. List Beneficiaries by Customer ID");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    bank.addCustomer(new Customer(cid, name, address, contact));
                    System.out.println("Customer added!");
                }
                case 2 -> {
                    System.out.print("Enter Account ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();
                    bank.addAccount(new Account(aid, cid, type, bal));
                    System.out.println("Account added!");
                }
                case 3 -> {
                    System.out.print("Enter Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Bank Details: ");
                    String bankDetails = sc.nextLine();
                    bank.addBeneficiary(new Beneficiary(bid, cid, name, accNo, bankDetails));
                    System.out.println("Beneficiary added!");
                }
                case 4 -> {
                    System.out.print("Enter Account ID: ");
                    int accId = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Type (Deposit/Withdrawal): ");
                    String type = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    bank.addTransaction(new Transaction(accId, type, amt));
                    System.out.println("Transaction recorded!");
                }
                case 5 -> {
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    Customer c = bank.findCustomerById(id);
                    System.out.println(c != null ? c : "Customer not found!");
                }
                case 6 -> {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    List<Account> accs = bank.getAccountsByCustomerId(cid);
                    accs.forEach(System.out::println);
                }
                case 7 -> {
                    System.out.print("Enter Account ID: ");
                    int accId = sc.nextInt();
                    List<Transaction> trans = bank.getTransactionsByAccountId(accId);
                    trans.forEach(System.out::println);
                }
                case 8 -> {
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    List<Beneficiary> bens = bank.getBeneficiariesByCustomerId(cid);
                    bens.forEach(System.out::println);
                }
                case 9 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 9);
        sc.close();
    }
}
