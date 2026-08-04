/**
 * ============================================================
 * Project : Interface Private Methods Demo
 * File    : Main.java
 * Author  : Aradhya Singh Thakur
 * Language: Java
 * ============================================================
 *
 * Description:
 * ------------
 * This program demonstrates advanced features introduced in
 * Java interfaces:
 *
 * 1. Abstract interface methods
 * 2. Default interface methods
 * 3. Private interface methods
 * 4. Private static interface methods
 * 5. Static interface methods
 * 6. Interface implementation
 *
 * The Camera interface provides reusable functionality through
 * default and static methods while hiding helper logic inside
 * private methods.
 *
 * The Smartphone class implements the Camera interface and
 * provides its own implementation of taking photographs.
 *
 * Concepts Covered:
 * -----------------
 * • Interfaces
 * • Default Methods
 * • Static Methods
 * • Private Interface Methods (Java 9+)
 * • Encapsulation
 * • Method Reusability
 * • Object-Oriented Programming
 * ============================================================
 */

interface Camera {

    /**
     * Captures a photograph.
     * Every implementing class must provide its own implementation.
     */
    void takePhoto();

    /**
     * Records a Full HD video.
     *
     * This default method reuses the private helper method
     * prepareCamera() before recording begins.
     */
    default void recordVideo() {

        prepareCamera();

        System.out.println("Recording Full HD video.\n");
    }

    /**
     * Private helper method.
     *
     * This method is accessible only inside the interface.
     * It prepares the camera before recording starts.
     */
    private void prepareCamera() {

        System.out.println("""
                Preparing camera...
                Checking battery...
                Focusing lens...
                """);
    }

    /**
     * Displays photography tips.
     *
     * This static method can be called using:
     * Camera.showPhotographyTips();
     */
    static void showPhotographyTips() {

        printHeader();

        System.out.println("""
                1. Keep the camera steady.
                2. Use proper lighting.
                3. Focus before capturing.
                """);
    }

    /**
     * Prints the heading for photography tips.
     *
     * Private static helper method used only inside
     * showPhotographyTips().
     */
    private static void printHeader() {

        System.out.println("=== Photography Tips ===\n");
    }
}

/**
 * Represents a smartphone equipped with a camera.
 *
 * This class implements the Camera interface and provides
 * functionality for capturing photos.
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
     * @param brand smartphone brand
     * @param model smartphone model
     * @param cameraResolution camera resolution in MP
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
     * @return brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the smartphone model.
     *
     * @return model name
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
     * Captures a photograph using the smartphone camera.
     */
    @Override
    public void takePhoto() {

        System.out.println(
                getBrand() + " " +
                getModel() +
                " captured a photo using its " +
                getCameraResolution() +
                " MP camera.\n");
    }

    /**
     * Displays complete smartphone information.
     */
    public void displayPhoneDetails() {

        System.out.println("------- Phone Details -------");

        System.out.println("Brand             : " + getBrand());
        System.out.println("Model             : " + getModel());
        System.out.println("Camera Resolution : " + getCameraResolution() + " MP");

        System.out.println();
    }
}

/**
 * ============================================================
 * Main Class
 * ============================================================
 *
 * Program execution starts here.
 *
 * Workflow:
 * 1. Create a Smartphone object.
 * 2. Capture a photo.
 * 3. Record a video using the default interface method.
 * 4. Display photography tips using a static interface method.
 * 5. Display smartphone details.
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        Smartphone phone =
                new Smartphone("Samsung", "Galaxy S24", 50);

        phone.takePhoto();

        phone.recordVideo();

        Camera.showPhotographyTips();

        phone.displayPhoneDetails();
    }
}
