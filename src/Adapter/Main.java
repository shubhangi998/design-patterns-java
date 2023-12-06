package Adapter;

import Adapter.ThirdParty.YesBankAPI;

public class Main {
    public static void main(String[] args) {
        BankAPIAdapter bankAPI = new ICICIBankAPIAdapter();
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.displayBalance("100400500");
    }
}
