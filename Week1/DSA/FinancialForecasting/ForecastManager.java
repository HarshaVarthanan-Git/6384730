/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.DSA.FinancialForecasting;

/**
 *
 * @author EDITH
 */
import java.util.ArrayList;
import java.util.List;

public class ForecastManager {
    public static List<FinancialYearData> generateForecast(
            ForecastStrategy strategy,
            double initialValue,
            double[] growthRates
    ) {
        List<FinancialYearData> results = new ArrayList<>();
        for (int i = 0; i < growthRates.length; i++) {
            double value = strategy.forecast(initialValue, growthRates, i + 1);
            results.add(new FinancialYearData(i + 1, value));
        }
        return results;
    }
}