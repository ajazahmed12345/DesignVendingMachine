package org.example.DesignVendingMachine.models;

import org.example.DesignVendingMachine.models.Coin;
import org.example.DesignVendingMachine.models.VendingMachine;

import java.util.List;

public interface State {
    void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;
    int getChange(int change) throws Exception;
    List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

}
