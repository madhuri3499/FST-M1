package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
    public int gears;
    public int CurrentSpeed;
    //the Bicycle class has one constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.CurrentSpeed = currentSpeed;
    }
    public void applyBrake(int decrement){
        CurrentSpeed-= decrement;
    }
    public void speedUp(int increment){
        CurrentSpeed+=increment;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + CurrentSpeed);
    }
}
