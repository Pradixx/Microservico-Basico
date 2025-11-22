package com.ordersystem.inventory_service.repository;

import com.ordersystem.inventory_service.model.InventoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<InventoryItem, String> {
}
