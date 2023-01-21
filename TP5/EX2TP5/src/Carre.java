public class Carre extends Forme{
    double cote;
    public Carre(double c){
        this.cote=c;
    }

    @Override
    public String toString() {
        return "Carre{" +
                "surface=" + this.getSurface()+"cm2" +
                '}';
    }

    @Override
    public double getSurface(){
        return cote*cote;
    }
}