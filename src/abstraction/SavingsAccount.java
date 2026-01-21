package abstraction;

public class SavingsAccount extends  BankAccount {

    public SavingsAccount(double balance)
    {
        super(balance);
    }
    @Override
    public void deposit(double amount)
  {
      balance += amount ;
      System.out.println(amount + " deposited. New Balance: " + balance);
  }
    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
