public class Cercle extends Forme{
    double rayon;
    public Cercle(double r){
        this.rayon=r;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "surface=" + this.getSurface()+"cm2" +
                '}';
    }

    @Override
    public double getSurface(){
        return Math.PI*rayon*rayon;
    }
}