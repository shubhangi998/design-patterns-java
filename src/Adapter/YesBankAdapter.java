package Adapter;

import Adapter.ThirdParty.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.fetchBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, int amount) {
        return yesBankAPI.transaction("transfer",fromAccount,toAccount,amount);
    }
}
