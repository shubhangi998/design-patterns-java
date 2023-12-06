package Adapter;

import Adapter.ThirdParty.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return iciciBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, int amount) {
        return iciciBankAPI.transferMoney( fromAccount,  toAccount,  amount);
    }
}
