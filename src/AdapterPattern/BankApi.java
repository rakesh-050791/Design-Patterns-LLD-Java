package AdapterPattern;

public interface BankApi {
    public double showBalance(String accountNo);

    public boolean  SendMoney(String fromAccount, String toAccount, double amount);
}
