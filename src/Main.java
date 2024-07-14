import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize an Array with 10 days of opening stock prices as float datatype
        float[] stockPricesArray = {100.5f, 102.3f, 101.0f, 12.3f, 118.4f, 184.1f, 105.0f, 106.2f, 102.5f, 12.3f};

        // Initialize an ArrayList with 10 days of opening stock prices as float datatype
        ArrayList<Float> stockPricesList = new ArrayList<>(Arrays.asList(101.5f, 102.3f, 101.0f, 12.3f, 118.4f, 104.1f, 105.0f, 106.2f, 102.5f, 12.3f));

        // Create an object of StockAnalysis class
        StockAnalysis obj = new StockAnalysis(stockPricesArray, stockPricesList);

        // Generate a random number between 0 and 9
        Random rand = new Random();
        int randomNum = rand.nextInt(10);

        System.out.println("The average stock price is: " + obj.calculateAveragePrice());
        System.out.println("The maximum stock price is: " + obj.findMaximumPrice());
        System.out.println("The target stock price is " + stockPricesArray[randomNum] + ", which occurs " +  obj.countOccurrences(stockPricesArray[randomNum]) + " times");
        System.out.println("The cumulative sum of stock prices is " + obj.computeCumulativeSum());
    }
}