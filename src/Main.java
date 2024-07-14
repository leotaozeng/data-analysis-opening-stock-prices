public class Main {
    public static void main(String[] args) {
        // Initialize the array with 10 days of opening stock prices
        float[] openingPrices = {100.5f, 102.3f, 101.0f, 99.8f, 118.4f, 104.1f, 105.0f, 106.2f, 102.5f, 12.3f};
        StockAnalysis obj = new StockAnalysis(openingPrices);

        System.out.println("The average price is: " + obj.calculateAveragePrice());
        System.out.println("The maximum price is: " + obj.findMaximumPrice());
    }
}