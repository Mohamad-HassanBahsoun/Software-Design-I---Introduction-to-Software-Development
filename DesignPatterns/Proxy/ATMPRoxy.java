package DesignPatterns.Proxy;

public class ATMPRoxy implements GetATMData {


    @Override
    public ATMState getATMdata() {
        ATMMachine realATM = new ATMMachine();
        return realATM.getATMdata();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATM = new ATMMachine();
        return realATM.getCashInMachine();
    }
}
