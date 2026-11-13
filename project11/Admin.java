import java.util.*;
import java.io.*;

public class Admin extends User implements HasMenu, Serializable {
  
  public static void main(String[] args){
    Admin a = new Admin();
    a.login();
  } // end of main

  public Admin(){
    this.userName = "Admin";
    this.PIN = "0000";
  } // end of Admin

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("-Admin menu-");
    System.out.println();
    System.out.println("0) Exit ");
    System.out.println("1) Full Customer Report ");
    System.out.println("2) Add User ");
    System.out.println("3) Apply user interest ");
    System.out.println();
    System.out.print("Action: ");
    String result = input.nextLine();

    return result;
  } // end of String menu()
  
  public void start(){

  } // end of start // ADD LATER.

  public String getReport(){
    String report = "Admin userName: " + this.getUserName();
    report += ", Admin PIN: " + this.getPIN();
    
    return report;
  } // end of getReport()

} // end of Admin class
