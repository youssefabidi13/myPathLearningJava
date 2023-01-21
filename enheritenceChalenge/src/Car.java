public class Car extends Vehicule{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isMannual;
    private int currentGear;

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isMannual() {
        return isMannual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public Car(String name, String size, int wheels, int doors, int gears, boolean isMannual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isMannual = isMannual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Chaged to " + this.currentGear + "gear.");
    }
    public void changeVelocity(int speed, int direction){
         move(speed,direction);
         System.out.println("Car.changeVelocity() : Velocity " + speed + "direction " + direction );
    }

}
