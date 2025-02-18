package lk.ijse.spring_boot_13.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private int itemCode;
    private String description;
    private int qty;
    private double price;

    public Item(int itemCode, String description, int qty, double price) {
        this.itemCode = itemCode;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    public Item() {
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
