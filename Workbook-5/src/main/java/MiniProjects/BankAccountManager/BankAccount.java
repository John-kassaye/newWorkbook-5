package MiniProjects.BankAccountManager;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance+= amount;
            System.out.println("You deposited $" + amount);
        } else {
            System.out.println("Invalid input");
        }
    }

    public void withDraw(double amount){
        if (amount > 0){
            balance-= amount;
            System.out.println("You withdraw $" + amount);
        } else {
            System.out.println("Invalid input");
        }
    }

    public String format(){
        return String.format("%-60s Account Holder" , accountHolder)+
                String.format("%-60s Balance" , balance);
    }
}
