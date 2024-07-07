package org.example.DesignVendingMachine.models;

import java.util.List;

public class IdleState implements State{

    private VendingMachine vendingMachine;

    IdleState(){}

    IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Pressing insert coin button");
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {

    }

    @Override
    public int getChange(int change) throws Exception {
        return 0;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
