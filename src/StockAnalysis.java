public class StockAnalysis {
    // Calculate the average stock price
    public static void calculateAveragePrice(float[] stockPrices) {
        float sum = 0;
        for (float stockPrice : stockPrices) {
            sum += stockPrice;
        }
        float averagePrice = sum / stockPrices.length;
        System.out.println("The average price is: " + averagePrice);
    }
}
