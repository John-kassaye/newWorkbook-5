package MiniProjects.BankAccountManager;

public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(String accountHolder, double balance, double transactionFee) {
        super(accountHolder, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withDraw(double amount){

        double total = amount + transactionFee ;
        if (amount > 0 && getBalance() >= total){
            setBalance(getBalance() - total);

            System.out.println( getAccountHolder() + " total withdrawal with transaction fee is: " + total);
        } else {
            System.out.println("Error:");
        }
    }
}
