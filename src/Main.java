import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize the array with 10 days of opening stock prices
        float[] openingPrices = {100.5f, 102.3f, 101.0f, 12.3f, 118.4f, 104.1f, 105.0f, 106.2f, 102.5f, 12.3f};
        StockAnalysis obj = new StockAnalysis(openingPrices);

        Random rand = new Random();
        int randomNum = rand.nextInt(10);

        System.out.println("The average price is: " + obj.calculateAveragePrice());
        System.out.println("The maximum price is: " + obj.findMaximumPrice());
        System.out.println("The target price " + openingPrices[randomNum] + " occurs " +  obj.countOccurrences(openingPrices[randomNum]) + " times.");
    }
}