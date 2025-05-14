package MiniProjects.BankAccountManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new SavingsAccount("John",20000,0.05));
        bankAccountList.add(new SavingsAccount("austin",78400,0.2));
        bankAccountList.add(new CheckingAccount("Jose", 100000,100));
        bankAccountList.add(new CheckingAccount("mata", 300000,400));

        for (BankAccount bankAccount : bankAccountList){
            bankAccount.withDraw(20);
            bankAccount.deposit(1000);
            System.out.println( bankAccount.getAccountHolder() + "'s balance: " + bankAccount.getBalance() + "\n");

        }

        for (BankAccount bankAccount : bankAccountList){
            if (bankAccount instanceof SavingsAccount){
                SavingsAccount savingsAccount = (SavingsAccount) bankAccount;
                savingsAccount.applyInterest();
            }
        }
    }
}
