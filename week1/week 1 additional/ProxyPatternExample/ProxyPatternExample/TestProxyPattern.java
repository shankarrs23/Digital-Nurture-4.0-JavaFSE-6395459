package ProxyPatternExample;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature_photo.jpg");

        System.out.println("First display call:");
        image1.display();  // Loads and displays

        System.out.println("\nSecond display call:");
        image1.display();  // Uses cached image
    }
}
