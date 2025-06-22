/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.InventoryManagement;

/**
 *
 * @author EDITH
 */
public class Product {
    public int quantity, price;
    public String name;
    
    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public void updateName(String name){
        this.name = name;
    }
    
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void updatePrice(int price) {
        this.price = price;
    }
}

