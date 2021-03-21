package builderdesignpattern;

public class Mobile {

    final int ram, storage;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    // MobileBuilder object will provide values for all the fields
    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.ram;
        this.storage = mobileBuilder.storage;
        this.battery = mobileBuilder.battery;
        this.camera = mobileBuilder.camera;
        this.processor = mobileBuilder.processor;
        this.screenSize = mobileBuilder.screenSize;
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
