package inventoryservice;

import dao.InventoryDAO;
import inventorymodel.Inventory;

public class InventoryService implements InventoryServiceInterface {

    InventoryDAO inventoryDAO = new InventoryDAO();

    @Override
    public void addInventory(Inventory inventory) {
        inventoryDAO.addInventory(inventory);
    }

    @Override
    public void deleteInventory(String name) {
        inventoryDAO.deleteInventory(name);
    }

    @Override
    public void editInventory(String name, double price, double weight) {
        inventoryDAO.editInventory(name, price, weight);
    }

    @Override
    public void totalValueOfInventory() {
        inventoryDAO.totalValueOfInventory();
    }

    @Override
    public void totalWeightOfInventory() {
        inventoryDAO.totalWeightOfInventory();
    }

    @Override
    public void totalPriceOfInventory() {
        inventoryDAO.totalPriceOfInventory();
    }

    @Override
    public void display() {
        inventoryDAO.display();
    }

}
