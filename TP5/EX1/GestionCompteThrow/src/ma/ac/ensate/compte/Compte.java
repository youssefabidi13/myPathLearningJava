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
    public void retirer(double montant) throws Exception{
        if(this.solde >= montant){
            this.solde -= montant;
        }
        else{
            throw new Exception("Le solde n'est pas suffisant pour retirer ce montant");
        }
    }
    void deposer(int montant){
        solde +=montant;
        System.out.println("Votre dépot a été bien effectué dans le compte "+this.titulaire);
    }
    void viverVers(int montant , Compte destination)throws Exception{
        if(montant>this.solde){
            throw new Exception("Vous n'avez pas suffisement de solde pour effectuer cette operation");
        }else{
            try{
                this.retirer(montant);
            }catch(Exception e){
                System.out.println(e);
            }
            destination.deposer(montant);
            System.out.println("Votre versement a été bien effectué à partir du compte: "+this.titulaire+" vers le compte: "+destination.titulaire);
        }

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
