/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.FinancialForecasting;

/**
 *
 * @author EDITH
 */
public class FinancialYearData {
    private int year;
    private double value;

    public FinancialYearData(int year, double value) {
        this.year = year;
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Year " + year + ": ₹" + String.format("%.2f", value);
    }
}
