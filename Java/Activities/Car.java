package activities;
public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        this.tyres=4;
        this.doors =4;
    }
    void displayCharacteristics(){
        System.out.println(this.color);
        System.out.println(this.transmission);
        System.out.println(this.make);
        System.out.println(this.tyres);
        System.out.println(this.doors);
    }
    void accelerate(){
        System.out.println("The car is moving forward");
    }
    void brake(){
        System.out.println("The car has stopped");
    }
}
