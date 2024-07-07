package org.example.DesignVendingMachine.models;

import java.util.List;

public class HasMoneyState implements State{
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Pressing product selection button...");
        vendingMachine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Adding coin: " + coin.value);
        vendingMachine.getCoinList().add(coin);
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
