/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DesignPattern.singletonPattern;

/**
 *
 * @author EDITH
 */
public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.log("Example for the Singleton Pattern");
        Logger log2 = Logger.getInstance();
        
        if(log == log2)
            System.out.println("Both Logger Instance are the same");
        else
            System.out.println("Instance are different");
    }
}

class Logger {

    private static Logger log;

    private Logger() {
        System.out.println("Logger Initializing...");
    }

    public static synchronized Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    public void log(String msg) {
        System.out.println("[Log]: " + msg);
    }
}
