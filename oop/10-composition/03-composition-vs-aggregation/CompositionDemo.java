/*
 * Program: CompositionDemo
 *
 * Purpose:
 * Demonstrates Composition (strong HAS-A relationship)
 * between Car and Engine.
 *
 * Concepts Demonstrated:
 * - Class and Object
 * - Constructors
 * - Encapsulation
 * - final fields
 * - Constructor Validation
 * - Composition
 * - HAS-A Relationship
 * - Method Delegation
 *
 * Relationship:
 *
 *       Car
 *        |
 *        | HAS-A
 *        ↓
 *      Engine
 *
 * In this example, the Car creates its own Engine.
 * Therefore, the Engine's lifecycle is controlled by the Car.
 */


// Represents an engine of a car.
class Engine {

    /*
     * final means the engine number can be assigned only once.
     * It cannot be changed after construction.
     */
    private final int engineNumber;


    /*
     * Constructor:
     * Creates an Engine object with a valid engine number.
     *
     * @param engineNumber unique engine number
     *
     * @throws IllegalArgumentException
     *         if engineNumber is less than or equal to zero
     */
    public Engine(int engineNumber) {

        if (engineNumber <= 0) {

            throw new IllegalArgumentException(
                    "Engine number must be greater than 0."
            );
        }

        this.engineNumber = engineNumber;
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
                "Engine #" + engineNumber + " started."
        );
    }
}


// Represents a car.
class Car {

    // final fields cannot be reassigned after construction.
    private final String brand;
    private final String model;

    /*
     * Strong HAS-A relationship.
     *
     * A Car owns an Engine.
     */
    private final Engine engine;


    /*
     * Constructor:
     * Creates a Car and its Engine.
     *
     * @param brand        car brand
     * @param model        car model
     * @param engineNumber engine number
     *
     * @throws IllegalArgumentException
     *         if brand or model is invalid
     *         or engine number is invalid
     */
    public Car(
            String brand,
            String model,
            int engineNumber
    ) {

        // Validate brand.
        if (brand == null || brand.isBlank()) {

            throw new IllegalArgumentException(
                    "Brand cannot be null or blank."
            );
        }


        // Validate model.
        if (model == null || model.isBlank()) {

            throw new IllegalArgumentException(
                    "Model cannot be null or blank."
            );
        }


        this.brand = brand;
        this.model = model;


        /*
         * Composition:
         *
         * The Car creates its own Engine.
         *
         * The Engine is not passed from outside.
         */
        this.engine = new Engine(engineNumber);
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
     * Returns the engine number without exposing
     * the Engine object itself.
     *
     * This keeps the internal Engine object encapsulated.
     *
     * @return engine number
     */
    public int getEngineNumber() {

        return engine.getEngineNumber();
    }


    /*
     * Starts the car.
     *
     * The Car delegates the engine-starting operation
     * to its internal Engine object.
     */
    public void start() {

        System.out.println(
                "Starting " + brand + " " + model + "..."
        );

        engine.start();

        System.out.println(
                brand
                        + " "
                        + model
                        + " started successfully."
        );
    }


    /*
     * Displays complete car details.
     */
    public void displayCarDetails() {

        System.out.println(
                "-------- Car Details --------"
        );

        System.out.println(
                "Brand         : " + brand
        );

        System.out.println(
                "Model         : " + model
        );

        System.out.println(
                "Engine Number : " + getEngineNumber()
        );

        System.out.println();
    }
}


/*
 * Main class:
 * Demonstrates the Composition relationship
 * between Car and Engine.
 */
public class CompositionDemo {

    public static void main(String[] args) {

        /*
         * Create a Car object.
         *
         * The Car constructor internally creates
         * its own Engine object.
         */
        Car car = new Car(
                "BMW",
                "M5",
                2345
        );


        // Display car information.
        car.displayCarDetails();


        // Start the car.
        car.start();
    }
}
