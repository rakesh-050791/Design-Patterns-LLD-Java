package AdapterPattern;

import AdapterPattern.thirdparty.HDFCBankApi;

public class HDFCBankAPIAdapter implements BankApi{
    private HDFCBankApi hdfcapi = new HDFCBankApi();

    @Override
    public double showBalance(String accountNo) {
        return hdfcapi.getBalance(accountNo);
    }

    @Override
    public boolean SendMoney(String fromAccount, String toAccount, double amount) {
        return hdfcapi.transferMoney(fromAccount, toAccount, amount);
    }
}
