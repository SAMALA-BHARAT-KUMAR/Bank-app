package model;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public class CurrentAccount extends Account implements Transactions{
    
    // constant variable
    private static final double interest_rate=0.01;

    // chaining
    public CurrentAccount(int accountNumber,String accountHolder, double balance){
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
            throw new InvalidAmountException("Invalid amount");
        }
        setBalance(getBalance()+amount);
    }

    @Override 
    public void withDraw(double amount){
        if(amount<=0 || amount>getBalance())
        {
            throw new InsufficientBalanceException("Insufficiant balance");
        }
        setBalance(getBalance()-amount);
    }

}
