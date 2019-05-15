/* Program for BankAccount data including deposits and withdrawals.
   Running balance is kept along the way and displayed at program end */

/*
 * Prompt the user to show the changes in the balances
 */
import java.util.Scanner;
/**
 * Jorell Socorro 2/21 Lab2
 */
public class BankAccount {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // programs local variables
    int acctNum = 0;
    double acctBal = 0.0, currency = 0.0;
    double checks = 0.0, coins = 0.0;
    double newBal = 0.0, withdraw = 0.0;
    Scanner sc = new Scanner(System.in);
    // the program header
    System.out.println("<< Bank Account >>");
    System.out.println("------------------");
    System.out.println(" ");
    // prompt user for data and receive data
    System.out.println("please enter your account number");
    acctNum = sc.nextInt();
    System.out.println("your account number " + acctNum);
    //You can type any value, but must stay within what you inputed
    System.out.println("please enter your account balance");
    acctBal = sc.nextDouble();
    System.out.printf("**account balance %6.2f\n" , acctBal);
    //Give any value that will add to the balance
    
    System.out.println("please enter the cash deposit amount");
    currency = sc.nextDouble();
    System.out.printf("**deposit amount (cash) $%6.2f\n" ,currency);
  //Here you show the current balance in cash
    System.out.println("Current Balance with cash deposit:$"+(currency+acctBal));
    
    System.out.println("please enter the check deposit amount");
    checks = sc.nextDouble();
    System.out.printf("**deposit amount (checks) $%6.2f\n" ,checks);
  //Show Current Balance in checks  
    System.out.println("Current Balance with check deposit:$"+(checks+acctBal));
    
    System.out.println("please enter the coins deposit amount");
    coins = sc.nextDouble();
    System.out.printf("**deposit amount (coins) $%6.2f\n" ,coins);
   //Show Current Balance in checks
    System.out.println("Current Balance after coins:$"+(coins+acctBal));
    
  //Variable grabs all of the deposits and adds them all up
    newBal = acctBal+currency+checks+coins;
  //Show the total balance after all of the deposits
    System.out.println("New Account Balance:$"+(newBal));
    
    System.out.println("please enter the withdrawal amount");
    withdraw = sc.nextDouble();
    System.out.printf("**withdrawal amount (cash) $%6.2f\n" ,withdraw);
    //Displays The final balance
    System.out.println("New Account Balance:$"+(newBal-withdraw));
    // the program footer
    System.out.println(" ");
    System.out.println("thank you!");
    System.out.println("------------------");
    }
}
