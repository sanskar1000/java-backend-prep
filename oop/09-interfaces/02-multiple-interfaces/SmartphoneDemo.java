/**
 * ============================================================
 * Project: Smartphone Interface Demonstration
 * File: Main.java
 * Author: Aradhya Singh Thakur
 *
 * Description:
 * Demonstrates multiple interface implementation in Java.
 *
 * Concepts Covered:
 * - Interface
 * - Multiple Interface Implementation
 * - Encapsulation
 * - Constructor Validation
 * - Method Overriding
 * - Runtime Polymorphism
 *
 * A Smartphone implements both Camera and MusicPlayer
 * interfaces, allowing it to capture photos and play music.
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
}

/**
 * Represents music player functionality.
 */
interface MusicPlayer {

    /**
     * Plays music.
     */
    void playMusic();
}

/**
 * Represents a smartphone that can capture photos
 * and play music by implementing multiple interfaces.
 */
class Smartphone implements Camera, MusicPlayer {

    /** Smartphone brand. */
    private String brand;

    /** Smartphone model. */
    private String model;

    /** Storage capacity in GB. */
    private int storage;

    /**
     * Constructs a Smartphone object.
     *
     * @param brand   Smartphone brand
     * @param model   Smartphone model
     * @param storage Storage capacity in GB
     */
    public Smartphone(String brand, String model, int storage) {

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

        if (storage > 0) {
            this.storage = storage;
        } else {
            this.storage = 0;
            System.out.println("Invalid storage. Default value assigned.\n");
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
     * Returns the storage capacity.
     *
     * @return storage in GB
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Captures a photo using the smartphone camera.
     */
    @Override
    public void takePhoto() {
        System.out.println(getBrand() + " " + getModel() + " captured a photo.\n");
    }

    /**
     * Plays music using the smartphone.
     */
    @Override
    public void playMusic() {
        System.out.println(getBrand() + " " + getModel() + " is playing music.\n");
    }

    /**
     * Displays complete smartphone information.
     */
    public void displayPhoneDetails() {

        System.out.println("------- Smartphone Details -------");

        System.out.println("Brand   : " + getBrand());
        System.out.println("Model   : " + getModel());
        System.out.println("Storage : " + getStorage() + " GB");
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Creates a Smartphone object and demonstrates
     * multiple interface implementation using
     * Camera and MusicPlayer references.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 256);

        // Runtime polymorphism using interface references
        Camera camera = phone;
        MusicPlayer musicPlayer = phone;

        phone.displayPhoneDetails();

        System.out.println("========== Camera ==========");
        camera.takePhoto();

        System.out.println("======= Music Player =======");
        musicPlayer.playMusic();
    }
}
