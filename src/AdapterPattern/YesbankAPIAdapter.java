package AdapterPattern;

import AdapterPattern.thirdparty.YesBankApi;

public class YesbankAPIAdapter implements BankApi{
    private YesBankApi yesBankApi = new YesBankApi();

    @Override
    public double showBalance(String accountNo) {
        return yesBankApi.getBalance(accountNo);
    }

    @Override
    public boolean SendMoney(String fromAccount, String toAccount, double amount) {
        return yesBankApi.transferMoney(fromAccount, toAccount, amount);
    }
}
