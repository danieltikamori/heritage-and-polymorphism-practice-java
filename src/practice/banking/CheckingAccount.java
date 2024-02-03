package practice.banking;

public class CheckingAccount extends BankAccount {
    private double monthlyFee;
    private boolean isGoldClient;
    private boolean isPlatinumClient;
    private double feePercentage = 1;

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
        feePercentage = isPlatinumClient ? 0.5 : 1;
    }

    public boolean isGoldClient() {
        return isGoldClient;
    }

    public void setGoldClient(boolean goldClient) {
        isGoldClient = goldClient;
    }

    public boolean isPlatinumClient() {
        return isPlatinumClient;
    }

    public void setPlatinumClient(boolean platinumClient) {
        isPlatinumClient = platinumClient;
    }

    public void chargeMonthlyFee() {
        if (isGoldClient) {
            setAccountBalance(getAccountBalance() - monthlyFee);
            System.out.println("Monthly fee of " + monthlyFee + " charged. New balance is " + getAccountBalance());
        } else if (isPlatinumClient) {
            setAccountBalance(getAccountBalance() - monthlyFee * feePercentage);
            System.out.println("Monthly fee of " + monthlyFee * feePercentage + " charged. New balance is " + getAccountBalance());
        }
    }
}
