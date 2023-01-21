public class Personne {
    private int id;
    private String nomComplet;
    private double salaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Personne() {
    }

    public Personne(int id, String nomComplet, double salaire) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.salaire = salaire;
    }

    public Personne(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }
    Personne(Personne p) {
        this.id = p.id;
        this.nomComplet = p.nomComplet;
        this.salaire = p.salaire;
    }

    public void affichePersonne() {
        System.out.println("Personne{" +
                "id=" + id +
                ", nomComplet='" + nomComplet + '\'' +
                ", salaire=" + salaire +
                '}');
    }
}
