/**
 * BankAccount class represents an individual bank account.
 * simulate basic bank operations such as
 * deposit, withdrawal, and account display.
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
public class BankAccount
{
    // instance variables 
    private String accountName;
    private String accountNumber;
    private int pinNumber;
    private double depositAmount;
    private double interestRate;
    private static int staticCounter = 1000;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(String accountName, int pinNumber,double depositAmount,double interestRate)
    {
        this.accountName = accountName;
        this.pinNumber = pinNumber;
        this.depositAmount = depositAmount;
        this.interestRate = interestRate;
        this.accountNumber = "ACC" + ++staticCounter;
    }
    
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount!!! Cannot add to the account");
            return;
        }
        
        depositAmount += amount;
        System.out.println("Amount : "+amount +" added to the account");
    }
    
    double withdraw(int PIN, double amount){
        if(PIN != this.pinNumber){
            System.out.println("Invalid PIN");
            return 0;
        }
        else if(amount <= 0){
            System.out.println("Invalid Amount");
            return 0;
        }
        else if(amount > depositAmount){
            System.out.println("Insufficient Funds");
            return 0;
        }
        
        depositAmount -= amount;
        
        return amount;
    }
    
    void displayAccount(int PIN){
        if(PIN != this.pinNumber){
            System.out.println("Wrong PIN!!! Access Denied !!!");
            return;
        }
        String str = "Account Name :: "+accountName+"\nAccount NUmber :: "+accountNumber
                        +"\nBalance :: "+depositAmount+"\tInterest rate :: "+interestRate;
                        
        System.out.println(str);
    }
    
    double checkBalance(){
        return depositAmount;
    }
    
    boolean checkPin(int pin) {
        return this.pinNumber == pin;
    }
}
