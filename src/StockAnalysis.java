import java.util.Arrays;

public class StockAnalysis {
    private final float[] stockPrices;
    private final int stockPricesLength;

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
        Arrays.sort(stockPrices);
        return stockPrices[stockPricesLength - 1];
    }

    public void countOccurrences() {
    }
}
