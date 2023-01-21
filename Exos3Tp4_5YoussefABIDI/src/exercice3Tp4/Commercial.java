package exercice3Tp4;

import exercice3Tp4.Employe;

public class Commercial extends Employe {
    private int ventes;

    public Commercial(String nom, int matricule, int indice, double valeur, int ventes) {
        super(nom, matricule, indice, valeur);
        this.ventes = ventes;
    }

    public int getVentes() {
        return this.ventes;
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (this.ventes / 10);
    }
}