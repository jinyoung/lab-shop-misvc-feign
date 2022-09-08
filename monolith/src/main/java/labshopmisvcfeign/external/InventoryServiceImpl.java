package labshopmisvcfeign.external;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    /**
     * Fallback
     */
    public Inventory getInventory(Long id) {
        Inventory inventory = new Inventory();
        return inventory;
    }
    // keep

    @Override
    public Inventory decreaseStock(Long id, DecreaseStockCommand decreaseStockCommand) {
        // TODO Auto-generated method stub
        return null;
    }

}
