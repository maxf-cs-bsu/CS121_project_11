import java.util.*;

public class SavingsAccount extends CheckingAccount {
  double interestRate = .05d;

  public static void main(String[] args){
    SavingsAccount sa = new SavingsAccount();
    sa.start();
  } // end of main
  
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  } // end of setInterestRate
  
  public double getInterestRate(){
    return this.interestRate;
  } // end of getInterestRate

  public void calcInterest(){
    double interestAmount = this.balance * this.interestRate;
    this.balance += interestAmount;
    System.out.println("New balance: " + this.getBalanceString());
  } // end of calcinterest

} // end of SavingsAccount
