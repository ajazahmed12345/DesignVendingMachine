package org.example.DesignVendingMachine.models;

public class ItemShelf {
    private int code;
    private Item item;

    private ShelfStatus shelfStatus;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ShelfStatus getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(ShelfStatus shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
}
