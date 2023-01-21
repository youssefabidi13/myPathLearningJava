package exercice3Tp4;

public class Responsable extends Employe {
    private Employe[] subordinates;

    public Responsable(String name, int matricule, int salaryIndex, double salaryValue, Employe[] subordinates) {
        super(name, matricule, salaryIndex, salaryValue);
        this.subordinates = subordinates;
    }

    public Employe[] getSubordinates() {
        return subordinates;
    }

    public void displayDirectSubordinates() {
        System.out.println("Direct subordinates for " + this.getName() + ":");
        for (Employe subordinate : subordinates) {
            System.out.println(subordinate.toString());
        }
    }

    public void displayAllSubordinates() {
        System.out.println("All subordinates for " + this.getName() + ":");
        for (Employe subordinate : subordinates) {
            System.out.println(subordinate.toString());
            if (subordinate instanceof Responsable) {
                ((Responsable) subordinate).displayAllSubordinates();
            }
        }
    }
}
