import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable {
  double balance;

  public static void main(String[] args){
    CheckingAccount ca = new CheckingAccount();
    ca.start();
  } // end of main
  
  public CheckingAccount(){
    this.balance = 0d;
  } // end of constructor 1
  
  public CheckingAccount(double balance){
    this.balance = balance;
  } // end of constructor 2

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("-Account Menu-");
    System.out.println();
    System.out.println("0) Quit ");
    System.out.println("1) Check Balance ");
    System.out.println("2) Make a Deposit ");
    System.out.println("3) Make a Withdrawal ");
    System.out.println();
    System.out.print("Enter a number 0-3 to select: ");
    String response = input.nextLine();
    System.out.println();
    return response;
  } // end of string menu
  
  public void start(){
    boolean keepGoing = true;
    String response;
    while(keepGoing){
      response = menu();
      if(response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
        //System.out.println("  Checking Balance... ");
	this.checkBalance();
      } else if (response.equals("2")){
        //System.out.println("  Making a Deposit... ");
        this.makeDeposit();
      } else if (response.equals("3")){
        //System.out.println("  Making a Withdrawal... ");
	this.makeWithdrawal();
      } else {
        System.out.println("Response must be 0, 1, 2, or 3...");
      } // end of if
    } // end of while
  } // end of start
 
  public double getBalance(){
    return this.balance;
  } // end of getBalance
  
  public String getBalanceString(){
    String result = String.format("$%.02f", this.balance);
    return result;
  } // end of getBalancestring

  public void setBalance(double balance){
    this.balance = balance;
  } // end of setBalance
  
  private double getDouble(){
    Scanner input = new Scanner(System.in);
    String resultString = input.nextLine();
    double result = 0d;
    try {
      result = Double.parseDouble(resultString);
    } catch (Exception e){
      System.out.println("Error: illegal input. Changing to 0");
      result = 0d;
    } // end try
    return result;
  } // end of double

  public void checkBalance(){
    System.out.print("Current Balance: ");
    System.out.println(this.getBalanceString());
  } // end of checkBalance
  
  public void makeDeposit(){
    System.out.print("Enter amount to deposit: ");
    double deposit = this.getDouble();
    this.balance += deposit;
    System.out.println("New Balance: " + this.getBalanceString());
  } // end of makeDeposit

  public void makeWithdrawal(){
    System.out.print("Enter amount to withdrawl: ");
    double withdrawal = this.getDouble();
    if (withdrawal > this.balance){
      System.out.println("Insufficient funds...");
    } else {
      this.balance -= withdrawal;
    } // end if
    System.out.println("New Balance: " + this.getBalanceString());
  } // end of makeWithdrawl

} // end of CheckingAccount class
