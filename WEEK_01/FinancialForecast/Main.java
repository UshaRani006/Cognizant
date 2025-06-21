package WEEK_01.FinancialForecast;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000; 
        double growthRate = 0.05;    
        int years = 5;               

        double futureValue = FinancialForecast.forecastValue(initialValue, growthRate, years);
        System.out.printf("Forecasted Value after %d years: ₹%.2f\n", years, futureValue);
    }
}

