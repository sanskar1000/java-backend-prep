/**
 * ------------------------------------------------------------
 * Program Name : WorkerISPDemo
 * Topic        : Interface Segregation Principle (ISP)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Interface Segregation Principle.
 *
 * ISP states:
 *
 * "Clients should not be forced to depend on interfaces
 * they do not use."
 *
 * Instead of creating one large Worker interface containing
 * work(), eat(), and sleep(), the responsibilities are divided
 * into smaller, focused interfaces.
 *
 * Workable  -> work()
 * Eatable   -> eat()
 * Sleepable -> sleep()
 *
 * A HumanWorker can perform all three activities.
 * A RobotWorker only needs to implement Workable because
 * a robot does not need to eat or sleep.
 *
 * Concepts Used:
 * - Interfaces
 * - Multiple Interface Implementation
 * - Abstraction
 * - Polymorphism
 * - Interface Segregation Principle
 *
 * ------------------------------------------------------------
 */


/**
 * Represents the ability to work.
 */
interface Workable {

    /**
     * Performs work.
     */
    void work();
}


/**
 * Represents the ability to eat.
 */
interface Eatable {

    /**
     * Performs eating behavior.
     */
    void eat();
}


/**
 * Represents the ability to sleep.
 */
interface Sleepable {

    /**
     * Performs sleeping behavior.
     */
    void sleep();
}


/**
 * Represents a human worker.
 *
 * A human can work, eat, and sleep.
 */
class HumanWorker
        implements Workable, Eatable, Sleepable {

    @Override
    public void work() {

        System.out.println(
                "Human is working."
        );
    }

    @Override
    public void eat() {

        System.out.println(
                "Human is eating."
        );
    }

    @Override
    public void sleep() {

        System.out.println(
                "Human is sleeping."
        );
    }
}


/**
 * Represents a robot worker.
 *
 * A robot only needs the Workable interface.
 *
 * It is NOT forced to implement Eatable or Sleepable.
 */
class RobotWorker implements Workable {

    @Override
    public void work() {

        System.out.println(
                "Robot is working."
        );
    }
}


/**
 * Demonstrates the Interface Segregation Principle.
 */
public class WorkerISPDemo {

    public static void main(String[] args) {

        HumanWorker human =
                new HumanWorker();

        RobotWorker robot =
                new RobotWorker();

        // Human behaviors
        human.work();
        human.eat();
        human.sleep();

        System.out.println();

        // Robot only performs work
        robot.work();
    }
}
