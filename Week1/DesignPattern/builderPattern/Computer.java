/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DesignPattern.builderPattern;

/**
 *
 * @author EDITH
 */
public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    
//    Optional Attributes
    private String GraphicsCard;
    private boolean hasBluetooth = false;
    private boolean hasWiFi = false;
    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWiFi = builder.hasWiFi;
    }
    
    public static class Builder{
        private String CPU;
        private String RAM;
        private String Storage;

    //    Optional Attributes
        private String GraphicsCard;
        private boolean hasBluetooth = false;
        private boolean hasWiFi = false;
        
        public Builder(String CPU, String RAM, String Storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.Storage = Storage;
        }
        
        public Builder setGraphicsCard(String GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }
        
        public Builder setBluetooth() {
            this.hasBluetooth = true;
            return this;
        }
        
        public Builder setWiFi() {
            this.hasWiFi = true;
            return this;
        }
    
        public Computer build() {
            return new Computer(this);
        }
    }
    
    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " +Storage);
        System.out.println("Graphics Card: " + (GraphicsCard != null ? GraphicsCard : "Not included"));
        System.out.println("Bluetooth: " + (hasBluetooth ? "Available" : "Not included"));
        System.out.println("WiFi: " + (hasWiFi ? "Available" : "Not included"));
    }
}
