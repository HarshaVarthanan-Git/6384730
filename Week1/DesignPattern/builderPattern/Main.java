/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DesignPattern.builderPattern;

/**
 *
 * @author EDITH
 */
public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                                .setGraphicsCard("NVIDIA RTX 4090")
                                .setBluetooth()
                                .setWiFi()
                                .build();

        Computer budgetPC = new Computer.Builder("Intel i3", "8GB", "256GB SSD")
                                .build();

        Computer officePC = new Computer.Builder("AMD Ryzen 5", "16GB", "512GB SSD")
                                .setWiFi()
                                .build();

        System.out.println("Gaming PC Specs:");
        gamingPC.showSpecs();

        System.out.println("\nBudget PC Specs:");
        budgetPC.showSpecs();

        System.out.println("\nOffice PC Specs:");
        officePC.showSpecs();
    }
}
