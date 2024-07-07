package org.example.DesignVendingMachine.models;

import java.util.List;

public class SelectionState implements State{
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
        System.out.println("Choosing product with code: " + code);
        Item itemForCode = vendingMachine.getInventory().getItemShelf()[code-101].getItem();

        int userPaid = 0;

        for(Coin coin : vendingMachine.getCoinList()){
            userPaid += coin.value;
        }

        if(userPaid < itemForCode.getPrice()){
            refundFullMoney(vendingMachine);
            throw new Exception("insufficient money!");
        }
        else if(userPaid == itemForCode.getPrice()){
            vendingMachine.setState(new DispensingState(vendingMachine, code));
        }
        else{
            getChange(userPaid - itemForCode.getPrice());
            vendingMachine.setState(new DispensingState(vendingMachine, code));
        }

    }

    @Override
    public int getChange(int change) throws Exception {
        System.out.println("Change of: " + change + " out in the cash dispense tray");
        return change;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        vendingMachine.getCoinList().clear();
        vendingMachine.setState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }
}
