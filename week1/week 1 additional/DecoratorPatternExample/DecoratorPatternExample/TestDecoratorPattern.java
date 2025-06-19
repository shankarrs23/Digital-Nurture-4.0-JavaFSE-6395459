package DecoratorPatternExample;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Basic Email Notification
        Notifier emailNotifier = new EmailNotifier();

        // Email + SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Email + SMS + Slack
        Notifier allNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("=== Sending through Email ===");
        emailNotifier.send("System update at 10 PM.");

        System.out.println("\n=== Sending through Email + SMS ===");
        smsNotifier.send("System update at 10 PM.");

        System.out.println("\n=== Sending through Email + SMS + Slack ===");
        allNotifier.send("System update at 10 PM.");
    }
}
