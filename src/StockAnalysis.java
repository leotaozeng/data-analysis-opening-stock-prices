import java.util.Arrays;

public class StockAnalysis {
    private final float[] stockPrices;
    private final int stockPricesLength;

    // Parameterized Constructor
    public StockAnalysis(float[] stockPrices) {
        this.stockPrices = stockPrices;
        this.stockPricesLength = stockPrices.length;
    }

    // Calculate the average stock price
    // The method takes the array of stock prices as input and returns the average price of the stocks
    public float calculateAveragePrice() {
        float sum = 0;
        for (float stockPrice : stockPrices) {
            sum += stockPrice;
        }
        return sum / stockPricesLength;
    }

    // Find the maximum stock price
    // The method takes the array of stock prices as input and returns the maximum price among all the stocks
    public float findMaximumPrice() {
        // Sorting
        // Arrays.sort(stockPrices);
        // return stockPrices[stockPricesLength - 1];

        // Iterative Way
        float maxPrice = stockPrices[0];
        for (int i = 0; i < stockPricesLength; i++) {
            if (stockPrices[i] > maxPrice) {
                maxPrice = stockPrices[i];
            }
        }
        return maxPrice;
    }

    // Determine the occurrence count of a specific price
    // The method takes the array of stock prices and a target price as input and returns the number of times the target price occurs in the array
    public void countOccurrences(float targetPrice) {
    }
}
