package Transaction;

public class Account{
   public int accountNumber;
   public double balance;
   public double totalDeposited = 0;
   public double totalWithdrawn = 0;
   
   public Account(int accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
   }

   public void deposit(double amount) {
      balance += amount;
      totalDeposited += amount;
      System.out.println("Deposited: " + amount);
   }

   public void withdraw(double amount) {
      if (amount > balance) {
         System.out.println("Insufficient balance");
      } else {
         balance -= amount;
         totalWithdrawn += amount;
         System.out.println("Withdrawn: " + amount);
      }
   }
}