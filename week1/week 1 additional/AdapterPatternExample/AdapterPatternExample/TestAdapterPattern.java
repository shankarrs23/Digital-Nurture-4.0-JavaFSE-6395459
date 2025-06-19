package AdapterPatternExample;

public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using PayPal through adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        payPalProcessor.processPayment(150.00);

        // Using Stripe through adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(200.50);
    }
}
