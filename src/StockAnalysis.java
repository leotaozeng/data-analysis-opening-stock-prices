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

    // Check if the Array of stock prices is empty
    public boolean isStockPricesArrayEmpty() {
        return stockPricesArrayLength == 0;
    }

    // Check if the ArrayList of stock prices is empty
    public boolean isStockPricesListEmpty() {
        return stockPricesList.isEmpty();
    }

    // Insert a stock price to the back of the ArrayList
    public void insert_back(float stockPrice) {
        stockPricesList.add(stockPrice);
    }

    // Insert a stock price to the front of the ArrayList
    public void insert_front(float stockPrice) {}

    public void insert_at() {}

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
        // Iterative Way
        float maxPrice = stockPricesArray[0];
        for (int i = 0; i < stockPricesArrayLength; i++) {
            float currPrice = stockPricesArray[i];
            if (currPrice > maxPrice) {
                maxPrice = currPrice;
            }
        }
        return maxPrice;

        // Sorting
//        Arrays.sort(stockPricesArray);
//        return stockPricesArray[stockPricesArrayLength - 1];

        // Using Collections.max()
//        ArrayList<Float> list = new ArrayList<>();
//        for (float price : stockPricesArray) {
//            list.add(price);
//        }
//        return Collections.max(list);
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
