package AdapterPattern.thirdparty;

public class YesBankApi {
    public double getBalance(String accountNo){
        return 0;
    }

    public boolean transferMoney(String fromAccount, String toAccount, double amount){
        return true;
    }
}
