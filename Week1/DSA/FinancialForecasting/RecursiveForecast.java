/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.FinancialForecasting;

/**
 *
 * @author EDITH
 */
public class RecursiveForecast implements ForecastStrategy {
    @Override
    public double forecast(double initialValue, double[] growthRates, int year) {
        if (year == 0) return initialValue;

        double previousValue = forecast(initialValue, growthRates, year - 1);
        return previousValue + (previousValue * growthRates[year - 1]);
    }
}