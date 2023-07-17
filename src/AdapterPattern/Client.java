package AdapterPattern;

public class Client {
    public static void main(String[] args) {
        PayTM paytm = new PayTM(new HDFCBankAPIAdapter()); // Dependency injection.
        double balance = paytm.showBalance();
        System.out.println(balance);

//        PayTM paytm = new PayTM();
//        double balance = paytm.displayBalance();
//        System.out.println(balance);
    }
}
