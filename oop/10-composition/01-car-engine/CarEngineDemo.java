/*
 * Program: CarEngineComposition
 *
 * Purpose:
 * Demonstrates the Has-A relationship between Car and Engine
 * using object composition in Java.
 *
 * Concepts:
 * - Class and Object
 * - Constructors
 * - Encapsulation
 * - Constructor Validation
 * - Getter Methods
 * - Object Composition
 * - Has-A Relationship
 * - Method Calling
 *
 * Relationship:
 *
 * Car HAS-A Engine
 *
 * Car
 *  |
 *  └── Engine
 *
 * The Car object receives an Engine object through its constructor
 * and uses that Engine to start the car.
 */


// Engine class represents the engine of a car.
class Engine {

    // Private field demonstrates encapsulation.
    private int engineNumber;


    /*
     * Constructor:
     * Initializes the engine number.
     *
     * @param engineNumber unique number of the engine
     */
    public Engine(int engineNumber) {

        if (engineNumber > 0) {
            this.engineNumber = engineNumber;

        } else {
            this.engineNumber = 0;

            System.out.println(
                    "Invalid engine number, default value assigned."
            );
        }
    }


    /*
     * Getter method:
     * Returns the engine number.
     *
     * @return engine number
     */
    public int getEngineNumber() {
        return engineNumber;
    }


    /*
     * Starts the engine.
     */
    public void start() {

        System.out.println(
                "Engine with engine number "
                        + getEngineNumber()
                        + " is started."
        );
    }
}


// Car class represents a car.
class Car {

    // Private fields demonstrate encapsulation.
    private String brand;
    private String model;
    private Engine engine;


    /*
     * Constructor:
     * Initializes the car's brand, model, and engine.
     *
     * @param brand  car brand
     * @param model  car model
     * @param engine Engine object associated with the car
     */
    public Car(
            String brand,
            String model,
            Engine engine
    ) {

        // Validate brand.
        if (brand != null && !brand.isBlank()) {

            this.brand = brand;

        } else {

            this.brand = "Unknown";

            System.out.println(
                    "Invalid brand, default value assigned."
            );
        }


        // Validate model.
        if (model != null && !model.isBlank()) {

            this.model = model;

        } else {

            this.model = "Unknown";

            System.out.println(
                    "Invalid model, default value assigned."
            );
        }


        /*
         * Engine is required for a Car.
         * Therefore, null is not allowed.
         */
        if (engine == null) {

            throw new IllegalArgumentException(
                    "Engine cannot be null."
            );
        }

        this.engine = engine;
    }


    /*
     * Getter method:
     * Returns the car brand.
     *
     * @return car brand
     */
    public String getBrand() {
        return brand;
    }


    /*
     * Getter method:
     * Returns the car model.
     *
     * @return car model
     */
    public String getModel() {
        return model;
    }


    /*
     * Getter method:
     * Returns the Engine object.
     *
     * @return engine object
     */
    public Engine getEngine() {
        return engine;
    }


    /*
     * Starts the car.
     *
     * The Car delegates engine-starting work
     * to its Engine object.
     */
    public void start() {

        System.out.println(
                getBrand()
                        + " "
                        + getModel()
                        + " started."
        );

        engine.start();
    }


    /*
     * Displays complete car details.
     */
    public void displayCarDetails() {

        System.out.println(
                "-------- Car Details --------"
        );

        System.out.println(
                "Brand : " + getBrand()
        );

        System.out.println(
                "Model : " + getModel()
        );

        System.out.println(
                "Engine Number : "
                        + getEngine().getEngineNumber()
        );

        System.out.println();
    }
}


// Main class contains the program entry point.
public class CarEngineComposition {

    public static void main(String[] args) {

        /*
         * Create an Engine object.
         */
        Engine engine = new Engine(2345);


        /*
         * Pass the Engine object to the Car constructor.
         *
         * This creates the relationship:
         *
         * Car HAS-A Engine
         */
        Car car = new Car(
                "BMW",
                "M5",
                engine
        );


        // Display car information.
        car.displayCarDetails();


        // Start the car and its engine.
        car.start();
    }
}
