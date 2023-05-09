package DesignPatterns.Proxy;

public class TestATM {

    public static void main(String[] args) {

        ATMMachine realATM = new ATMMachine();
        GetATMData atmProxy = new ATMPRoxy();

        System.out.println("Current atm state " + atmProxy.getATMdata());
        System.out.println("Cash in ATM "+ atmProxy.getCashInMachine());
    }
}
