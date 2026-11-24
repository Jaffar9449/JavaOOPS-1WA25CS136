import Transaction.Account;
import Report.TransactionReport;

public class Main {
   public static void main(String[] args) {
      Account acc = new Account(101, 5000);

      acc.deposit(2000);
      acc.withdraw(1500);
      acc.withdraw(10000);
      Report.TransactionReport.generate(acc);
   }
}
