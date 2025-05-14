package MiniProjects.BankAccountManager;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println(getAccountHolder() + " earned interest: $" + interest);
    }

    @Override
    public void withDraw(double amount){

            if (amount > 0 && getBalance() >= amount){
                setBalance(getBalance() - amount);
                System.out.println( getAccountHolder() + " withdrawal amount $" + amount);
            } else {
                System.out.println("Invalid input");
            }
    }
}
