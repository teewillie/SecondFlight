/**
 * ClassName: Airplane
 * @Author: Tee Willie
 * @Version: 1.0
 * Course:ITEC 2140
 * Date: March 10, 2024
 */
// The Airplane class implements the Movement interface
class Airplane implements Movement {
    private String model; // Holds the model of the airplane
    private int yearBuilt; // Indicates the year the airplane was built

    // Constructor for the Airplane class
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getter and setter methods for the model attribute
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for the yearBuilt attribute
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Implementation of the fly() method for the Airplane class
    @Override
    public void fly() {
        System.out.println("I soar through the skies with my powerful engines.");
    }

    // Implementation of the walk() method for the Airplane class
    @Override
    public void walk() {
        System.out.println("I move along the runway gracefully.");
    }

    // Implementation of the jump() method for the Airplane class
    @Override
    public void jump() {
        System.out.println("I stay grounded; jumping is not in my capabilities.");
    }

    // Override the toString() method to provide a string representation of the Airplane object
    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}