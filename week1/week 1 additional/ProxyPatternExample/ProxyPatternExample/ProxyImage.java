package ProxyPatternExample;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);  // Lazy loading
        } else {
            System.out.println("Using cached image for: " + filename);
        }
        realImage.display();
    }
}
