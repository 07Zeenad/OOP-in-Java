package abstraction;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1000);
        account.deposit(500);
        account.withdraw(300);
        account.showBalance();
    }
}
