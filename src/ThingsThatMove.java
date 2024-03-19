/**
 * ClassName: ThingsThatMove
 * @Author: Tee Willie
 * @Version: 1.0
 * Course: ITEC 2140
 * Date: March 10,2024
 */
// Main class to execute the program
public class ThingsThatMove {
    public static void main(String[] args) {
        // Create an array to store instances of Movement
        Movement[] movingThings = new Movement[3];
        // Create instances of Airplane and Bird and store them in the array
        movingThings[0] = new Airplane("Boeing 787", 2018);
        movingThings[1] = new Bird("Falcon");
        movingThings[2] = new Bird("Sparrow");

        // Iterate through the array and display information about each moving thing
        for (Movement movingThing : movingThings) {
            // Display the type of moving thing
            System.out.println(movingThing.toString() + ": ");
            // Invoke the fly() method specific to each moving thing
            movingThing.fly();
            // Invoke the walk() method specific to each moving thing
            movingThing.walk();
            // Invoke the jump() method specific to each moving thing
            movingThing.jump();
            // Add a blank line for separation
            System.out.println();
        }
    }
}
