import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
  static final long serialVersionUID = 1l;

  CheckingAccount checking = new CheckingAccount();
  SavingsAccount savings = new SavingsAccount();

  public static void main(String[] args){
    Customer c = new Customer();
    if (c.login()){
      c.start();
    } // end of if
  } // end of main

  public Customer(){
    this.userName = "Alex";
    this.PIN = "1234";
  } // end of constructor
  
  public Customer(String userName, String PIN){
    this.userName = userName;
    this.PIN = PIN;
  } // end of Customer

  public String getReport(){
    String report = "User: " + this.getUserName();
    report += ", Checkings: " + this.checking.getBalanceString();
    report += ", Savings: " + this.savings.getBalanceString();
    return report;
  } // end of getReport
  
  public void changePIN(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter new PIN: ");
    String newPIN = input.nextLine();
    setPIN(newPIN);
    System.out.println("New PIN is: " + this.PIN);
  } // end of changePIN

  public void start(){
    boolean keepGoing = true;
    String result;
    while(keepGoing){
      result = menu();
      if (result.equals("0")){
        keepGoing = false;
      } else if (result.equals("1")){
        System.out.println();
        System.out.println("Checking Account: ");
	this.checking.start();
      } else if (result.equals("2")){
        System.out.println();
        System.out.println("Savings Account: ");
	this.savings.start();
      } else if (result.equals("3")){
        System.out.println();
        System.out.println("Change PIN: ");
	changePIN();
      } else {
        System.out.println("Please enter 0, 1, 2, or 3 as input...");
      }
    }
  } // end of start

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("-Customer menu-");
    System.out.println();
    System.out.println("0) Quit ");
    System.out.println("1) Manage Checking Account ");
    System.out.println("2) Manage Savings Account ");
    System.out.println("3) Change PIN ");
    System.out.println();
    System.out.print("Enter a number 0-3 to select: ");
    String result = input.nextLine();

    return result;
  } // end of menu
  
} // end of Customer
