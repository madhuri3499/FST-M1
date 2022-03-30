package activities;

public class Activity1 {
    public static void main(String[] args){
        Car newcar = new Car();
        newcar.make = 2014;
        newcar.color = "Black";
        newcar.transmission = "Manual";
        newcar.displayCharacteristics();
        newcar.accelerate();
        newcar.brake();
    }
}
