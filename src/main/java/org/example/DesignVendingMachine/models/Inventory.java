package org.example.DesignVendingMachine.models;

public class Inventory {
    private int size;
    private ItemShelf[] itemShelf = null;

    Inventory(){}

    Inventory(int size){
        this.size = size;
        itemShelf = new ItemShelf[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ItemShelf[] getItemShelf() {
        return itemShelf;
    }

    public void setItemShelf(ItemShelf[] itemShelf) {
        this.itemShelf = itemShelf;
    }
}
