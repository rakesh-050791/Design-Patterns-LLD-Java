package AdapterPattern;


public class PayTM {
    public BankApi bankapi;

    public PayTM(BankApi bankapi){
        this.bankapi = bankapi;
    }

    public PayTM(){};

//    double showBalance() throws InterruptedException{
//        double currentbalance = bankapi.showBalance("accountNumber");
//        return currentbalance;
//    }

    double showBalance(){
        double currentbalance = bankapi.showBalance("accountNumber");
        return currentbalance;
    }
}
