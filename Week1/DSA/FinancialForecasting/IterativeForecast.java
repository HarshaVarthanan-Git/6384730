/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.FinancialForecasting;

/**
 *
 * @author EDITH
 */
public class IterativeForecast implements ForecastStrategy {
    @Override
    public double forecast(double initialValue, double[] growthRates, int year) {
        double result = initialValue;
        for (int i = 0; i < year; i++) {
            result += result * growthRates[i];
        }
        return result;
    }
}