package exercice3Tp4;

public class Employe {
    private String name;
    private int matricule;
    private int salaryIndex;
    private double salaryValue;

    public Employe(String name, int matricule, int salaryIndex, double salaryValue) {
        this.name = name;
        this.matricule = matricule;
        this.salaryIndex = salaryIndex;
        this.salaryValue = salaryValue;
    }

    public String getName() {
        return name;
    }

    public int getMatricule() {
        return matricule;
    }

    public double getSalaryIndex() {
        return salaryIndex;
    }

    public double getSalaryValue() {
        return salaryValue;
    }

    public double calculateSalary() {
        return salaryIndex * salaryValue;
    }
    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", matricule=" + matricule +
                ", salaryIndex=" + salaryIndex +
                ", salaryValue=" + salaryValue +
                ",Salary:" + calculateSalary() +
                '}';
    }
}