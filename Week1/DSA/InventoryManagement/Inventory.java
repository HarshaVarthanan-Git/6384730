/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.InventoryManagement;

import java.util.*;

/**
 *
 * @author EDITH
 */
public class Inventory {
    Map<Integer, Product> product = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int avaID=1;
    
    public void addProduct(String name, int quantity, int price) {
        Product pr = new Product(name, quantity, price);
        product.put(avaID, pr);
        System.out.println("New Product(ID): " + avaID);
        avaID++;
    }
    
    public void update(int id){
        Product temp = product.get(id);
        System.out.println("Name: "+ temp.name);
        System.out.println("Price: " + temp.price);
        System.out.println("Quantity: "+ temp.quantity);
        System.out.println("1. Update Name");
        System.out.println("2. Update Price");
        System.out.println("3. Update Quantity");
        int opt = sc.nextInt();
        switch(opt){
            case 1:
                String name = sc.next();
                temp.updateName(name);
                break;
            case 2:
                int price = sc.nextInt();
                temp.updatePrice(price);
                break;
            case 3:
                int quantity = sc.nextInt();
                temp.updateQuantity(quantity);
                break;
        }
    }
    
    public void deleteProduct(int id){
        Product pr = product.get(id);
        pr = null;
        product.remove(id);
    }
    
    public void listAll(){
        System.out.printf("%20s", "Product ID");
        System.out.printf("%20s", "Product Name");
        System.out.printf("%20s", "Product Price");
        System.out.printf("%20s", "Product Quantity");
        System.out.println("");
        for(Map.Entry<Integer,Product> pr: product.entrySet()) {
            System.out.printf("%20s", pr.getKey());
            System.out.printf("%20s", pr.getValue().name);
            System.out.printf("%20s", pr.getValue().price);
            System.out.printf("%20s", pr.getValue().quantity);
            System.out.println("");
        }
   }
    
    public List<Map.Entry<Integer, Product>> getAllProducts() {
        return new ArrayList<>(product.entrySet());
    }
}