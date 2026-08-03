/**
 * ============================================================
 * Project: Default Method Conflict Resolution
 * File: Main.java
 * Author: Aradhya Singh Thakur
 *
 * Description:
 * Demonstrates how Java resolves conflicts when two interfaces
 * provide default methods with the same signature.
 *
 * Concepts Covered:
 * - Interface
 * - Default Methods (Java 8+)
 * - Multiple Interface Implementation
 * - Default Method Conflict Resolution
 * - Encapsulation
 * - Runtime Polymorphism
 *
 * A Smartphone implements both Camera and MusicPlayer.
 * Since both interfaces define a default start() method,
 * the Smartphone class overrides it and explicitly calls
 * each interface's default implementation using
 * InterfaceName.super.method().
 * ============================================================
 */

/**
 * Represents camera functionality.
 */
interface Camera {

    /**
     * Starts the camera.
     */
    default void start() {
        System.out.println("Camera started.\n");
    }
}

/**
 * Represents music player functionality.
 */
interface MusicPlayer {

    /**
     * Starts the music player.
     */
    default void start() {
        System.out.println("Music Player started.\n");
    }
}

/**
 * Represents a smartphone capable of using
 * both camera and music player features.
 */
class Smartphone implements Camera, MusicPlayer {

    /** Smartphone brand. */
    private String brand;

    /** Smartphone model. */
    private String model;

    /**
     * Constructs a Smartphone object.
     *
     * @param brand Smartphone brand
     * @param model Smartphone model
     */
    public Smartphone(String brand, String model) {

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
     * Resolves the default method conflict by
     * explicitly invoking the default implementations
     * from both Camera and MusicPlayer interfaces.
     */
    @Override
    public void start() {

        Camera.super.start();

        MusicPlayer.super.start();

        System.out.println("Smartphone is fully started.\n");
    }

    /**
     * Displays complete smartphone information.
     */
    public void displayPhoneDetails() {

        System.out.println("------- Smartphone Details -------");

        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());

        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Creates a Smartphone object and demonstrates
     * default method conflict resolution using
     * multiple interfaces.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Apple", "iPhone 17");

        // Runtime polymorphism using an interface reference
        Camera camera = phone;

        System.out.println("========== Starting Smartphone ==========\n");

        camera.start();

        phone.displayPhoneDetails();
    }
}
