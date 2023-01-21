import jdk.jshell.execution.Util;

public class Utilisateur extends Personne{
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur() {
    }

    public Utilisateur(int id, String nomComplet, double salaire, String login, String password) {
        super(id, nomComplet, salaire);
        this.login = login;
        this.password = password;
    }
    Utilisateur(Utilisateur u){
        this.login = u.login;
        this.password = u.password;
        this.setId(u.getId());
        this.setSalaire(u.getSalaire());
        this.setNomComplet(u.getNomComplet());
    }

    public void AfficheUtilisateur() {
        System.out.println("Utilisateur{" +
                "nom complet='" + super.getNomComplet() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", salaire='" + super.getSalaire() + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}');
    }
}
