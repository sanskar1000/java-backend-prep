/**
 * ============================================================
 * Project: Static Method in Interface Demonstration
 * File: Main.java
 * Author: Aradhya Singh Thakur
 *
 * Description:
 * Demonstrates the use of static methods in Java interfaces.
 *
 * Concepts Covered:
 * - Interface
 * - Static Methods (Java 8+)
 * - Interface Implementation
 * - Encapsulation
 * - Constructor Validation
 * - Method Overriding
 *
 * A Smartphone implements the Camera interface.
 * The Camera interface defines:
 *   • An abstract method: takePhoto()
 *   • A static utility method: showPhotographyTips()
 *
 * Static interface methods belong to the interface itself
 * and are invoked using the interface name.
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
     * Displays useful photography tips.
     *
     * This is a static interface method and can be
     * called only using the interface name.
     */
    static void showPhotographyTips() {

        System.out.println(
                "Photography Tips:\n" +
                "1. Keep the camera steady.\n" +
                "2. Use proper lighting.\n" +
                "3. Focus before capturing.\n"
        );
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

        System.out.println(
                getBrand() + " " +
                getModel() +
                " captured a photo using its " +
                getCameraResolution() +
                " MP camera.\n"
        );
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
     * Creates a Smartphone object and demonstrates:
     * <ul>
     *     <li>Interface implementation</li>
     *     <li>Method overriding</li>
     *     <li>Calling a static interface method</li>
     * </ul>
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Smartphone phone =
                new Smartphone("Samsung", "Galaxy S24", 50);

        phone.displayPhoneDetails();

        phone.takePhoto();

        // Calling the static interface method
        Camera.showPhotographyTips();
    }
}
