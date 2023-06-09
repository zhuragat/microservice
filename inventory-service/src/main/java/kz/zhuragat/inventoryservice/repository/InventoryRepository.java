package kz.zhuragat.inventoryservice.repository;

import kz.zhuragat.inventoryservice.model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
