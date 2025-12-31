package model;
import exception.*;

public class SavingsAccount extends Account implements Transactions {
    
    // interest rate of the savings account
    private static final double interest_rate=0.04;

    public SavingsAccount(int accountNumber,String accountHolder, double balance){
        super(accountNumber,accountHolder,balance);
    }

    //interest
    @Override
    public double interest(){
        return getBalance()*interest_rate;
    }

    @Override 
    public void deposit(double amount){
        if(amount<=0)
        {
            throw new InvalidAmountException("Deposit amount must be greater than zero");
        }
        setBalance(getBalance()+amount);
    }

    @Override 
    public void withDraw(double amount){
        if(amount<=0 || amount>getBalance())
        {
            throw new InsufficientBalanceException("Insuficiant balance");
        }
        setBalance(getBalance()-amount);
    }

}
