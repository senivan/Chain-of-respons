package com.apps.ucu.edu.ua;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Banknote {
    public Banknote nextItem;
    public int BanknoteNominale;
    public void process(int ammount) {
        int quantity = ammount / BanknoteNominale;
        int remainder = ammount % BanknoteNominale;
        if (nextItem != null){
            nextItem.process(remainder);
        }
        if (remainder > 0){
            throw new IllegalArgumentException("Can't process " + ammount);
        }
        System.out.format("Provided %d x %d ", quantity, BanknoteNominale);

    }
}