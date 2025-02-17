// Define the Test class with the main method
public class Main {
    public static void main(String[] args) {
        // Create instances of different ducks
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        // Test the behaviors
        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        ((RubberDuck) rubberDuck).squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        // Wooden Duck is mute, so no additional behavior

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
}
