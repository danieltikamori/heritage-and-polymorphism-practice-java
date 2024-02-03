package practice.banking;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double accountBalance = 0;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + accountBalance);
    }
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal of " + amount + " made. Remaining balance is " + accountBalance);
        } else {
            System.out.println("Insufficient funds. Withdrawal not processed.");
        }
    }
    public void showBalance() {
        System.out.println("Your Balance is: " + accountBalance);
    }
}
