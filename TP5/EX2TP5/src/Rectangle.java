public class Rectangle extends Forme{
    double longueur, largeur;
    public Rectangle(double l, double lg){
        this.longueur=l;
        this.largeur=lg;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "surface=" + this.getSurface()+"cm2" +
                '}';
    }

    @Override
    public double getSurface(){
        return longueur*largeur;
    }

}