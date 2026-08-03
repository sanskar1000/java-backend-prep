/**
 * ============================================================
 * Project: Default Method in Interface Demonstration
 * File: Main.java
 * Author: Aradhya Singh Thakur
 *
 * Description:
 * Demonstrates the use of default methods in Java interfaces.
 *
 * Concepts Covered:
 * - Interface
 * - Default Methods (Java 8+)
 * - Interface Implementation
 * - Encapsulation
 * - Constructor Validation
 * - Runtime Polymorphism
 *
 * A Smartphone implements the Camera interface.
 * The Camera interface provides both an abstract method
 * (takePhoto()) and a default method (recordVideo()).
 * ============================================================
 */

/**
 * Represents camera functionality.
 */
interface Camera {

    /**
     * Captures a photo.
     */
    void takePhoto();

    /**
     * Default implementation for recording a video.
     * Classes implementing this interface automatically
     * inherit this behavior unless they choose to override it.
     */
    default void recordVideo() {
        System.out.println("Recording Full HD video...\n");
    }
}

/**
 * Represents a smartphone with camera functionality.
 */
class Smartphone implements Camera {

    /** Smartphone brand. */
    private String brand;

    /** Smartphone model. */
    private String model;

    /** Camera resolution in megapixels (MP). */
    private int cameraResolution;

    /**
     * Constructs a Smartphone object.
     *
     * @param brand Smartphone brand
     * @param model Smartphone model
     * @param cameraResolution Camera resolution in MP
     */
    public Smartphone(String brand, String model, int cameraResolution) {

        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Unknown";
            System.out.println("Invalid brand. Default value assigned.\n");
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Unknown";
            System.out.println("Invalid model. Default value assigned.\n");
        }

        if (cameraResolution > 0) {
            this.cameraResolution = cameraResolution;
        } else {
            this.cameraResolution = 0;
            System.out.println("Invalid camera resolution. Default value assigned.\n");
        }

        System.out.println("Smartphone constructor executed.\n");
    }

    /**
     * Returns the smartphone brand.
     *
     * @return smartphone brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the smartphone model.
     *
     * @return smartphone model
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the camera resolution.
     *
     * @return camera resolution in MP
     */
    public int getCameraResolution() {
        return cameraResolution;
    }

    /**
     * Captures a photo using the smartphone camera.
     */
    @Override
    public void takePhoto() {
        System.out.println(getBrand() + " " + getModel()
                + " captured a photo using its "
                + getCameraResolution() + " MP camera.\n");
    }

    /**
     * Displays complete smartphone information.
     */
    public void displayPhoneDetails() {

        System.out.println("------- Smartphone Details -------");

        System.out.println("Brand             : " + getBrand());
        System.out.println("Model             : " + getModel());
        System.out.println("Camera Resolution : " + getCameraResolution() + " MP");
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Creates a Smartphone object and demonstrates
     * the use of abstract and default methods
     * through a Camera interface reference.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 50);

        // Runtime polymorphism using an interface reference
        Camera camera = phone;

        phone.displayPhoneDetails();

        System.out.println("========== Camera ==========");

        // Calls the overridden abstract method
        camera.takePhoto();

        // Calls the inherited default method
        camera.recordVideo();
    }
}
