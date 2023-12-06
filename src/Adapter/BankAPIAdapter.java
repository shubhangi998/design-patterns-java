package Adapter;

public interface BankAPIAdapter {
    public double getBalance(String accountNumber);
    public boolean sendMoney(String fromAccount, String toAccount, int amount);
}
