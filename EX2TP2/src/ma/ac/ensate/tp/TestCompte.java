package ma.ac.ensate.tp;

public class TestCompte {
    public static void main(String[] args) {
        Compte youssef = new Compte("Youssef");
        Compte ali = new Compte("ali");
        youssef.deposer(500);
        ali.deposer(1000);
        ali.retirer(10);
        youssef.viverVers(75,ali);
        youssef.afficher();
        ali.afficher();

    }
}
