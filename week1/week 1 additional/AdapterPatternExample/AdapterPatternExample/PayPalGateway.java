package AdapterPatternExample;

public class PayPalGateway {
    public void sendPayment(double amountInDollars) {
        System.out.println("Processing payment through PayPal: $" + amountInDollars);
    }
}
