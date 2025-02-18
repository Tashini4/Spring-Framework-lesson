package lk.ijse.spring_boot_13.service;

import lk.ijse.spring_boot_13.dto.CustomerDTO;
import lk.ijse.spring_boot_13.dto.ItemDTO;
import lk.ijse.spring_boot_13.entity.Customer;
import lk.ijse.spring_boot_13.entity.Item;
import lk.ijse.spring_boot_13.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public boolean addItem(ItemDTO itemDTO){
        Item item = new Item(itemDTO.getItemCode(),itemDTO.getDescription(), itemDTO.getQty(), itemDTO.getPrice());
        itemRepo.save(item);
        return true;
    }
    public List<ItemDTO> getAllItem() {
        return itemRepo.findAll()
                .stream()
                .map(item -> new ItemDTO(item.getItemCode(),item.getDescription(),item.getQty(), item.getPrice()))
                .collect(Collectors.toList());
    }

    public ItemDTO updateItem(int itemCode, ItemDTO itemDTO) {
        Optional<Item> existingItem = itemRepo.findById(itemCode);

        if (existingItem.isPresent()){
            Item item = existingItem.get();
            item.setDescription(itemDTO.getDescription());
            item.setQty(itemDTO.getQty());
            item.setPrice(itemDTO.getPrice());

            Item updatedItem = itemRepo.save(item);
            return new ItemDTO(updatedItem.getItemCode(), updatedItem.getDescription(), updatedItem.getQty(), updatedItem.getPrice());
        }
            return null;
    }
    public void deleteItem(int itemCode) {
        itemRepo.deleteById(itemCode);
    }
}
