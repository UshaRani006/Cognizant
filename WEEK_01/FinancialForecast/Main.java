package WEEK_01.FinancialForecast;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000; // Starting amount
        double growthRate = 0.05;    // 5% annual growth
        int years = 5;               // Forecast for 5 years

        double futureValue = FinancialForecast.forecastValue(initialValue, growthRate, years);
        System.out.printf("Forecasted Value after %d years: ₹%.2f\n", years, futureValue);
    }
}

