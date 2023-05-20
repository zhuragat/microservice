package kz.zhuragat.inventoryservice;

import kz.zhuragat.inventoryservice.model.Inventory;
import kz.zhuragat.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
}
