package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Madhu");
        plane.onboard("Jessi");
        plane.onboard("Anju");
        System.out.println("Take off time is"+plane.takeOff());
        System.out.println("Passengers "+plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landed Time "+plane.getLastTimeLanded());
    }
}
