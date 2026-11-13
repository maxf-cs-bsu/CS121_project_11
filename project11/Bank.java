import java.util.*;
import java.io.*;

public class Bank implements HasMenu {
  Admin admin = new Admin();
  CustomerList customers = new CustomerList();
  
  public static void main(String[] args){
    new Bank();
  } // end of main
  
  public Bank(){
    this.start();
  } // end of constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("-Bank menu-");
    System.out.println();
    System.out.println("0) Quit ");
    System.out.println("1) Login as Admin ");
    System.out.println("2) Loging as Customer ");
    System.out.println();
    System.out.print("Enter a number 0-2 to select: ");
    String result = input.nextLine();

    return result;
  } // end of menu
  
  public void start(){
    boolean keepGoing = true;
    while(keepGoing){
      String result = menu();
      if (result.equals("0")){
        keepGoing = false;
      } else if (result.equals("1")){
        System.out.println("Admin menu");
      } else if (result.equals("2")){
        System.out.println("Customer menu");
      } else {
        System.out.println("Please enter 0, 1, or 2...");
      } // end of if
    } // end of while
  } // end of start
  

} // end of Bank class

class CustomerList extends ArrayList<CustomerList> {};
