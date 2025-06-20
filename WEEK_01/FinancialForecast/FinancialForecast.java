package WEEK_01.FinancialForecast;

public class FinancialForecast {

    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; // Base case
        }
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
