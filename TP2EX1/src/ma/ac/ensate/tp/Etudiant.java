package ma.ac.ensate.tp;

public class Etudiant {
    private int code;
    private String nom;
    private String prenom;
    //par default
    public Etudiant(){
        System.out.println("Empty constructor called");
    }
    //constructor qui accepte nom
    public Etudiant(String nom){
        this(1234,nom,"ton prenom");
    }
    // constructor qui accepte tous les parametres
    public Etudiant(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }
    //constructor par copie
    Etudiant(Etudiant etudiant) {
        nom = etudiant.nom;
        code = etudiant.code;
        prenom = etudiant.prenom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "l'Etudiant dont le code est :<<" + this.code +">> son nom est <<"+ this.nom+ ">>, son prenom est <<"+this.prenom+">>.";
    }
}
