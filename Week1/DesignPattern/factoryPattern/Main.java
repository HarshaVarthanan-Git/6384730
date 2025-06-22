/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DesignPattern.factoryPattern;

/**
 *
 * @author EDITH
 */
public class Main {
    public static void main(String[] args) {
        WORDDocumentFactory wordDocumentFactory = new WORDDocumentFactory();
        EXCELDocumentFactory excelDocumentFactory = new EXCELDocumentFactory();
        PDFDocumentFactory pdfDocumentFactory = new PDFDocumentFactory();
        
        Document wordDoc = wordDocumentFactory.createDocument();
        wordDoc.open();
        Document excelDoc = excelDocumentFactory.createDocument();
        excelDoc.open();
        Document pdfDoc = pdfDocumentFactory.createDocument();
        pdfDoc.open();
        
        /*
        Word Document Openning...
        Excel Document Openning...
        PDF document Opening...
        */
    }
}
