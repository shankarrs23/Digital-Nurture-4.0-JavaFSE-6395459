package BuilderPatternExample;

public class Computer {
    // Step 2: Attributes of the product
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    // Step 4: Private constructor accessed only by Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    // Display method
    public void showConfig() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + (gpu != null ? gpu : "None"));
        System.out.println();
    }

    // Step 3: Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // Step 3: Build method to return final object
        public Computer build() {
            return new Computer(this);
        }
    }
}
