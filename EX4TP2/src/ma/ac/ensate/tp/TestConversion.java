package ma.ac.ensate.tp;

public class TestConversion {
    public static void main(String[] args)
    {
        Conversion x = new Conversion(15,11,40);
        x.getDec();
        Conversion y = new Conversion(16.1231);
        System.out.println(y.getDec());
        System.out.println("La conversion de nombre decimale  en nombre sexagésimaux est : "+ y.getH() +"H:"+y.getM()+"M:"+y.getS()+"S");
    }
}
