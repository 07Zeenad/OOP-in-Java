package abstraction;

abstract class BankAccount {
    protected double balance ;

    public BankAccount(double balance)
    {
        this.balance = balance ;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void showBalance()
    {
        System.out.println("Total Balance is : " + balance);
    }

}
