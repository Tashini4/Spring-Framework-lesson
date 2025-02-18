package lk.ijse.spring_boot_13.controller;

import lk.ijse.spring_boot_13.dto.CustomerDTO;
import lk.ijse.spring_boot_13.dto.ItemDTO;
import lk.ijse.spring_boot_13.repo.ItemRepo;
import lk.ijse.spring_boot_13.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("save")
    public boolean saveItem(@RequestBody ItemDTO itemDTO){
        boolean res = itemService.addItem(itemDTO);
        return res;
    }
    @GetMapping("get")
    public List<ItemDTO> getAllItem(){
        return itemService.getAllItem();
    }
    @PutMapping("update")
    public ItemDTO updateItem(@PathVariable int itemCode,@RequestBody ItemDTO itemDTO){
        return itemService.updateItem(itemCode,itemDTO);
    }
    @DeleteMapping("/{itemCode}")
    public int deleteItem(@PathVariable int itemCode){
        itemService.deleteItem(itemCode);
        return itemCode;
    }
}
