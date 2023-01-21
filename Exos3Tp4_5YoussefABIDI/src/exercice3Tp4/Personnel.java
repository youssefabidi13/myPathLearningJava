package exercice3Tp4;

import java.util.ArrayList;

public class Personnel {
    private ArrayList<Employe> employes;

    public Personnel() {
        this.employes = new ArrayList<Employe>();
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    public void afficherTousLesEmployes() {
        for (Employe e : employes) {
            System.out.println(e.toString());
        }
    }

    public double calculerSommeSalaire() {
        double somme = 0;
        for (Employe e : employes) {
            somme += e.calculateSalary();
        }
        return somme;
    }
}