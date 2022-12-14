package labshopmisvcfeign.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import labshopmisvcfeign.InventoryApplication;
import lombok.Data;

@Entity
@Table(name = "Inventory_table")
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long stock;

    @PostPersist
    public void onPostPersist() {}

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    public void decreaseInventory(
        DecreaseInventoryCommand decreaseInventoryCommand
    ) {

        setStock(getStock()  - decreaseInventoryCommand.getQty());

    }

    public void addStock(AddStockCommand addStockCommand) {}
}
