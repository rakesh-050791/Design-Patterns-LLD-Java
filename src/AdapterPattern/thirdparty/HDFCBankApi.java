package AdapterPattern.thirdparty;

public class HDFCBankApi {

    public double getBalance(String accountNo){
        return 2;
    }

    public boolean transferMoney(String fromAccount, String toAccount, double amount){
        return true;
    }
}
