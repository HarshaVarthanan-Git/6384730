/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DesignPattern.factoryPattern;

/**
 *
 * @author EDITH
 */
public class EXCELDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new EXCELDocument();
    }
    
}
