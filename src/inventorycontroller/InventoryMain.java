package inventorycontroller;

import inventorymodel.Inventory;
import inventoryservice.InventoryService;
import util.UserInputOutput;

public class InventoryMain {

    public static void main(String[] args) {

        InventoryService inventoryService = new InventoryService();
        boolean flag = true;

        while (flag) {
            int choice = UserInputOutput.getUserChoice();

            switch (choice) {
                case 1:
                    Inventory inventory = readDataFromConsole();
                    inventoryService.addInventory(inventory);
                    break;
                case 2:
                    String editName = UserInputOutput.getProductName();
                    double price = UserInputOutput.getProductPrice();
                    double weight = UserInputOutput.getProductWeight();
                    inventoryService.editInventory(editName, price, weight);
                    break;
                case 3:
                    String name = UserInputOutput.getProductName();
                    inventoryService.deleteInventory(name);
                    break;
                case 4:
                    inventoryService.display();
                    break;
                case 5:
                    System.out.println("\n" + "Total value of Inventory");
                    inventoryService.totalValueOfInventory();
                    break;
                case 6:
                    System.out.println("\n" + "Total weight of Inventory");
                    inventoryService.totalWeightOfInventory();
                    break;
                case 7:
                    System.out.println("\n" + "Total price of Inventory");
                    inventoryService.totalPriceOfInventory();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input !!!");
                    break;
            }
        }
    }

    // returns inventory object stores name,price,weight
    public static Inventory readDataFromConsole() {
        Inventory inventory = new Inventory();
        System.out.println("Add Inventory");

        String name = UserInputOutput.getProductName();
        inventory.setName(name);

        double price = UserInputOutput.getProductPrice();
        inventory.setPrice(price);

        double weight = UserInputOutput.getProductWeight();
        inventory.setWeight(weight);

        return inventory;
    }
}
