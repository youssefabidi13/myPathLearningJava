package ma.ac.ensate.tp;

import javax.print.attribute.standard.Destination;
import java.awt.*;

public class Compte {
    //fields
    String nomCmpt;

    int solde= 0;

    public Compte(String nomCmpt) {
        this.nomCmpt = nomCmpt;
    }

    void deposer(int montant){
        solde +=montant;
        System.out.println("Votre dépot a été bien effectué dans le compte "+this.nomCmpt);
    }
    void retirer(int montant){
        if(solde<montant){
            System.out.println("Vous n'avez pas suffisement de solde pour effectuer cette operation");
        }else{
            solde-=montant;
            System.out.println("Votre retrait a été bien effectué du compte: "+this.nomCmpt);
        }
    }
    //elle intervient deux compte il retire du compte actuel  et depose dans l'autre
    void viverVers(int montant , Compte destination){
        if(montant>this.solde){
            System.out.println("Vous n'avez pas suffisement de solde pour effectuer cette operation");
        }else{
            this.retirer(montant);
            destination.deposer(montant);
            System.out.println("Votre versement a été bien effectué à partir du compte: "+this.nomCmpt+" vers le compte: "+destination.nomCmpt);
        }

    }
    void afficher(){
        System.out.println("Ce compte est du titulaire :" + nomCmpt + " qui a pour solde :" +solde+" Euros");
    }
}
