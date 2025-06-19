package BuilderPatternExample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming configuration
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 4080")
                .build();

        // Displaying configurations
        basicComputer.showConfig();
        gamingComputer.showConfig();
    }
}
