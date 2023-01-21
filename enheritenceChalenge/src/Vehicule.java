public class Vehicule {
    //fields
    private String name ;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    //getters

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    //constructors
    public Vehicule(String name,String size){
        this.name=name;
        this.size=size;
        this.currentVelocity=0;
        this.currentDirection=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicule.steer(): Steering at "+ currentDirection+" degrees.");
    }
    public void move(int velocity,int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicule.move() : Moving at "+ currentVelocity + "in direction " +currentDirection);
    }
    public void stop(){
        this.currentDirection=0;
    }
}
