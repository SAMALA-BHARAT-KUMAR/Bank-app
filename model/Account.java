package model;
public abstract class Account {
    
        // encapsulated variables
        private int accountNumber;
        private String accountHolderName;
        private double balance;

        //default constructer
        public Account(){
            System.out.println("Default constructer called!!!");
        }

        //original constructer
        public Account(int accountNumber,String accountHolderName,double balance){

            setAccountNumber(accountNumber);
            setAccountHolderName(accountHolderName);
            setBalance(balance);

        }

        //getters
        public int getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }
        
        //setters
        public void setAccountNumber(int accountNumber) {
            if(accountNumber<=0)
            {
                System.out.println("invalid account number!!!!");
                return;
            }
            this.accountNumber = accountNumber;
        }

        public void setAccountHolderName(String accountHolderName) {
            if(accountHolderName==null || accountHolderName.isEmpty())
            {
                System.out.println("Enter the valid Account holder Name!!!");
                return;
            }
            this.accountHolderName = accountHolderName;
        }

        public void setBalance(double balance) {
            if(balance<0)
            {
                System.out.println("Enter the valid balance!!");
                return;
            }
            this.balance = balance;
        }

        //complete account information
        public void display(){
            System.out.println("Account Number :"+accountNumber);
            System.out.println("Account Holder name :"+accountHolderName);
            System.out.println("Account balance :"+balance);

        }

        //display method for the balance
        public void displayBalance(){
            System.out.println("Balance : "+balance);
        }
        

        // abstraction
        public abstract double interest();
        

}
