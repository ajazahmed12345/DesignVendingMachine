package org.example.DesignVendingMachine.models;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try{
            System.out.println("Starting the vending machine application...");

            fillInventory(vendingMachine);
            displayInventory(vendingMachine);

            State currentState = vendingMachine.getState();
            currentState.pressInsertCoinButton(vendingMachine);

            currentState = vendingMachine.getState();
            currentState.insertCoin(vendingMachine, Coin.TEN);
            currentState.insertCoin(vendingMachine, Coin.TEN);
            currentState.insertCoin(vendingMachine, Coin.FIVE);


            currentState = vendingMachine.getState();
            currentState.pressProductSelectionButton(vendingMachine);

            currentState = vendingMachine.getState();
            currentState.chooseProduct(vendingMachine, 102);

            System.out.println("printing the final state of the machine...");

            displayInventory(vendingMachine);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void fillInventory(VendingMachine vendingMachine){
        System.out.println("Filling the inventory");
        ItemShelf[] cells = vendingMachine.getInventory().getItemShelf();

        for(int i = 0; i < cells.length; i++){
            Item item = new Item();

            if(i >= 0 && i < 3){
                item.setItemType(ItemType.COKE);
                item.setPrice(20);
            }
            else if(i >= 3 && i < 5){
                item.setItemType(ItemType.CHIPS);
                item.setPrice(20);
            }
            else if(i >= 5 && i < 8){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(15);
            }
            else if(i >= 8 && i < 10){
                item.setItemType(ItemType.BISCUIT);
                item.setPrice(10);
            }

            cells[i] = new ItemShelf();
            cells[i].setItem(item);
            cells[i].setShelfStatus(ShelfStatus.FILLED);
            cells[i].setCode(i + 101);

        }

        System.out.println();

    }

    public static void displayInventory(VendingMachine vendingMachine){
        System.out.println("Displaying the inventory \n ---------------------");
        ItemShelf[] cells = vendingMachine.getInventory().getItemShelf();

        for(ItemShelf itemShelf : cells){
            Item curr = itemShelf.getItem();
            if(curr == null){
                System.out.println("(NO_ITEM)" + ", " + itemShelf.getCode()
                        + ", " + itemShelf.getShelfStatus());
            }
            else {
                System.out.println(itemShelf.getItem().getItemType() + ", " + itemShelf.getCode()
                        + ", " + itemShelf.getShelfStatus());
            }
        }
        System.out.println();
    }
}
