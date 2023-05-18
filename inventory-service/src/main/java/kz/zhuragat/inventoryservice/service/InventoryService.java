package kz.zhuragat.inventoryservice.service;

import kz.zhuragat.inventoryservice.repository.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode ) {
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
