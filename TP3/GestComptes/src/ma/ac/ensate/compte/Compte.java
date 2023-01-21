package ma.ac.ensate.compte;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Compte {
    private int noCompte;
    private String titulaire;
    private double solde;
    Date date = new Date();
    SimpleDateFormat dt = new SimpleDateFormat("E MMM d hh:mm:ss Y");

    public Compte() {

    }

    public Compte(int noCompte, String titulaire, double solde) {
        this.noCompte = noCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte[" +
                "noCompte<< " + noCompte +
                " >>, titulaire << " + titulaire +
                " >>, solde au << " + dt.format(date) + " >> : << " + solde +
                " >> ]";
    }
}
