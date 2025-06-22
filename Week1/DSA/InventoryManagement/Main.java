/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.InventoryManagement;

import java.util.Scanner;

/**
 *
 * @author EDITH
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int opt = 0;
        while(opt != 5){
            System.out.println("1. Add Product");
            System.out.println("2. List all Products");
            System.out.println("3. Update Product");
            System.out.println("4. Remove the Product");
            System.out.println("5. Exit");

            opt = sc.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Enter the Product name: ");
                    String s = sc.next();
                    System.out.println("Enter the Product price: ");
                    int pr = sc.nextInt();
                    System.out.println("Enter the Quantity of the Product");
                    int qu = sc.nextInt();
                    inventory.addProduct(s, qu, pr);
                    break;
                case 2:
                    inventory.listAll();
                    break;
                case 3:
                    System.out.println("Enter Product ID: ");
                    int id = sc.nextInt();
                    inventory.update(id);
                    break;
                case 4:
                    System.out.println("Enter Product ID: ");
                    int id2 = sc.nextInt();
                    inventory.deleteProduct(id2);
                    break;
            }
        }
    }
}
