
class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> starEngine()";
    }
    public String accelerat(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsubishi extends  Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Mitsubishi ->  startEngine()";
    }

    @Override
    public String accelerat() {
        return "Mitsubishi -> accelerat()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake() ";
    }

}
class Holden extends  Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Holden ->  startEngine()";
    }

    @Override
    public String accelerat() {
        return "Holden -> accelerat()";
    }

    @Override
    public String brake() {
        return "Holden -> brake() ";
    }
}
class Ford extends  Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Ford ->  startEngine()";
    }

    @Override
    public String accelerat() {
        return "Ford -> accelerat()";
    }

    @Override
    public String brake() {
        return "Ford -> brake() ";
    }
}
public class Main {
    public static void main(String[] args){
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerat());
        System.out.println(car.brake());
        Mitsubishi mitsubishi = new Mitsubishi(8,"mistsubishi");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerat());
        System.out.println(mitsubishi.brake());
        Ford ford = new Ford(8,"Ford");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerat());
        System.out.println(ford.brake());
        Holden holden = new Holden(6,"Holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerat());
        System.out.println(holden.brake());
    }

}
