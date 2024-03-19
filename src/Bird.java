/**
 * ClassName: Bird
 * @Author: Tee Willie
 * @Version: 1.0
 * Course: ITEC 2140
 * Date: March 18, 2024
 */
// implements the Movement interface
class Bird implements Movement {
    private String type; // Represents the type of bird

    // Constructor for the Bird class
    public Bird(String type) {
        this.type = type;
    }

    // Getter and setter methods for the type attribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementation of the fly() method for the Bird class
    @Override
    public void fly() {
        System.out.println("I gracefully take flight with my wings spread wide.");
    }

    // Implementation of the walk() method for the Bird class
    @Override
    public void walk() {
        System.out.println("I stroll on the ground, occasionally hopping around.");
    }

    // Implementation of the jump() method for the Bird class
    @Override
    public void jump() {
        System.out.println("I execute swift leaps to cover short distances.");
    }

    // Override the toString() method to provide a string representation of the Bird object
    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}
