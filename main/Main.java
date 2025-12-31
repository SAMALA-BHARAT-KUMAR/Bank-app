package main;

import java.util.HashMap;
import model.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        HashMap<Integer,Account> map=new HashMap<>();

        Account acc1 = new SavingsAccount(1, "samala bharat", 1000);
        map.put(1,acc1);
        Account acc2 =new CurrentAccount(2, "Kalavathi", 100000);
        map.put(2,acc2);

        boolean running = true;

        try (Scanner sc = new Scanner(System.in)) {

            while (running) {

                System.out.println("Enter the account Number : ");
                int accountNumber=sc.nextInt();
               
                Account acc=map.get(accountNumber);

                if(acc==null)
                {
                    System.out.println("Account not found!!");
                    System.out.println("Do you want to continue? (yes/no)");
                    String response=sc.next();
                    if(response=="yes")
                    {
                        continue;
                    }
                    else{
                        break;
                    }

                }

                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Check Interest");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                System.out.println("\n===== BANK MENU =====");
                int choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1: // ⚫ case Deposit
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = sc.nextDouble();
                            ((Transactions)acc).deposit(depositAmount);
                            System.out.println("Deposit successful");
                            break; // ⚫ END case 1

                        case 2: // ⚫ case Withdraw
                            System.out.print("Enter withdraw amount: ");
                            double withdrawAmount = sc.nextDouble();
                            ((Transactions)acc).withDraw(withdrawAmount);
                            System.out.println("Withdraw successful");
                            break; // ⚫ END case 2

                        case 3: // ⚫ case Balance
                            acc.displayBalance();
                            break; // ⚫ END case 3

                        case 4: // ⚫ case Interest
                            System.out.println("Interest: " + acc.interest());
                            break; // ⚫ END case 4

                        case 5: // ⚫ case Exit
                            running = false;
                            System.out.println("Thank you for using the bank system!");
                            break; // ⚫ END case 5

                        default:
                            System.out.println("Invalid choice");

                    } // 🟡 END switch

                } // inner try

                catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } // while

        } // try with resources

        finally {
            System.out.println("Thank you for using the Application visit us once again!!!");
        } // finally

    } // main

} // class
