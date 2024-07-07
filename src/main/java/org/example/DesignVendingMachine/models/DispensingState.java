package org.example.DesignVendingMachine.models;

import java.util.List;

public class DispensingState implements State {

    DispensingState(VendingMachine vendingMachine, int code) throws Exception{

        dispenseProduct(vendingMachine, code);

    }
    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {

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

    public void dispenseProduct(VendingMachine vendingMachine, int code){
        Item item = vendingMachine.getInventory().getItemShelf()[code-101].getItem();
        System.out.println("Dispensed item with code: " + code + " name: " + item.getItemType());

        vendingMachine.getInventory().getItemShelf()[code-101].setShelfStatus(ShelfStatus.EMPTY);
        vendingMachine.getInventory().getItemShelf()[code-101].setItem(null);

        vendingMachine.setState(new IdleState(vendingMachine));


    }
}
