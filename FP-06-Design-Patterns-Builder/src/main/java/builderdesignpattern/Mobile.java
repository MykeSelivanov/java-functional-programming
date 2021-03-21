package builderdesignpattern;

public class Mobile {

    final int ram, storage;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    public Mobile(int ram, int storage, int battery, int camera, String processor, double screenSize) {
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return String.format("Specifications - RAM: %d Storage: %d Battery: %d Camera %dMP Processor: %s Display: %f''",
        ram, storage, battery, camera, processor, screenSize);
    }
}
