package ObserverPatternExample;

public class TestObserverPattern {
    public static void main(String[] args) {
        // Create stock market subject
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobile1 = new MobileApp("Client1");
        Observer web1 = new WebApp("Client2");

        // Register observers
        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        // Change stock price
        System.out.println("Updating stock: Apple");
        stockMarket.setStockPrice("Apple", 180.75);

        System.out.println("\nUpdating stock: Google");
        stockMarket.setStockPrice("Google", 2850.40);

        // Remove an observer
        stockMarket.removeObserver(mobile1);

        System.out.println("\nUpdating stock: Tesla (after removing Client1)");
        stockMarket.setStockPrice("Tesla", 1020.20);
    }
}
