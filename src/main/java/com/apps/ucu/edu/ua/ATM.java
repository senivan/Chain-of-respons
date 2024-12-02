package com.apps.ucu.edu.ua;

public class ATM {
    private Banknote firstTrade;
    public ATM(){
        this.firstTrade = new Banknote100(new Banknote50(new Banknote5(null)));
    }
    public void process(int ammount){
        firstTrade.process(ammount);
    }
}
