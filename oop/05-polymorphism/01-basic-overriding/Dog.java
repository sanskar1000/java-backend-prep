/**
 * ============================================================
 * Class : Dog
 *
 * Description:
 * Represents a Dog.
 *
 * Dog inherits all common properties from
 * the Animal class and overrides the sound()
 * method to provide dog-specific behavior.
 *
 * Concepts Demonstrated:
 * ✔ Inheritance
 * ✔ Method Overriding
 * ✔ Runtime Polymorphism
 * ============================================================
 */
class Dog extends Animal {

    /** Breed of the dog. */
    String breed;

    /**
     * Produces the sound made by a dog.
     *
     * This method overrides the sound()
     * method defined in the Animal class.
     */
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    /**
     * Displays the breed of the dog.
     */
    public void displayBreed() {
        System.out.println("Breed : " + breed);
    }
}
