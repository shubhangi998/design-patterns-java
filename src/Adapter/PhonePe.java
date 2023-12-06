package Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;
    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void displayBalance(String accountNumber){
        System.out.println( bankAPI.getBalance(accountNumber) );
    }
}
