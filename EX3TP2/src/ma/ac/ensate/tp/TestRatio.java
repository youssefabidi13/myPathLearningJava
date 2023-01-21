package ma.ac.ensate.tp;

import ma.ac.ensate.tp.Ratio;

public class TestRatio {
    public static void main(String[] args) {
        Ratio b = new Ratio(1,0);
        Ratio c = new Ratio(2,6);
        System.out.println(b.egale(c));
        b.addition(c);
        System.out.println(b.toString());
        Ratio d = new Ratio(1,3);
        Ratio e = new Ratio(1,3);
        System.out.println(d.egale(e));
        d.addition(e);
        System.out.println(d.toString());
        Ratio f = new Ratio(1,3);
        Ratio g = new Ratio(5,6);
        System.out.println(f.plusGrand(g));
        f.produit(g);
        System.out.println(f.toString());
    }
}
