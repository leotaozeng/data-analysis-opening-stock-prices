// import java.util.Arrays;

import java.util.ArrayList;

public class StockAnalysis {
    private final ArrayList<Float> stockPricesList;
    private final float[] stockPricesArray;
    private final int stockPricesArrayLength;

    // Parameterized Constructor
    public StockAnalysis(float[] stockPricesArray, ArrayList<Float> stockPricesList) {
        this.stockPricesList = stockPricesList;
        this.stockPricesArray = stockPricesArray;
        this.stockPricesArrayLength = stockPricesArray.length;
    }

    // Calculate the average stock price
    // The method takes the array of stock prices as input and returns the average price of the stocks
    public float calculateAveragePrice() {
        float sum = 0;
        for (float stockPrice : stockPricesArray) {
            sum += stockPrice;
        }
        return sum / stockPricesArrayLength;
    }

    // Find the maximum stock price
    // The method takes the array of stock prices as input and returns the maximum price among all the stocks
    public float findMaximumPrice() {
        // Sorting
        // Arrays.sort(stockPricesArray);
        // return stockPricesArray[stockPricesArrayLength - 1];

        // Iterative Way
        float maxPrice = stockPricesArray[0];
        for (int i = 0; i < stockPricesArrayLength; i++) {
            if (stockPricesArray[i] > maxPrice) {
                maxPrice = stockPricesArray[i];
            }
        }
        return maxPrice;
    }

    // Determine the occurrence count of a specific price
    // The method takes the array of stock prices and a target price as input and returns the number of times the target price occurs in the array
    public int countOccurrences(float targetPrice) {
        int count = 0;
        for (float stockPrice : stockPricesArray) {
            if (stockPrice == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Compute the cumulative sum of stock prices
    // The method takes the ArrayList of stock prices as input and returns a new ArrayList containing the cumulative sum of prices at each position
    public ArrayList<Float> computeCumulativeSum() {
        ArrayList<Float> cumulativeSumList = new ArrayList<>();
        float sum = 0;
        for (float stockPrice : stockPricesList) {
            // Printing and display the elements in ArrayList
            sum += stockPrice;
            cumulativeSumList.add(sum);
        }
        return cumulativeSumList;
    }
}
