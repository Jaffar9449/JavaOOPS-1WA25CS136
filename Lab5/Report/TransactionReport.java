package Report;

import Transaction.Account;

public class TransactionReport {
   public static void generate(Account a) {
      System.out.println("\n--- Transaction Report ---");
      System.out.println("Account Number : " + a.accountNumber);
      System.out.println("Total Deposited : " + a.totalDeposited);
      System.out.println("Total Withdrawn : " + a.totalWithdrawn);
      System.out.println("Current Balance : " + a.balance);
   }
}