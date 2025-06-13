/**
 * Use class for BankAccount class
 *
 * @author (21stcenturymazdoor)
 * @version (13/06/2025)
 */
import java.util.Scanner;

public class UseBankAccount
{
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw money");
        System.out.println("4.Check Balance");
        System.out.print("Enter your choice :: ");
    }
    
    static BankAccount createBankAccount(Scanner sc){
        System.out.print("Enter Account Name :: ");
        String accName = sc.nextLine();
        System.out.print("Enter 4 digit PIN :: ");
        int pin = sc.nextInt();
        System.out.print("Enter Deposit Amount :: ");
        double amount= sc.nextDouble();
        System.out.print("Enter Interest Rate :: ");
        double interest= sc.nextDouble();
        sc.nextLine();
        return new BankAccount(accName, pin , amount, interest);
    }
    
    public static void main(String[] args){
        System.out.println("---Straight Line---");
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Creating account 1...");
        BankAccount bank1 = createBankAccount(sc);
        
        System.out.println("Creating account 2...");
        BankAccount bank2 = createBankAccount(sc);
        
        int choice;
        
        while(true){
            menu();
            choice = sc.nextInt();
            
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    BankAccount selected = null;
                    if (bank1 != null && bank1.checkPin(pin)) selected = bank1;
                    else if (bank2 != null && bank2.checkPin(pin)) selected = bank2;

                    if (selected != null) {
                        selected.displayAccount(pin);
                    } else {
                        System.out.println("Invalid PIN.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    BankAccount selected = null;
                    if (bank1 != null && bank1.checkPin(pin)) selected = bank1;
                    else if (bank2 != null && bank2.checkPin(pin)) selected = bank2;

                    if (selected != null) {
                        System.out.print("Enter deposit amount: ");
                        double amt = sc.nextDouble();
                        selected.deposit(amt);
                    } else {
                        System.out.println("Invalid PIN.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    BankAccount selected = null;
                    if (bank1 != null && bank1.checkPin(pin)) selected = bank1;
                    else if (bank2 != null && bank2.checkPin(pin)) selected = bank2;

                    if (selected != null) {
                        System.out.print("Enter withdraw amount: ");
                        double amt = sc.nextDouble();
                        double withdrawn = selected.withdraw(pin, amt);
                        if (withdrawn > 0) {
                            System.out.println("Withdrawn: " + withdrawn);
                        }
                    } else {
                        System.out.println("Invalid PIN.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    BankAccount selected = null;
                    if (bank1 != null && bank1.checkPin(pin)) selected = bank1;
                    else if (bank2 != null && bank2.checkPin(pin)) selected = bank2;

                    if (selected != null) {
                        System.out.println("Balance: " + selected.checkBalance());
                    } else {
                        System.out.println("Invalid PIN.");
                    }
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
