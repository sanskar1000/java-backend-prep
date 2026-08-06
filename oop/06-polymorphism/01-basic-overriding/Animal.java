/**
 * ============================================================
 * Class : Animal
 *
 * Description:
 * Represents a generic animal.
 * This is the parent class that contains common
 * properties and behaviors shared by all animals.
 *
 * Concepts Demonstrated:
 * ✔ Parent Class
 * ✔ Inheritance
 * ✔ Method Overriding
 * ✔ Runtime Polymorphism
 * ============================================================
 */
class Animal {

    /** Name of the animal. */
    String name;

    /**
     * Produces a generic sound.
     *
     * Child classes can override this method
     * to provide their own implementation.
     */
    void sound() {
        System.out.println("Animal makes a sound.\n");
    }

    /**
     * Displays the name of the animal.
     */
    public void displayName() {
        System.out.println("Animal Name : " + name);
    }
}
