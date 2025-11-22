package com.ordersystem.inventory_service.service;

import com.ordersystem.inventory_service.model.InventoryItem;
import com.ordersystem.inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    public InventoryItem getItemById(String id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public InventoryItem createItem(InventoryItem item) {
        return  inventoryRepository.save(item);
    }

    public void deleteItem(String id) {
        inventoryRepository.deleteById(id);
    }
}
