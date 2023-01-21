public class TestForme{
    public static void main(String[] args){
        Forme[] figures = new Forme[3];
        figures[0] = new Rectangle(5,3);//Creation d'un rectangle de 5 cm de longueur et de 3 de largeur
        figures[1] = new Carre(8.2);//Creation d'un carré de 8.2 de coté
        figures[2] = new Cercle(4.1);//Creation d'un cercle de 4.1 de rayon
        for(Forme fo : figures){
            System.out.println(fo.toString());
        }

    }
}